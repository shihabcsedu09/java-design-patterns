package behavioral.visitor;

import behavioral.visitor.computerpart.Computer;
import behavioral.visitor.computerpart.ComputerPart;
import behavioral.visitor.computerpart.Keyboard;
import behavioral.visitor.computerpart.Monitor;
import behavioral.visitor.computerpart.Mouse;

/**
 * ComputerPartDisplayVisitor is a concrete visitor for the Visitor pattern.
 */
public class ComputerPartDisplayVisitor implements ComputerPartVisitor {
    @Override
    public void visit(Computer computer) {
        System.out.println("Displaying Computer.");
    }

    @Override
    public void visit(Mouse mouse) {
        System.out.println("Displaying Mouse.");
    }

    @Override
    public void visit(Keyboard keyboard) {
        System.out.println("Displaying Keyboard.");
    }

    @Override
    public void visit(Monitor monitor) {
        System.out.println("Displaying Monitor.");
    }
} 