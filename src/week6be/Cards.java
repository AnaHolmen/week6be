package week6be;

public class Cards {

    private String name;
    private String suit;
    private int value;

    // Constructor
    public Cards(String suit, int value) {
        this.value = value;
        this.setSuit(suit);
        setName(value, suit); // Initialize the name field
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    // Helper method to set the name of the card based on its value and suit
    private void setName(int value, String suit) {
        switch (value) {
            case 2:
                name = "Two";
                break;
            case 3:
                name = "Three";
                break;
            case 4:
                name = "Four";
                break;
            case 5:
                name = "Five";
                break;
            case 6:
                name = "Six";
                break;
            case 7:
                name = "Seven";
                break;
            case 8:
                name = "Eight";
                break;
            case 9:
                name = "Nine";
                break;
            case 10:
                name = "Ten";
                break;
            case 11:
                name = "Jack";
                break;
            case 12:
                name = "Queen";
                break;
            case 13:
                name = "King";
                break;
            case 14:
                name = "Ace";
                break;
            default:
                name = "Unknown";
                break;
        }
        name += " of " + suit;
    }

    // Method to describe the card
    public String describe() {
        return getName() + " - " + getValue();
    }
}

	    	

