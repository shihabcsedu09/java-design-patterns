package creational.singleton;

public class App {

    public static void main(String[] args){

        // Eager Initialization Singleton
        EagerInitializationSingleton.getINSTANCE().showMessage();

    }
}
