public class FlyingShark extends Shark implements Flyable {
    @Override
    public void fly() {
        System.out.println("FlyingShark is gliding through the air! (I know it's impossible but who cares!)");
    }

    @Override
    public String toString() {
        return "FlyingShark@" + Integer.toHexString(hashCode());
    }

    public void eat(Flyable creature) {
        System.out.println("FlyingShark caught a flying creature!");
    }
}
