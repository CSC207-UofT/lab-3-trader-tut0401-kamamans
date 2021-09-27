import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PigTest {
    Pig p;


    public void setUp() throws Exception {
        p = new Pig();
    }


    public void TestSound() {
        assertEquals("Oink Oink!", p.sound());
    }

    @Test(timeout = 50)
    public void TestGetMaxSpeed() {
        assertEquals(100, p.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestUpgradeSpeed() {
        p.upgradeSpeed();
        assertEquals(101, p.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestDowngradeSpeed() {
        p.downgradeSpeed();
        assertEquals(99, p.getMaxSpeed());
    }

}