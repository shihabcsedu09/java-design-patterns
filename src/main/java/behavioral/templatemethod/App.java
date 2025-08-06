package behavioral.templatemethod;

import behavioral.templatemethod.game.Cricket;
import behavioral.templatemethod.game.Football;

/**
 * Demonstrates the Template Method pattern by playing different games.
 */
public class App {
    public static void main(String[] args) {
        Game game = new Cricket();
        game.play();
        System.out.println();
        game = new Football();
        game.play();
    }
} 