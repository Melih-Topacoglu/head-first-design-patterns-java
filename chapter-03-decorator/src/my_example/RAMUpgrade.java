package my_example;

public class RAMUpgrade extends UpgradeDecorator {

    public RAMUpgrade(Computer computer) {
        super(computer);
    }

    public String getDescription() {
        return computer.getDescription() + ", RAM";
    }

    public double cost() {
        return computer.cost() + 399;
    }
}
