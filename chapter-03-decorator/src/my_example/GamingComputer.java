package my_example;

public class GamingComputer extends Computer {

    public GamingComputer() {
        description = "Gaming Computer";
    }

    @Override
    public double cost() {
        return 1299;
    }
}
