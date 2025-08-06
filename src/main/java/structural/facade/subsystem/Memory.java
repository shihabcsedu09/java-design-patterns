package structural.facade.subsystem;

/**
 * Memory is a subsystem class for the Facade pattern.
 */
public class Memory {
    public void load(long position, byte[] data) {
        System.out.println("Loading data to memory at position " + position);
    }
}