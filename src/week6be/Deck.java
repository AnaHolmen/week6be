package week6be;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    // i. Fields
    List<Cards> cards = new ArrayList<Cards>(); // 1. cards (List of Card)

    // ii. Methods

    // 3. In the constructor, when a new Deck is instantiated, the Cards field should be populated with the standard 52 cards.
    Deck() {
        String[] suits = {"Spades", "Hearts", "Clubs", "Diamonds"};
        String[] numbers = {"Two", "Three", "Four", "Five", "Six", "Seven",
                "Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace"};

        // Populating the deck with standard 52 cards
        for (@SuppressWarnings("unused") String suit : suits) {
            int count = 2;
            for (String numberName : numbers) {
                cards.add(new Cards(numberName, count)); // Adding cards with different suits and values
                count++;
            }
        }
    }

    // Getters and Setters
    public List<Cards> getCards() {
        return cards;
    }

    public void setCards(List<Cards> cards) {
        this.cards = cards;
    }

    // Method to describe all cards in the deck
    public void describe() {
        for (Cards card : this.cards) {
            card.describe(); // Describe each card
        }
    }

    // Method to shuffle the cards in the deck
    public void shuffle() {
        Collections.shuffle(this.cards); // Shuffling the cards
    }

    // Method to draw (remove and return) the top card of the deck
    public Cards draw() {
        Cards card = this.cards.remove(0); // Removing the top card from the list
        return card; // Returning the removed card
    }
}