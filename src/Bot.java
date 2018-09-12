public class Bot extends Hand {
    boolean take;

    Bot() {
        super();
        take = true;
    }

    public void takeCard(CardDeck d) {
        getOpinion();
        if (take && d.getSize() != 0) {
            Card a = d.getCard();
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
    }

    public void getOpinion() {
        double opinion = Math.random();

        switch (sum) {
            case 21:
                take = false;
            case 20:
                if (opinion <= 0.05);
                else {
                    take = false;
                }
            case 19:
                if (opinion <= 0.1);
                else {
                    take = false;
                }
            case 18:
                if (opinion <= 0.3);
                else {
                    take = false;
                }
            case 17:
                if (opinion <= 0.6);
                else {
                    take = false;
                }
            case 16:
                if (opinion <= 0.8);
                else {
                    take = false;
                }
            case 15:
                if (opinion <= 0.9);
                else {
                    take = false;
                }
        }

    }
    boolean getTake() {
        return take;
    }
}
