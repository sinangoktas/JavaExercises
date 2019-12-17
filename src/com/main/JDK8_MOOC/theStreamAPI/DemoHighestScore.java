package com.main.JDK8_MOOC.theStreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;

public class DemoHighestScore {


    public static void main(String[] args) {

        Student s1 = new Student(2010, 50);
        Student s2 = new Student(2011, 60);
        Student s3 = new Student(2011, 75);
        Student s4 = new Student(2010, 60);


        List<Student> students = new ArrayList<>();
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);

        Optional<Double> highScore = students.stream()
                .filter(s -> s.getGradYear() == 2010)
                .map(s -> s.getScore()) // map() create a stream of Double objects
                .max(Double::compare); // unboxing each Double objects

        System.out.println("Highest score in 2010 is " + highScore.get());

        OptionalDouble highScore2 = students.stream()
                .filter(s -> s.getGradYear() == 2011)
                .mapToDouble(s -> s.getScore()) // creates stream of primitive doubles
                .max(); // no need unboxing

        System.out.println("Highest score in 2011 is " + highScore2.getAsDouble());

        // mapToObj() if you want to convert primitives to objects

    }
}
