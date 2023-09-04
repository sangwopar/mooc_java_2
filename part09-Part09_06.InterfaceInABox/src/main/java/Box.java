import java.util.ArrayList;

public class Box implements Packable{
	private double MaxWeight;
	private ArrayList<Packable> packablesList;

	public Box(double weight) {
		this.MaxWeight = weight;
		this.packablesList = new ArrayList<>();
	}
	
	public void add(Packable packable) {
		if (MaxWeight < weight() + packable.weight()) {
			return;
		}
		packablesList.add(packable);
	}

	@Override
	public double weight() {
		double weight = 0;
		for (Packable packable : packablesList) {
			weight += packable.weight();
		}
		return weight;
	}

	@Override
	public String toString() {
		return "Box: " + packablesList.size() + " items, " + "total weight " + weight() + " kg";
	}	
	
	
}
