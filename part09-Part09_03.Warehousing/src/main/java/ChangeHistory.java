import java.util.ArrayList;

public class ChangeHistory {

	private ArrayList<Double> list;

	public ChangeHistory() {
		this.list = new ArrayList<>();
	}
	
	public void add(double status) {
		this.list.add(status);
	}

	public void clear() {
		this.list.clear();
	}

	public double maxValue() {
		if (list.isEmpty()) {
			return 0.0;
		}
		double max = list.get(0);
		for (int i=0; i<list.size(); i++) {
			if (list.get(i) > max) {
				max = list.get(i);
			}
		}
		return max;
	}

	public double minValue() {
		if (list.isEmpty()) {
			return 0.0;
		}
		double min = list.get(0);
		for (double history : list) {
			if (history < min) {
				min = history;
			}
		}
		return min;
	}

	public double average() {
		if (list.isEmpty()) {
			return 0.0;
		}
		double sum = 0;
		for (int i=0; i<list.size(); i++) {
			sum += list.get(i);
		}
		return sum / list.size();

	}

	@Override
	public String toString() {
		return list.toString();
	}

}
