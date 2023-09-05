import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Hand implements Comparable<Hand>{
    private ArrayList<Card> cards;
    public Hand(){
        cards = new ArrayList<>();
    }
    public void add(Card card){
        cards.add(card);
    }
    public void print(){
        Iterator<Card> iterator = cards.iterator();
        while (iterator.hasNext()) {
            Card nextInLine = iterator.next();
            System.out.println(nextInLine);
        }
    }
    public void sort(){
        cards.sort(Card::compareTo);
    }

    @Override
    public int compareTo(Hand o) {
        int thisHandValue = 0;
        int otherHandValue = 0;

        for (Card card : cards) {
            thisHandValue += card.getValue();
        }

        for (Card card : o.cards) {
            otherHandValue += card.getValue();
        }

        return Integer.compare(thisHandValue, otherHandValue);
    }

    public void sortBySuit() {
        Collections.sort(cards, new BySuitInValueOrder());
    }
}
