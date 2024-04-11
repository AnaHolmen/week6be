package week6be;



public class App {

    public static void main(String[] args) {
        // a) Instantiate a Deck and two Players, call the shuffle method on the deck for each player .
        Deck deck = new Deck();
        Player player1 = new Player("Tom");
        Player player2 = new Player("Jim");

        // shuffle deck
        deck.shuffle();

        // b) Using a traditional for loop, iterate 52 times calling the Draw method 
        
        for (int i = 0; i < 52; i++) {
            if (i % 2 == 0) {
                // Draw a card for player1 if the index is even
                player1.draw(deck);
            } else {
                // Draw a card for player2 if the index is odd
                player2.draw(deck);
            }
        }

        // c) Using a traditional for loop, iterate 26 times and call the flip method for each player.
        System.out.println("-----------------------------------------------------");
        for (int i = 0; i < 26; i++) {
            // Flip a card for each player
            Cards player1Card = player1.flip();
            Cards player2Card = player2.flip();

            // d) Compare the value of each card returned by the two player’s flip methods.
            // Call the incrementScore method on the player whose card has the higher value.
            if (player1Card.getValue() > player2Card.getValue()) {
                // Increment player1's score if his card is higher
                player1.incrementScore();
                // Print the game play details, the winner of the round, and the updated score
                System.out.println(gamePlay(player1, player2, player1Card, player2Card) + "\n" + winsRound(player1)
                        + "\nUpdated Score: " + gameScore(player1, player2));
                System.out.println("-----------------------------------------------------");
            } else if (player2Card.getValue() > player1Card.getValue()) {
                // Increment player2's score if his card is higher
                player2.incrementScore();
                // Print the game play details, the winner of the round, and the updated score
                System.out.println(gamePlay(player1, player2, player1Card, player2Card) + "\n" + winsRound(player2)
                        + "\nUpdated Score: " + gameScore(player1, player2));
                System.out.println("-----------------------------------------------------");
            } else {
                // It's a draw if both cards have the same value
                System.out.println(gamePlay(player1, player2, player1Card, player2Card) + "\nDRAW \nUpdated Score: "
                        + gameScore(player1, player2));
                System.out.println("-----------------------------------------------------");
            }
        }

        // e) After the loop, compare the final score from each player.
        // f) Print the final score of each player and either “Player 1”, “Player 2”, or
        // “Draw” depending on which score is higher or if they are both the same.
        // Winners Circle
        if (player1.getScore() > player2.getScore())
            // Print player1 as the winner if his score is higher
            System.out.println(player1.getName() + " Wins Game!\nFinal Score    " + gameScore(player1, player2));
        else if (player2.getScore() > player1.getScore())
            // Print player2 as the winner if his score is higher
            System.out.println(player2.getName() + " Wins Game!\nFinal Score    " + gameScore(player1, player2));
        else
            // It's a draw if both players have the same score
            System.out.println("DRAW!! Final Score    " + gameScore(player1, player2));
    }

    // Method to describe the game play details
    public static String gamePlay(Player player1, Player player2, Cards card1, Cards card2) {
        return player1.getName() + " plays " + card1.describe() + "\n" + player2.getName() + " plays "
                + card2.describe();
    }

    // Method to describe the game score
    public static String gameScore(Player player1, Player player2) {
        return player1.describeScore() + " | " + player2.describeScore();
    }

    // Method for winner of round
    public static String winsRound(Player player) {
        return player.getName() + " Wins Round";
    }
}
	    

 //End of main method
//End of main class