import org.junit.*;

import static org.junit.Assert.*;

public class PirateShipTest {
    PirateShip p;

    @Before
    public void setUp() throws Exception {
        p = new PirateShip();
    }

    @Test(timeout = 50)
    public void TestSound() {
        assertEquals("Ahoy!", p.sound());
    }

    @Test(timeout = 50)
    public void TestGetMaxSpeed() {
        assertEquals(696969, p.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestUpgradeSpeed() {
        p.upgradeSpeed();
        assertEquals(697038, p.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestDowngradeSpeed() {
        p.downgradeSpeed();
        assertEquals(696900, p.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestGetPrice() {
        assertEquals(17, p.getPrice());
    }

}
