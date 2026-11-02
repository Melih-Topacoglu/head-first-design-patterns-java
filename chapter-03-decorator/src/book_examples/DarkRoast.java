
package book_examples;

public class DarkRoast extends Beverage {

    public DarkRoast() {
        description = "Dark Roast";
    }

    @Override
    public double cost() {
        return switch (getSize()) {
            case TALL -> 0.99;
            case GRANDE -> 1.24;
            case VENTI -> 1.49;
        };
    }
}