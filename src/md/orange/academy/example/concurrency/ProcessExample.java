package md.orange.academy.example.concurrency;

public class ProcessExample {

  private static final String PATH = "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe";

  public static void main(String[] args) throws Exception {

    Process process = Runtime.getRuntime().exec(PATH);

//    Process builder = new ProcessBuilder(PATH).start();

    System.out.println("process.isAlive() = " + process.isAlive());

    Thread.sleep(5000);
    process.destroy();

    System.out.println("process.isAlive() = " + process.isAlive());

    System.out.println("main is dead");



  }
}
