import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Hand implements Comparable<Hand> {

	private List<Card> cards;

	public Hand() {
		this.cards = new ArrayList<>();
	}

	public void add(Card card) {
		this.cards.add(card);
	}

	public void print() {
		cards.stream().forEach(s -> System.out.println(s));
	}

	public void sort() {
		Collections.sort(cards);
	}

	public void sortBySuit() {
		Collections.sort(cards, new BySuitInValueOrder());

	}

	private int sumOfvalues() {
		int sum = 0;
		for (Card card : cards) {
			sum += card.getValue();
		}
		return sum;
	}

	@Override
	public int compareTo(Hand o) {
		return this.sumOfvalues() - o.sumOfvalues();
	}

}
