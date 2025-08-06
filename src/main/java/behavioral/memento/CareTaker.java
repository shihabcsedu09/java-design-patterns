package behavioral.memento;

import behavioral.memento.memento.Memento;
import java.util.ArrayList;
import java.util.List;

/**
 * CareTaker is the caretaker for the Memento pattern.
 */
public class CareTaker {
    private List<Memento> mementoList = new ArrayList<>();

    public void add(Memento state) {
        mementoList.add(state);
    }

    public Memento get(int index) {
        return mementoList.get(index);
    }
} 