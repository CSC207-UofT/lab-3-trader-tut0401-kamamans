/* A sample class that implements the given interfaces.
 */
public class Cow implements Domesticatable, Tradable {
    private String colour;

    public Cow() {
        this.colour = "brown";
    }

    public void setcolour(String colour) {
        this.colour = colour;
    }

    public String getColour() {
        return this.colour;
    }

    @Override
    public String sound() {
        return "Moo!";
    }

    @Override
    public int getPrice() {
        return 24;
    }

    @Override
    public String toString(){
        String id = super.toString();
        return "I'm a cow and the noise I make is " + this.sound();
    }
}
