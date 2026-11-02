package my_example;

public class OfficeComputer extends Computer {

    public OfficeComputer() {
        description = "Office Computer";
    }

    @Override
    public double cost() {
        return 899;
    }
}
