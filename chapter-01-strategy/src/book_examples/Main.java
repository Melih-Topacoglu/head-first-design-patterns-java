package book_examples;

public class Main {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck duck = new ModelDuck();
        duck.performFly();
        duck.setFlyBehavior(new FlyRocketPowered());
        duck.performFly();
        duck.performQuack();
    }
}
