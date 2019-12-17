package com.main.Interfaces.java8_note_3_2;

/**
   This interface provides a default method name, just like Person.
*/
public interface Named
{
   default String name() { return "(NONE)"; }
}
