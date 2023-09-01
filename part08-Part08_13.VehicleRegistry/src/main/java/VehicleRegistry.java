
import java.util.ArrayList;
import java.util.HashMap;

public class VehicleRegistry {
	private HashMap<LicensePlate, String> licensePlatesMap;

	public VehicleRegistry() {
		this.licensePlatesMap = new HashMap<>();
	}

	public boolean add(LicensePlate licensePlate, String owner) {
		if (this.licensePlatesMap.containsKey(licensePlate)) {
			return false;
		} else {
			licensePlatesMap.put(licensePlate, owner);
			return true;
		}
	}

	public String get(LicensePlate licensePlate) {
		return licensePlatesMap.get(licensePlate);
	}

	public boolean remove(LicensePlate licensePlate) {
		if (!(licensePlatesMap.containsKey(licensePlate))) {
			return false;
		}
		licensePlatesMap.remove(licensePlate);
		return true;
	}

	public void printLicensePlates() {
		for (LicensePlate license : licensePlatesMap.keySet()) {
			System.out.println(license);
		}
	}

	public void printOwners() {
		ArrayList<String> owners = new ArrayList<>();

		for (String owner : licensePlatesMap.values()) {
			if (!(owners.contains(owner))) {
				System.out.println(owner);
				owners.add(owner);
			}
		}
	}
	
}
