package com.main.CollectionsFramework.hashCodeExample;

import java.util.Objects;

/**
   A country with a name and area.
*/
public class Country {

   private String name;
   private double area;

   public Country(String aName, double anArea) {

      this.name = aName;
      this.area = anArea;
   }

   public String getName() {
      return this.name;
   }

   public double getArea() {
      return this.area;
   }

   @Override
   public boolean equals(Object o) {
      Country other = (Country) o;
      return this.area == other.area && this.name.equals(other.name);
   }

   @Override
   public int hashCode() {
      return Objects.hash(name, area);
   }
}



