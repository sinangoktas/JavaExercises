package com.main.TDD.Introduction;

public class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public boolean equals(Object something) {
        Person p = (Person) something;
        return this.name == p.name;
    }

    public void setAge(int m) {
            if(m > 0) {
                this.age = m;
            }else {
                throw new IllegalArgumentException();
            }
    }

    // Stubs or simple mocking
    // In order to run our tests, the methods we are testing have to exist
    // but they do not have to be right
    // Instead of starting with real code, we start with stubs
    // minimal method that always return the same value

    // a stub that returns void can be written with an empty body
    // a stub that returns a number can return 0, -1 or 666 whatever number is most likely to be wrong
    // a stub that returns boolean value should usually return false
    // a stub that returns an object of any kind(incl. String or an array) should return null


}
