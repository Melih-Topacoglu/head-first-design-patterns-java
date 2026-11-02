package my_example;

public abstract class UpgradeDecorator extends Computer {
    protected final Computer computer;

    protected UpgradeDecorator(Computer computer) {
        this.computer = computer;
    }

    @Override
    public abstract String getDescription();
}
