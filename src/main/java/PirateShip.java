public class PirateShip implements Drivable, Domesticatable, Tradable {
    private int maxSpeed;

    public PirateShip() {
        this.maxSpeed = 696969;
    }

    @Override
    public String sound() {
        return "Ahoy!";
    }

    @Override
    public void upgradeSpeed() {
        this.maxSpeed = this.maxSpeed + 69;
    }

    @Override
    public void downgradeSpeed() {
        this.maxSpeed = this.maxSpeed - 69;
    }

    @Override
    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    @Override
    public int getPrice() {
        return 17;
    }

    @Override
    public String toString(){
        String id = super.toString();
        return id + " (Max speed: " + this.maxSpeed +")";
    }
}

