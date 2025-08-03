public class Main {
    public static void main(String[] args) {
        Shark shark = new Shark();
        SurgeonFish surgeonFish = new SurgeonFish();
        FlyingShark flyingShark = new FlyingShark();
        Insect insect = new Insect();

        shark.eat(surgeonFish);
        shark.eat(new Shark());

        flyingShark.eat(new Shark());
        flyingShark.eat(insect);

        Fish fish = new Shark();
        Flyable flyer = new FlyingShark();

        fish.swim();
        flyer.fly();
    }
}