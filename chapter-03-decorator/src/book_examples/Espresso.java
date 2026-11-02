package book_examples;

public class Espresso extends Beverage {

    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double cost() {
        return switch (getSize()) {
            case TALL -> 1.99;
            case GRANDE -> 2.49;
            case VENTI -> 2.99;
        };
    }
}