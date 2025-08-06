package behavioral.state.state;

import behavioral.state.Context;

/**
 * StartState is a concrete state for the State pattern.
 */
public class StartState implements State {
    public void doAction(Context context) {
        System.out.println("Player is in start state");
        context.setState(this);
    }

    public String toString() {
        return "Start State";
    }
} 