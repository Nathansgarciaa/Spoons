public class Card {
    private int suit;
    private int value;

    public static final int HEARTS = 0;
    public static final int SPADES = 1;
    public static final int CLUBS = 2;
    public static final int DIAMONDS = 3;
    public static final int JACK = 11;
    public static final int QUEEN = 12;
    public static final int KING = 13;
    public static final int ACE = 14;

    public Card() {
        suit = SPADES;
        value = ACE;
    }

    public Card(int value, int suit) {
        this.value = value;
        this.suit = suit;
    }

    public Card(Card other) {
        this.value = other.value;
        this.suit = other.suit;
    }

    public String toString() {
        return suit + ": " + value;
    }

    public boolean equals(Card o) {
        if (!(o instanceof Card)) {
            return false;
        }
        Card c = (Card) o;
        return this.value == c.value;
    }

    public int getValue() {
        return this.value;
    }

    public int getSuit() {
        return this.suit;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setSuit(int suit) {
        this.suit = suit;
    }
}