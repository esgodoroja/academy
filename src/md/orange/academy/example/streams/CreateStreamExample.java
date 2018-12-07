package md.orange.academy.example.streams;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CreateStreamExample {

  static File createAndLoadFile() throws FileNotFoundException {
    File file = new File("streamFromFile.tmp");
    file.deleteOnExit();
    PrintWriter out = new PrintWriter(file);
    out.println("values1");
    out.println("values2");
    out.println("values3");
    out.close();
    return file;
  }


  public static void main(String[] args) throws Exception {

    // Empty stream
    Stream emptyStream = Stream.empty();
    System.out.println("emptyStream = " + emptyStream.collect(Collectors.toList()));

    // Stream from values
    Stream<String> streamFromValues = Stream.of("value1", "value2", "value3");
    System.out.println("streamFromValues = " + streamFromValues.collect(Collectors.toList()));

    // Stream from Array
    String[] array = {"value1", "value2", "value3"};

    Stream<String> streamFromArrays = Arrays.stream(array);
    System.out.println("streamFromArrays = "
        + streamFromArrays.collect(Collectors.toList()));

    Stream<String> streamFromArrayUseOf = Stream.of(array);
    System.out.println("streamFromArrayUseOf = "
        + streamFromArrayUseOf.collect(Collectors.toList()));

    // Stream from File
    File file = createAndLoadFile();
    Stream<String> streamFromFiles = Files.lines(Paths.get(file.getAbsolutePath()));
    System.out.println("streamFromFiles = "
        + streamFromFiles.collect(Collectors.toList()));

    // Stream from Collection
    Collection<String> collection = Arrays.asList("value1", "value2", "value3");

    Stream<String> streamFromCollection = collection.stream();
    System.out.println("streamFromCollection = "
        + streamFromCollection.collect(Collectors.toList()));

    // IntStream from char
    IntStream streamFromString = "123".chars();
    System.out.print("streamFromString = ");
    streamFromString.forEach(
        (e) -> System.out.print(e + " , "));
    System.out.println();

    //Stream.builder
    Stream.Builder<String> builder = Stream.builder();
    Stream<String> streamFromBuilder = builder.add("value1").add("value2").add("value3").build();
    System.out.println("streamFromBuilder = "
        + streamFromBuilder.collect((Collectors.toList())));

    // Creates an infinite Stream
    Stream<Integer> streamFromIterate = Stream.iterate(1, n -> n + 2);
    System.out.println("streamFromIterate = "
        + streamFromIterate
        .limit(3)
        .collect(Collectors.toList()));

    // Stream.generate
    Stream<String> streamFromGenerate = Stream.generate(() -> "value1");
    System.out.println("streamFromGenerate = "
        + streamFromGenerate
        .limit(3)
        .collect(Collectors.toList()));

    // Create a parallel stream
    Stream<String> parallelStream = collection.parallelStream();
    System.out.println("parallelStream = " + parallelStream
        .collect(Collectors.toList()));
  }
}
