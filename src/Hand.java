import java.util.ArrayList;

public class Hand {
    protected ArrayList<Card> handCards;
    protected int sum;

    Hand() {
        handCards = new ArrayList<Card>();
        sum = 0;
    }

    public void takeCard(CardDeck d) {
        if (d.getSize() != 0) {
            Card a = d.getCard();
            System.out.print("Вы взяли карту: ");
            a.show();
            handCards.add(a);

            try {
                sum += Integer.parseInt(a.getDenom());
            }
            catch (Exception e) {
                String den = a.getDenom();
                if (den == "Jack") sum += 2;
                else if (den == "Queen") sum += 3;
                else if (den == "King") sum += 4;
                else if (den == "Ace") sum += 1;
            }
        }
        else System.out.println("В колоде не осталось карт.");
    }

    public int getSum() {
        return sum;
    }

    public int getCountOfCards() {
        return handCards.size();
    }
}
