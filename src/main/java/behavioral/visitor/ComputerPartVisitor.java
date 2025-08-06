package behavioral.visitor;

import behavioral.visitor.computerpart.Computer;
import behavioral.visitor.computerpart.Keyboard;
import behavioral.visitor.computerpart.Monitor;
import behavioral.visitor.computerpart.Mouse;

/**
 * ComputerPartVisitor is the visitor interface for the Visitor pattern.
 */
public interface ComputerPartVisitor {
    void visit(Computer computer);
    void visit(Mouse mouse);
    void visit(Keyboard keyboard);
    void visit(Monitor monitor);
} 