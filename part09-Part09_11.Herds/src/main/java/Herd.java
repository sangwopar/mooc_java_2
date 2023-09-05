import java.util.ArrayList;
import java.util.List;

public class Herd implements Movable{
	private List<Movable> organisms;

	public Herd() {
		this.organisms = new ArrayList<>();
	}

	public void addToHerd(Movable movable) {
		organisms.add(movable);
	}

	@Override
	public void move(int dx, int dy) {
		for (Movable movable : organisms) {
			movable.move(dx, dy);
		}
	}
	
	@Override
	public String toString() {
		String result = "";
		for (int i=0; i<organisms.size(); i++) {
			if (i == organisms.size() - 1) {
				result += organisms.get(i).toString();
				break;
			}
			result +=  organisms.get(i).toString() + "\n";
		}
		// for (Movable movable : organisms) {
		// 	result += movable.to
		// }
		return result;
	}

	
}
