package zadanieWojna;

import java.util.List;

public class RarityBatle implements Battle{

    @Override
    public int checkWinner(List<Card> deck1, List<Card> deck2) {

        int deck1RareCounter = 0;
        for(Card c: deck1) {
            if(c.isRare()) deck1RareCounter ++;
        }

        int deck2RareCounter = 0;
        for(Card c: deck2) {
            if(c.isRare()) deck2RareCounter ++;
        }

        if(deck1RareCounter > deck2RareCounter) {
            return 1;
        } else if(deck1RareCounter < deck2RareCounter) {
            return  -1;
        } else
            return 0;
    }
}
