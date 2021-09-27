/*
 * This file contains sample JUnit test cases for Horse.java
 * You should NOT modify this file!
 */

import org.junit.*;

import static org.junit.Assert.*;


public class CowTest {
    Cow c;

    @Before
    public void setUp() throws Exception {
        c = new Cow();
    }

    @Test(timeout = 50)
    public void TestMoo() {
        assertEquals("Moo!", c.sound());
    }

    @Test(timeout = 50)
    public void TestGetPrice() {
        assertEquals(24, c.getPrice());
    }

    @Test(timeout = 50)
    public void TesttoString() {
        assertEquals("I'm a cow and the noise I make is Moo!", c.toString());
    }

}