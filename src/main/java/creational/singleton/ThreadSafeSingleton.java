package creational.singleton;

public class ThreadSafeSingleton {

    private static ThreadSafeSingleton instance;

    private ThreadSafeSingleton(){

    }

    public static synchronized ThreadSafeSingleton getThreadSafeSingletonInstance(){
        if(instance == null) {
            instance = new ThreadSafeSingleton();
        }
        return instance;
    }

    public static ThreadSafeSingleton getThreadSafeSingletonUsingDoubleCheckingInstance(){
        if(instance == null) {
            synchronized (ThreadSafeSingleton.class){
                if(instance == null){
                    instance = new ThreadSafeSingleton();
                }
            }

        }
        return instance;
    }

    public void showMessage(){
        System.out.println("Hello From Thread Safe Singleton ");
    }
}
