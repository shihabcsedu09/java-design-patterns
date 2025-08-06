package structural.facade;

/**
 * Demonstrates the Facade pattern by starting a computer using ComputerFacade.
 */
public class App {
    public static void main(String[] args) {
        ComputerFacade computer = new ComputerFacade();
        computer.start();
    }
}