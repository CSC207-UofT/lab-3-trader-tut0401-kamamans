/* A wagon class that is drivable and tradeable.
 */
public class Wagon implements Drivable, Tradable {
    private int maxSpeed;

    public Wagon() {
        this.maxSpeed = 900;
    }

    @Override
    public void upgradeSpeed() {
        this.maxSpeed += 10;
    }

    @Override
    public void downgradeSpeed() {
        this.maxSpeed -= 10;
    }

    @Override
    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    @Override
    public int getPrice() {
        return 400;
    }

    @Override
    public String toString(){
        return super.toString() + " (Max speed: " + this.maxSpeed +")";
    }
}
