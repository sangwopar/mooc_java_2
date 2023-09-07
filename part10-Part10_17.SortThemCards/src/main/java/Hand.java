import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Hand implements Comparable<Hand>{
	
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

	@Override
	public int compareTo(Hand o) {
		int thisValue = this.cards.stream().map(s -> s.getValue())
			.reduce(0, (s1, s2) -> s1 + s2);
		int thatValue = o.cards.stream().map(s -> s.getValue())
			.reduce(0, (s1, s2) -> s1 + s2);
		System.out.println("this:" + thisValue + "; that" + thatValue);
		return thisValue - thatValue;
	}	
	
}
