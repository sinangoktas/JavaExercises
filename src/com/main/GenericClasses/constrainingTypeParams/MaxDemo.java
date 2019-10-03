package com.main.GenericClasses.constrainingTypeParams;

public class MaxDemo
{
   public static <E extends Comparable<E>> E max(E[] a)
   {
      E largest = a[0];
      for (int i = 1; i < a.length; i++)
      {
         if (a[i].compareTo(largest) > 0)
         {
            largest = a[i];
         }
      }
      return largest;
   }

}
