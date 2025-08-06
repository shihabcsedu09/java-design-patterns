package behavioral.state;

import behavioral.state.state.State;
import behavioral.state.state.StartState;
import behavioral.state.state.StopState;

/**
 * Context is the context for the State pattern.
 */
public class Context {
    private State state;

    public Context() {
        state = null;
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }
} 