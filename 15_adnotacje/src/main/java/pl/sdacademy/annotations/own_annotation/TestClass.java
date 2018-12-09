package pl.sdacademy.annotations.own_annotation;


public class TestClass {
  int test;

  @BenchmarkTime
  void test1 () throws InterruptedException {
    System.out.println("asdasdASd asD Aasdasd asd as das dasd asdasd asda sda sdasd as dasd ");
  }

  @BenchmarkTime
  void test2 () throws InterruptedException {
    System.out.println("qwe");
  }

  void test3 () throws InterruptedException {
    Thread.sleep(500);
  }
}
