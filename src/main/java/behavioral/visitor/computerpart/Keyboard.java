package behavioral.visitor.computerpart;

import behavioral.visitor.ComputerPartVisitor;

/**
 * Keyboard is a concrete element for the Visitor pattern.
 */
public class Keyboard implements ComputerPart {
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
} 