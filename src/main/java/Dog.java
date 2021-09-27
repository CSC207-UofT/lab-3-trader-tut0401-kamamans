public class Dog implements Domesticatable, Tradable {
    private int age;

    public Dog(int age) {
        this.age = age+1;
    }

    public Dog() {
        this.age = 0;
    }

    public void birthday() {
        // because 1 human year is 8 dog years :)
        this.age += 8;
    }

    public int getAge() {
        return this.age;
    }

    @Override
    public String sound() {
        return "Woof!";
    }

    @Override
    public int getPrice() {
        return 5;
    }
}
