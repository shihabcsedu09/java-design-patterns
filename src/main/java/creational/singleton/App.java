package creational.singleton;

public class App {

    public static void main(String[] args){

        // Eager Initialization Singleton
        EagerInitializationSingleton.getINSTANCE().showMessage();

        // Static Block Initialization Singleton
        StaticBlockSingleton.getInstance().showMessage();

        // Thread Safe Singleton
        ThreadSafeSingleton.getThreadSafeSingletonInstance().showMessage();

        // Thread Safe Singleton using double checking
        ThreadSafeSingleton.getThreadSafeSingletonUsingDoubleCheckingInstance().showMessage();


    }
}
