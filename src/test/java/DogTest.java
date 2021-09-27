import org.junit.*;

import static org.junit.Assert.*;

public class DogTest {
    Dog d;
    Dog d2;

    @Before
    public void setUp() throws Exception {
        d = new Dog();
        d2 = new Dog(15);
    }


    @Test(timeout = 50)
    public void TestSound() {
        assertEquals("Woof!", d.sound());
    }

    @Test(timeout = 50)
    public void TestGetPrice() {
        assertEquals(5, d.getPrice());
    }

    @Test(timeout = 50)
    public void TestGetAge() {
        assertEquals(0, d.getAge());
        assertEquals(15, d2.getAge());
    }

    @Test(timeout = 50)
    public void TestBirthday() {
        d.birthday();
        assertEquals(8, d.getAge());
        d.birthday();
        assertEquals(16, d.getAge());

        d2.birthday();
        assertEquals(23, d2.getAge());
    }

    @Test(timeout = 50)
    public void TestToString() {
        assertEquals("A cute dog that is 0 dog years old!", d.toString());
        d.birthday();
        assertEquals("A cute dog that is 8 dog years old!", d.toString());
        
        assertEquals("A cute dog that is 15 dog years old!", d2.toString());
    }
}
