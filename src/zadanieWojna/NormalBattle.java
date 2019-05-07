package zadanieWojna;

import java.util.List;

public class NormalBattle implements Battle {


    @Override
    public int checkWinner(List<Card> deck1, List<Card> deck2) {

        boolean card1won = false;
        boolean card2won = false;
        int index1 = 0;
        int index2 = 0;

        while (true) {
            Card c1 = deck1.get(index1);
            Card c2 = deck2.get(index2);

            if (c1.getValue() > c2.getValue()) {
                card1won = true;
                card2won = false;
            } else if (c1.getValue() < c2.getValue()) {
                card1won = false;
                card2won = true;
            } else {
                card1won = false;
                card2won = false;
            }

            if (!card1won) index1++;
            if (!card2won) index2++;

            if ((index1 >= deck1.size()) && (index2 < deck2.size())) {
                return 1;
            } else if ((index2 >= deck2.size()) && (index1 < deck1.size())) {
                return -1;
            } else if ((index1 == deck1.size()) && (index2 == deck2.size())) {
                return 0;
            }
        }
    }
}
