package structural.proxy;

import structural.proxy.subject.Image;
import structural.proxy.subject.RealImage;

/**
 * ProxyImage is the proxy for the Proxy pattern.
 */
public class ProxyImage implements Image {
    private RealImage realImage;
    private String fileName;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if(realImage == null) {
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }
} 