package behavioral.visitor.computerpart;

import behavioral.visitor.ComputerPartVisitor;

/**
 * Monitor is a concrete element for the Visitor pattern.
 */
public class Monitor implements ComputerPart {
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
} 