package my_example;

public class GPUUpgrade extends UpgradeDecorator {

    public GPUUpgrade(Computer computer) {
        super(computer);
    }

    public String getDescription() {
        return computer.getDescription() + " ,GPU";
    }

    public double cost() {
        return computer.cost() + 599;
    }

}
