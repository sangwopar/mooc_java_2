package dictionary;

public class Dictionary {
	private String word;
	private String translate;

	


	public Dictionary(String word, String ranslation) {
		this.word = word;
		this.translate = ranslation;
	}




	@Override
	public String toString() {
		return "Dictionary [word=" + word + ", ranslation=" + translate + "]";
	}




	public String getWord() {
		return word;
	}




	public String getTranslate() {
		return translate;
	}

	
	
}
