package book_examples;

public class Main {
    public static void main(String[] args) {
        ClassicSingleton s1 = ClassicSingleton.getInstance();
        ClassicSingleton s2 = ClassicSingleton.getInstance();

        System.out.println(s1 == s2);

        EnumSingleton s3 = EnumSingleton.UNIQUE_INSTANCE;
        EnumSingleton s4 = EnumSingleton.UNIQUE_INSTANCE;

        System.out.println(s3 == s4);

        EagerSingleton s5 = EagerSingleton.getInstance();
        EagerSingleton s6 = EagerSingleton.getInstance();

        System.out.println(s5 == s6);
    }
}
