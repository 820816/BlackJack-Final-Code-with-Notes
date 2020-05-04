//*Code for the deck from: https://introcs.cs.princeton.edu/java/14array/Deck.java.html
//*toString method added by this user(Keegan)
// see notes with //* for ones made by this user

public class Deck {
  private String[] cards;
    public Deck() {
        String[] SUITS = {
            "Clubs", "Diamonds", "Hearts", "Spades"
        };

        String[] RANKS = {
            "2", "3", "4", "5", "6", "7", "8", "9", "10",
            "Jack", "Queen", "King", "Ace"
        };

        // initialize deck
        int n = SUITS.length * RANKS.length;
        String[] deck = new String[n];
        for (int i = 0; i < RANKS.length; i++) {
            for (int j = 0; j < SUITS.length; j++) {
                deck[SUITS.length*i + j] = RANKS[i] + " of " + SUITS[j];
            }
        }

        // shuffle
        for (int i = 0; i < n; i++) {
            int r = i + (int) (Math.random() * (n-i));
            String temp = deck[r];
            deck[r] = deck[i];
            deck[i] = temp;
        }

       //*Removed to keep cards hidden
       /* // print shuffled deck
        for (int i = 0; i < n; i++) {
            System.out.println(deck[i]);
        }*/
      cards=deck;
     //*Removed due to no need for viewing number of cards in deck
     // System.out.println(n);
    }
    
    //*Added to retrieve cards from the deck
    public String toString(int value){
      //System.out.println(this.cards[value]);
      return this.cards[value];
    }

}