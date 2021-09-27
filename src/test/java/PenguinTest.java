/*
 * This file contains sample JUnit test cases for Horse.java
 * You should NOT modify this file!
 */

import org.junit.*;

import static org.junit.Assert.*;


public class PenguinTest {
    Penguin Penguin1;

    @Before
    public void setUp() throws Exception {
        Penguin1 = new Penguin();
    }

    @Test(timeout = 50)
    public void TestSound() {
        assertEquals("splat!", Penguin1.sound());
    }

    @Test(timeout = 50)
    public void TestGetMaxSpeed() {
        assertEquals(3, Penguin1.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestUpgradeSpeed() {
        Penguin1.upgradeSpeed();
        assertEquals(4, Penguin1.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestDowngradeSpeed() {
        Penguin1.downgradeSpeed();
        assertEquals(2, Penguin1.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestGetPrice() {
        assertEquals(20, Penguin1.getPrice());
    }

}