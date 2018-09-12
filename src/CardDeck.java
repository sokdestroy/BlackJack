import java.util.ArrayList;

public class CardDeck {
    private ArrayList<Card> Deck = new ArrayList<Card>();

    CardDeck() {
        String []suits = {"Hearts","Diamponds","Club","Spades"};
        String []denoms = {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};

        for (int i = 0; i < suits.length; i++)
            for (int j = 0; j < denoms.length; j++) Deck.add(new Card(suits[i],denoms[j]));
    }

    public Card getCard() {
        return Deck.remove((int)(Math.random()*Deck.size()));
    }

    public int getSize() {
        return Deck.size();
    }
}
