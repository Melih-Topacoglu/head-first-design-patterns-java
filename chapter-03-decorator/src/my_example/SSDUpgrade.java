package my_example;

public class SSDUpgrade extends UpgradeDecorator {

    public SSDUpgrade(Computer computer) {
        super(computer);
    }

    public String getDescription() {
        return computer.getDescription() + ", SSD";
    }

    public double cost() {
        return computer.cost() + 199;
    }

}
