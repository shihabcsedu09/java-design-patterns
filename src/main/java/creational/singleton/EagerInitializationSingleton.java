package creational.singleton;

public class EagerInitializationSingleton {

    private static EagerInitializationSingleton INSTANCE = new EagerInitializationSingleton();

    private EagerInitializationSingleton() {

    }

    public static EagerInitializationSingleton getINSTANCE() {
        return INSTANCE;
    }

    public void showMessage(){
        System.out.print("Hello From Eager Initialization Singleton ");
    }
}
