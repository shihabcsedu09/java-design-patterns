package behavioral.visitor.computerpart;

import behavioral.visitor.ComputerPartVisitor;

/**
 * ComputerPart is the element interface for the Visitor pattern.
 */
public interface ComputerPart {
    void accept(ComputerPartVisitor computerPartVisitor);
} 