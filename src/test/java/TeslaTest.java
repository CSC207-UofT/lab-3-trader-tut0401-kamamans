/*
 * This file contains sample JUnit test cases for Tesla.java
 * You should NOT modify this file!
 */

import org.junit.*;

import static org.junit.Assert.*;


public class TeslaTest {
    Tesla t;

    @Before
    public void set_up() throws Exception {
        t = new Tesla();
    }

    @Test(timeout = 50)
    public void test_get_max_speed() {
        assertEquals(100, t.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void test_upgrade_speed() {
        t.upgradeSpeed();
        assertEquals(105, t.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void test_downgrade_speed() {
        t.downgradeSpeed();
        assertEquals(95, t.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void test_get_price() {
        assertEquals(30000, t.getPrice());
    }

    @Test(timeout = 100)
    public void test_to_string() {
        String expected = "A Beautiful Tesla with Max Speed (100mph)";
        assertEquals(expected, t.toString());
    }

}