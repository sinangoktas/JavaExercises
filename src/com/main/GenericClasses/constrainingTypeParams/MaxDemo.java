package com.main.GenericClasses.constrainingTypeParams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

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

   public static void main(String[] args) {

      MaxDemo mxdm = new MaxDemo();

      Integer[] intArr = new Integer[]{1,2,3,4};
      System.out.println(mxdm.max(intArr));

      String[] strArr = new String[]{"a", "c", "b"};
      System.out.println(mxdm.max(strArr));

   }












}
