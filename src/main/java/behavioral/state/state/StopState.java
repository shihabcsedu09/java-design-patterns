package behavioral.state.state;

import behavioral.state.Context;

/**
 * StopState is a concrete state for the State pattern.
 */
public class StopState implements State {
    public void doAction(Context context) {
        System.out.println("Player is in stop state");
        context.setState(this);
    }

    public String toString() {
        return "Stop State";
    }
} 