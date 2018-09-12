import java.util.Scanner;

public class Game {
    public static void main(String []args) {
        System.out.println("Играем в 21!");
        Game g = new Game();
        g.go();
    }

    void go() {
        boolean play = true;
        while (play) {
            CardDeck deck = new CardDeck();
            Hand player = new Hand();
            Bot player2 = new Bot();
            Scanner input = new Scanner(System.in);
            String answer = "y";

            while (true) {
                if (answer.equals("y")) {
                    player.takeCard(deck);
                    System.out.print("\n В вашей руке " + player.getCountOfCards() + " карт. ");
                    System.out.println("Их сумма равна : " + player.getSum() + " ");


                    System.out.println("\n Ход бота.");
                    if (player2.getTake()) {
                        System.out.println("Бот берет карту. \n");
                        player2.takeCard(deck);
                    }

                    System.out.println("Берем карту? y/n");
                    answer = input.nextLine();
                }
                else if (player2.getTake()) {
                    System.out.println("Бот берет карту. \n");
                    player2.takeCard(deck);
                }
                else break;
            }

            int me = player.getSum();
            int bot = player2.getSum();
            System.out.println("Сумма ваших карт: " + Integer.toString(me));
            System.out.println("Сумма карт противника: " + Integer.toString(bot));

            if (me > 21 && bot <= 21) System.out.println("Вы проиграли.");
            else if (me > 21 && bot > 21) System.out.println("Оба проиграли.");
            else if (me <= 21 && bot > 21) System.out.println("Вы выиграли.");
            else if (me <= 21 && bot <= 21) {
                if (me > bot) System.out.println("Вы выиграли.");
                else if (me < bot)System.out.println("Вы проиграли.");
                else System.out.println("Ничья.");
            }

            System.out.println("\n Сыграем еще раз? y/n");
            answer = input.nextLine();
            if (!answer.equals("y")) break;
        }
        System.out.println("\n Игра окончена.");
    }
}
