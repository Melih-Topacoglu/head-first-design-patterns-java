package book_examples;

public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "House Blend Coffee";
    }

    @Override
    public double cost() {
        return switch (getSize()) {
            case TALL -> .89;
            case GRANDE -> 1.14;
            case VENTI -> 1.39;
        };
    }
}