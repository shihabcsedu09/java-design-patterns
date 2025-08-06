/**
 * ThreadSafeSingleton demonstrates thread-safe approaches to the Singleton pattern.
 * Includes both synchronized and double-checked locking methods.
 */
package creational.singleton;

public class ThreadSafeSingleton {
    // The singleton instance
    private static ThreadSafeSingleton instance;

    // Private constructor prevents instantiation from other classes
    private ThreadSafeSingleton() {
    }

    /**
     * Returns the singleton instance using synchronized method (thread-safe, but slower).
     * @return the singleton instance
     */
    public static synchronized ThreadSafeSingleton getThreadSafeSingletonInstance() {
        if (instance == null) {
            instance = new ThreadSafeSingleton();
        }
        return instance;
    }

    /**
     * Returns the singleton instance using double-checked locking (faster, thread-safe).
     * @return the singleton instance
     */
    public static ThreadSafeSingleton getThreadSafeSingletonUsingDoubleCheckingInstance() {
        if (instance == null) {
            synchronized (ThreadSafeSingleton.class) {
                if (instance == null) {
                    instance = new ThreadSafeSingleton();
                }
            }
        }
        return instance;
    }

    /**
     * Example method to show a message from the singleton.
     */
    public void showMessage() {
        System.out.println("Hello From Thread Safe Singleton ");
    }
}
