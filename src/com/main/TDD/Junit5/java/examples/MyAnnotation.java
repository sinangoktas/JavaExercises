package com.main.TDD.Junit5.java.examples;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@DisplayName("This is the nice method")
@Tag("theTag")
public @interface MyAnnotation {
}
