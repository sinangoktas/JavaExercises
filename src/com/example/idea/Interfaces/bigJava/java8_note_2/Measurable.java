package com.example.idea.Interfaces.bigJava.java8_note_2;

public interface Measurable
{
   double getMeasure(); // An abstract method
   
   default boolean smallerThan(Measurable other)
   {
      return getMeasure() < other.getMeasure();
   }
}
