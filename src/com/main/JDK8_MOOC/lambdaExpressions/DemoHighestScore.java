package com.main.JDK8_MOOC.lambdaExpressions;

import java.util.ArrayList;
import java.util.List;

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

        double highestScore = 0;

        for (Student s : students) {
            if (s.gradYear == 2011) {
                if (s.getScore() > highestScore) {
                    highestScore = s.getScore();
                }
            }

        }

        System.out.println("Highest score in 2011 is " + highestScore);

    }
}
