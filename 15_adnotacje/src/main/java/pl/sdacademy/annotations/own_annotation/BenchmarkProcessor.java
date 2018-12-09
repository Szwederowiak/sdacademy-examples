package pl.sdacademy.annotations.own_annotation;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import java.time.LocalTime;

public class BenchmarkProcessor {
  long time;

  void benchmark(Object obj) throws InvocationTargetException, IllegalAccessException {
    Method[] methods = obj.getClass().getDeclaredMethods();

    for (Method method : methods) {
      if (method.isAnnotationPresent(BenchmarkTime.class)) {

        time = System.currentTimeMillis();
        method.invoke(obj);
        System.out.println(String.format("Method %s takes %d ms to execute", method.getName(), System.currentTimeMillis() - time));
      }
    }
  }
}
