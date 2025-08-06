/**
 * StaticBlockSingleton demonstrates the static block initialization approach to the Singleton pattern.
 * This allows for exception handling during instance creation.
 */
package creational.singleton;

public class StaticBlockSingleton {
    // The singleton instance
    private static StaticBlockSingleton instance;

    // Private constructor prevents instantiation from other classes
    private StaticBlockSingleton() {}

    // Static block for initialization and exception handling
    static {
        try {
            instance = new StaticBlockSingleton();
        } catch (Exception e) {
            throw new RuntimeException("Exception occurred in creating singleton instance");
        }
    }

    /**
     * Returns the singleton instance.
     * @return the singleton instance
     */
    public static StaticBlockSingleton getInstance() {
        return instance;
    }

    /**
     * Example method to show a message from the singleton.
     */
    public void showMessage() {
        System.out.println("Hello From Static Block Singleton ");
    }
}
