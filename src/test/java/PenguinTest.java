/*

 */

import org.junit.*;

import static org.junit.Assert.*;


public class PenguinTest {
    Penguin p1;

    @Before
    public void setUp() throws Exception {
        p1 = new Penguin();
    }

    @Test(timeout = 50)
    public void TestSound() {
        assertEquals("splat!", p1.sound());
    }

    @Test(timeout = 50)
    public void TestGetMaxSpeed() {
        assertEquals(3, p1.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestUpgradeSpeed() {
        p1.upgradeSpeed();
        assertEquals(4, p1.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestDowngradeSpeed() {
        p1.downgradeSpeed();
        assertEquals(2, p1.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestGetPrice() {
        assertEquals(20, p1.getPrice());
    }

}