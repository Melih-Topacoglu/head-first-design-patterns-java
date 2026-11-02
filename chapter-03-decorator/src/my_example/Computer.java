package my_example;

public abstract class Computer {
    public String description = "Unknown computer type";

    public abstract double cost();

    public String getDescription() {
        return description;
    }
}
