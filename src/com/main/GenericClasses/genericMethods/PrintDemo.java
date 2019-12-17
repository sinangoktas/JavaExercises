package com.main.GenericClasses.genericMethods;

import java.awt.Color;
import java.util.ArrayList;

/** 
   This class demonstrates a generic method for printing arrays.
*/
public class PrintDemo
{
   public static <E> void print(E[] a)
   {
      for (E e : a)
      {
         System.out.print(e + " ");
      }
      System.out.println();
   }

   public static void print(int[] a)
   {
      for (int e : a)
      {
         System.out.print(e*e + " ");
      }
      System.out.println();
   }

   public static <E> String print(ArrayList<E> a)
   {
     return a.toString();
   }

   public static void main(String[] args)
   {
      String[] words = { "Mary", "had", "a", "little", "lamb" };

      Color[] colors = { Color.RED, Color.GREEN, Color.BLUE, Color.YELLOW };

      int[] squares = { 1, 4, 9, 16, 25, 36 };

      print(words); // Calls print<String>
      print(colors); // Calls print<Color>
      print(squares); // Calls non-generic print

      ArrayList<Integer> arr = new ArrayList<>();
      arr.add(1); arr.add(3); arr.add(5);

      System.out.println(print(arr)); // Calls print(ArrayList<E>)
   }
}
