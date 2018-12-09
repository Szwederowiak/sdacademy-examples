package pl.sdacademy.annotations.own_annotation;


public class TestClass {
  int test;

  @BenchmarkTime
  void test1 () throws InterruptedException {
    Thread.sleep(1500);
  }

  @BenchmarkTime
  void test2 () throws InterruptedException {
    Thread.sleep(2000);
  }

  void test3 () throws InterruptedException {
    Thread.sleep(500);
  }
}
