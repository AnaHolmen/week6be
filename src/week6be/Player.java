package week6be;

import java.util.ArrayList;
import java.util.List;

public class Player {

    // i. Fields
    private List<Cards> hand = new ArrayList<>(); // 1. hand (List of Card)
    private int score; // 2. score (set to 0 in the constructor)
    private String name; // 3. name

    // Constructor to initialize the player with a name and score set to 0
    public Player(String name) {
        this.name = name;
        score = 0;
    }

    // ii. Methods

    // 1. describe (prints out information about the player and calls the describe method for each card in the Hand List)
    public void describe() {
        System.out.println("Player's Name: " + this.name);
        for (Cards card : hand) {
            System.out.println(card.describe());
        }
    }

    // 2. flip (removes and returns the top card of the Hand)
    public Cards flip() {
        return hand.remove(0);
    }

    // 3. draw (takes a Deck as an argument and calls the draw method on the deck, adding the returned Card to the hand field)
    public void draw(Deck deck) {
        hand.add(deck.draw());
    }

    // 4. incrementScore (adds 1 to the Player’s score field)
    public void incrementScore() {
        score++;
    }

    // Getter method for getting the score
    public int getScore() {
        return score;
    }

    // Getter method for getting the name
    public String getName() {
        return name;
    }

    // Method to describe the score of the player
    public String describeScore() {
        return name + ": " + score;
    }
}



