package structural.facade;

import structural.facade.subsystem.CPU;
import structural.facade.subsystem.Memory;
import structural.facade.subsystem.HardDrive;

/**
 * ComputerFacade provides a simplified interface to the computer subsystems.
 */
public class ComputerFacade {
    private CPU processor;
    private Memory ram;
    private HardDrive hd;

    public ComputerFacade() {
        this.processor = new CPU();
        this.ram = new Memory();
        this.hd = new HardDrive();
    }

    public void start() {
        processor.freeze();
        ram.load(0, hd.read(0, 1024));
        processor.jump(0);
        processor.execute();
    }
}