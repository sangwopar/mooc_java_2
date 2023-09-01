import java.util.HashMap;

public class Abbreviations {
	
	private HashMap<String,String> abbHashMap;

	public Abbreviations() {
		this.abbHashMap = new HashMap<>();
	}

	public void addAbbreviation(String abbreviation, String explanation) {
		if (this.hasAbbreviation(abbreviation)) {
			return;
		} else {
			abbHashMap.put(abbreviation, explanation);
		}
	}

	public boolean hasAbbreviation(String abbreviation) {
		if (abbHashMap.containsKey(abbreviation)) {
			return true;
		} else {
			return false;
		}

	}
	public String findExplanationFor(String abbreviation) {
		return abbHashMap.get(abbreviation);
	}

	
	
}
