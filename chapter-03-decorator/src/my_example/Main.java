package my_example;

public class Main {

    public static void main(String[] args) {
        Computer comp1 = new GamingComputer();
        Computer comp2 = new OfficeComputer();
        System.out.println(comp1.cost());
        System.out.println(comp2.cost());

        comp1 = new RAMUpgrade(comp1);
        comp1 = new GPUUpgrade(comp1);

        comp2 = new SSDUpgrade(comp2);

        System.out.println(comp1.getDescription());
        System.out.println(comp1.cost());
        System.out.println(comp2.getDescription());
        System.out.println(comp2.cost());

        Computer computer = new GamingComputer();

        computer = new RAMUpgrade(computer);
        computer = new RAMUpgrade(computer);
        computer = new SSDUpgrade(computer);
        computer = new GPUUpgrade(computer);

        System.out.println(computer.getDescription());
        System.out.println(computer.cost());

    }

}
