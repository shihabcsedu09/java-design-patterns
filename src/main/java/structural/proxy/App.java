package structural.proxy;

/**
 * Demonstrates the Proxy pattern by using ProxyImage to display images.
 */
public class App {
    public static void main(String[] args) {
        Image image = new ProxyImage("test_10mb.jpg");

        // Image will be loaded from disk
        image.display();
        System.out.println("");

        // Image will not be loaded from disk
        image.display();
    }
} 