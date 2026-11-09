package book_examples;

public enum EnumSingleton {
    UNIQUE_INSTANCE;

    public void showMessage() {
        System.out.println("Hello Singleton!");
    }
}
