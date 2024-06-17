import java.util.LinkedList;
import java.util.Random;

public class Deck {
    private LinkedList<Card> m_cards;

    public Deck() {
        m_cards = new LinkedList<Card>();
        for(int i = 0; i < 4; i++) {
            for(int k = 2; k <= 14; k++) {
                Card p = new Card(k, i);//i represents suits, 0-3, k = values 2-14
                m_cards.add(p);
            }
        }
    }

    public Deck(Deck other) {
        m_cards = new LinkedList<Card>();
        for(Card card: other.m_cards) {
            Card j = new Card(card);
            m_cards.add(j);
        }
    }

    public String toString() {
        return m_cards.toString();
    }

    public int size() {
        return m_cards.size();
    }
   
    public Card deal(){
        int randCard = new Random().nextInt(m_cards.size());
        
        m_cards.remove(randCard);
        return m_cards.get(randCard);
        
    }
}
