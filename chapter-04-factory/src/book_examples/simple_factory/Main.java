package book_examples.simple_factory;

public class Main {

    public static void main(String[] args) {
        SimplePizzaFactory factory = new SimplePizzaFactory();
        PizzaStore pizzaStore = new PizzaStore(factory);

        pizzaStore.orderPizza("cheese");
    }
}
