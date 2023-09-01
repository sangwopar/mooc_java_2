import java.util.HashMap;

public class IOU {
	
	private HashMap<String,Double> owe;

	public IOU() {
		this.owe = new HashMap<>();
	}

	public void setSum(String toWhom, double amount) {
		double debt = howMuchDoIOweTo(toWhom);
		debt += amount;
		this.owe.put(toWhom, debt);
	}

	public double howMuchDoIOweTo(String toWhom) {
		return owe.getOrDefault(toWhom, 0.0);
	}
}
