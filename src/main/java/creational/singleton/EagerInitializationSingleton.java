/**
 * EagerInitializationSingleton demonstrates the eager initialization approach to the Singleton pattern.
 * The instance is created at class loading time.
 */
package creational.singleton;

public class EagerInitializationSingleton {
    // The singleton instance is created eagerly at class loading time
    private static EagerInitializationSingleton INSTANCE = new EagerInitializationSingleton();

    // Private constructor prevents instantiation from other classes
    private EagerInitializationSingleton() {
    }

    /**
     * Returns the singleton instance.
     * @return the singleton instance
     */
    public static EagerInitializationSingleton getINSTANCE() {
        return INSTANCE;
    }

    /**
     * Example method to show a message from the singleton.
     */
    public void showMessage() {
        System.out.println("Hello From Eager Initialization Singleton ");
    }
}
