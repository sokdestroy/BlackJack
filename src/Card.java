public class Card {
    private String suit;
    private String denom;

    Card(String s, String d) {
        suit = s;
        denom = d;
    }

    public void show() {
        System.out.println(suit + " " + denom);
    }

    public String getDenom() {
        return denom;
    }
}
