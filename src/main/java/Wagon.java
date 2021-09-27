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
    // This method returns the maximum speed taken from the super class, Trader. The max speed is assigned during the construction of this class.
    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    @Override
    public int getPrice() {
        return 400;
    }

    @Override
    public String toString(){
        String oof = super.toString();
        return oof + " (Max speed: " + this.maxSpeed +")";
    }
}
