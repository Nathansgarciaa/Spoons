import java.util.LinkedList;

public class TestCards {
    public static void main(String[] args){
        Deck deck = new Deck();//print deck
        System.out.println(deck.toString());
        Deck deck2 = new Deck(deck);//checking the equals method
        System.out.print(deck.equals(deck2));
    
        Card card = deck.deal();//make deck dealed and a copy
        Card card2 = new Card(card);
        System.out.println(card.toString());//prints card to string
        System.out.println(deck.size());//tests the size method 
        
        Dealer dealer = new Dealer();
        System.out.println(dealer.size());//checks the dealer size m,ethod
        LinkedList<Card> dealtCards = dealer.deals(9);//checks deals method with int = 9
        System.out.println(dealer.size());//checks size after deals to see if it removed card
        System.out.println(dealer.toString());//prints details
    }
}