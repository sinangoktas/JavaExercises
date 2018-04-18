package com.example.idea.TDD.Introduction;

import org.junit.*;

import static org.junit.Assert.*;

public class PersonTest {
    Person p, p1, p2, p3;

    @Before
    public void setUp() {
        p = new Person("Sinan", 38);
        p1 = new Person("Hasan", 38);
        p3 = new Person("Sinan", 30);
    }


    @Test(timeout = 10)
    public void test_1() {
        assertFalse(p.equals(p1));
        assertTrue(p.age == p1.age);

    }


    @Test
    public void test_2() {

        assertEquals("They are not same person", p, p3);
        assertEquals(38, p.age);
        assertNotEquals(p, p1);
    }

    @Test
    public void test_3() {
        assertSame("They are not the same object", p.age, p1.age);
        assertNotSame("They are the same object", p, p1);
    }


    @Test
    public void test_4() {
        assertNull("p2 is not null", p2);
        assertNotNull("p1 is actually null", p1);

    }

    @Ignore("I do not want them to know this does not work")
    @Test
    public void test_5() {

        if (p2 == null) {
            fail("p2 is null");
        }

        try {
            int n = p2.age;
            fail("exception not thrown");
        } catch (NullPointerException e) {
            assertTrue(p2 == null);
        }

    }

    @Test(expected = IllegalArgumentException.class)
    public void test_6() {
        p3.setAge(-3);
    }

    // this is for expensive setup, such as when you need to connect to a database
    @BeforeClass
    public static void setUpClass() {
        // one time initialization
        // connect to a database for example
    }

    @AfterClass
    public static void tearDownClass() {
        // one time cleanup
        // close the connection
    }

}