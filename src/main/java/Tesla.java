public class Tesla implements Drivable, Tradable {
    private int maxSpeed;

    public Tesla() {
        this.maxSpeed = 100;
    }

    @Override
    public void upgradeSpeed() {
        this.maxSpeed += 5;
    }

    @Override
    public void downgradeSpeed() {
        this.maxSpeed -= 5;
    }

    @Override
    public int getPrice() {
        return 30000;
    }

    @Override
    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    @Override
    public String toString() {
        return "A Beautiful Tesla with Max Speed (" + this.maxSpeed + "mph)";
    }
}