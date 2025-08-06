package behavioral.visitor;

import behavioral.visitor.computerpart.Computer;

/**
 * Demonstrates the Visitor pattern by using a computer with a visitor.
 */
public class App {
    public static void main(String[] args) {
        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
    }
} 