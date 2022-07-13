package com.main.ObjectClass;

public class ObjectClassMethods {

    int id;
    String name;

    public ObjectClassMethods(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {

        return "Instance with id " + id;
    }

    public boolean equals(Object otherObject)  {
        ObjectClassMethods other = (ObjectClassMethods) otherObject;
        return name.equals(other.name)
                && id == other.id;
    }

    public static void main(String[] args) {

        ObjectClassMethods demo = new ObjectClassMethods(123, "Sinan");
        ObjectClassMethods demoX = new ObjectClassMethods(123, "Sinan");
        System.out.println(demo.equals(demoX));

        // instanceof returns boolean
        System.out.println(demo.name instanceof String);
        System.out.println(demo instanceof ObjectClassMethods);

    }
}