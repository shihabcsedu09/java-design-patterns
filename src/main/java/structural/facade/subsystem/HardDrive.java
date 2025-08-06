package structural.facade.subsystem;

/**
 * HardDrive is a subsystem class for the Facade pattern.
 */
public class HardDrive {
    public byte[] read(long lba, int size) {
        System.out.println("Reading data from hard drive at LBA " + lba + ", size " + size);
        return new byte[size];
    }
}