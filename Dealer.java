import java.util.LinkedList;

public class Dealer {
    private Deck m_deck;

    public Dealer() {
        m_deck = new Deck();
    }

    public LinkedList<Card> deals(int n) {
        LinkedList<Card> numDealt = new LinkedList<Card>();
        if (m_deck.size() < n) {
            return numDealt;
        }
        for (int i = 0; i < n; i++) {
            Card card = m_deck.deal();
            numDealt.add(card);
        }
        return numDealt;
    }

    public int size() {
        return m_deck.size();
    }

    public String toString() {
        return m_deck.toString();
    }
}