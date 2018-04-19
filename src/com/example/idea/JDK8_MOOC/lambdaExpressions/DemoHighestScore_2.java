package com.example.idea.JDK8_MOOC.lambdaExpressions;

import java.util.*;

public class DemoHighestScore_2 {

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

        Optional<Double> highestScore = students.stream()
                .filter(s -> s.getGradYear() == 2011)
                .map(s -> s.getScore())
                .max(Double::compareTo);
        if(highestScore.isPresent())
            System.out.println("Highest score in 2011 is " + highestScore.get());


    }

}
