import java.util.ArrayList;

public class BoxWithMaxWeight  extends Box{

	private ArrayList<Item> itemList;
	private int capacity;

	public BoxWithMaxWeight(int capacity) {
		this.itemList = new ArrayList<>();
		this.capacity = capacity;
	}
	@Override
	public void add(Item item) {
		int weight = 0;
		for (Item items : itemList) {
			weight += items.getWeight();
		}
		if (capacity < weight + item.getWeight()) {
			return;
		}
		itemList.add(item);
	}

	@Override
	public boolean isInBox(Item item) {
		if (itemList.contains(item)) {
			return true;
		}
		return false;
	}

	
}
