package book_examples;

public class ThreadSafeSingleton {

    private static ThreadSafeSingleton uniqueInstance;

    private ThreadSafeSingleton() {
    }

    public static synchronized ThreadSafeSingleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new ThreadSafeSingleton();
        }
        return uniqueInstance;
    }

}
