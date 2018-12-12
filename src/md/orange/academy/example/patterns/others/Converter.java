package md.orange.academy.example.patterns.others;

public interface Converter<T, R> {

  R convert(T input);

}
