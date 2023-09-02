import java.util.ArrayList;
import java.util.HashMap;

public class StorageFacility {
	private HashMap<String, ArrayList<String>> storageMap;

	public StorageFacility() {
		this.storageMap = new HashMap<>();
	}


	public void add(String unit, String item) {
		if (storageMap.containsKey(unit)) {
			storageMap.get(unit).add(item);
		} else {
			storageMap.put(unit, new ArrayList<>());
			storageMap.get(unit).add(item);
		}

		// tmc 사이트 정답 위 코드와 같은 정답임
		// this.unitsAndContents.putIfAbsent(unit, new ArrayList<>());
        // this.unitsAndContents.get(unit).add(item);

	}

	public ArrayList<String> contents(String storageUnit) {
		if (storageMap.containsKey(storageUnit)) {
			return storageMap.get(storageUnit);
		}
		return new ArrayList<>();

		// tmc 사이트 정답 위 코드와 같은 정답임
		//return this.unitsAndContents.getOrDefault(storageUnit, new ArrayList<>());

	}
	public void remove(String storageUnit, String item) {
		for (String str : storageMap.get(storageUnit)) {
			if (str.equals(item)) {
				storageMap.get(storageUnit).remove(str);
				break;
			}
		}

		if (storageMap.get(storageUnit).size() == 0) {
			storageMap.remove(storageUnit);
		}


		// tmc 사이트 정답 위 코드와 같은 정답임
		// if (!this.unitsAndContents.containsKey(storageUnit)) {
        //     return;
        // }
 
        // this.unitsAndContents.get(storageUnit).remove(item);
 
        // if (this.unitsAndContents.get(storageUnit).isEmpty()) {
        //     this.unitsAndContents.remove(storageUnit);
        // }
	}

	public ArrayList<String> storageUnits() {
		ArrayList<String> result = new ArrayList<>();
		for (String str : storageMap.keySet()) {
			result.add(str);
		}

		return result;
	}
	
}
