/*
 * This file contains sample JUnit test cases for Horse.java
 * You should NOT modify this file!
 */

import org.junit.*;

import static org.junit.Assert.*;


public class WagonTest {
    Wagon w;

    @Before
    public void setUp() {
        w = new Wagon();
    }

    @Test(timeout = 50)
    public void TestGetMaxSpeed() {
        assertEquals(900, w.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestUpgradeSpeed() {
        w.upgradeSpeed();
        assertEquals(910, w.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestDowngradeSpeed() {
        w.downgradeSpeed();
        assertEquals(890, w.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestGetPrice() {
        assertEquals(400, w.getPrice());
    }

}