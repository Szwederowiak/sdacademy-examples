package pl.sdacademy.annotations.own_annotation;

import java.lang.reflect.InvocationTargetException;

public class Main {
  public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
    //TODO:
    TestClass test = new TestClass();
    BenchmarkProcessor benchmarkProcessor = new BenchmarkProcessor();

    benchmarkProcessor.benchmark(test);
  }
}
