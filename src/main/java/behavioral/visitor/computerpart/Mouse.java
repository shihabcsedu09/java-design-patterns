package behavioral.visitor.computerpart;

import behavioral.visitor.ComputerPartVisitor;

/**
 * Mouse is a concrete element for the Visitor pattern.
 */
public class Mouse implements ComputerPart {
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
} 