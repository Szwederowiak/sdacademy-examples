package pl.sdacademy.annotations.own_annotation;

import java.lang.annotation.*;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface BenchmarkTime {

}
