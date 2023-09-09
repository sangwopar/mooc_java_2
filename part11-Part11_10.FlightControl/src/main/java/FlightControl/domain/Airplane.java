package FlightControl.domain;

/**
 * Airplane
 */
public class Airplane {
	private String id;
	private int capicity;

	public Airplane(String id, int capicity) {
		this.id = id;
		this.capicity = capicity;
	}
	public String getId() {
		return id;
	}
	public int getCapicity() {
		return capicity;
	}

	@Override
	public String toString() {
		return id + " (" + capicity + " capacity)";
	}
	
}