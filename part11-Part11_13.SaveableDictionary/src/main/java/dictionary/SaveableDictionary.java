package dictionary;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SaveableDictionary {

	private List<Dictionary> dictionaries = new ArrayList<>();
	private String file;

	public SaveableDictionary(String file) {
		this.file = file;
	}


	public SaveableDictionary() {

	}

	public boolean load() {
		try (Scanner fileReader = new Scanner(Paths.get(file))) {
			while (fileReader.hasNextLine()) {
				String line = fileReader.nextLine();
				String[] parts = line.split(":");
				add(parts[0], parts[1]);
			}
			return true;
		} catch (IOException e) {
			return false;
		}
	}
	
	public boolean save() {
		try {
			FileWriter fileWriter = new FileWriter(this.file);
			// fileWriter.write("\n");
			for (Dictionary dictionary : dictionaries) {
				fileWriter.write(dictionary.getWord() + ":" + dictionary.getTranslate() + "\n");
			}
			fileWriter.close();
			return true;
		} catch (IOException e) {
			return false;
		}
	}

	public void add(String words, String translation) {
		for (Dictionary dictionary : dictionaries) {
			if (dictionary.getWord().equals(words)) {
				return;
			}
		}
		dictionaries.add(new Dictionary(words, translation));

	}

	public String translate(String word) {
		String str = null;
		for (Dictionary dictionary : dictionaries) {
			if (dictionary.getWord().equals(word) || dictionary.getTranslate().equals(word)) {
				if (dictionary.getWord().equals(word)) {
					str = dictionary.getTranslate();
					return str;
				} else {
					str = dictionary.getWord();
					return str;
				}
			}
		}
		return str;
	}

	public void delete(String word) {
		dictionaries.stream().filter(s -> s.getWord().equals(word) || s.getTranslate().equals(word))
				.collect(Collectors.toList()).forEach(s -> dictionaries.remove(s));
	}

	// 이렇게도 가능
	//  private Map<String, String> words;
    // private String file;
 
    // public SaveableDictionary() {
    //     this.words = new HashMap<>();
    // }
 
    // public SaveableDictionary(String file) {
    //     this();
    //     this.file = file;
    // }
 
    // public boolean load() {
    //     try {
    //         Files.lines(Paths.get(this.file))
    //                 .map(l -> l.split(":"))
    //                 .forEach(parts -> {
    //                     this.words.put(parts[0], parts[1]);
    //                     this.words.put(parts[1], parts[0]);
    //                 });
    //         return true;
    //     } catch (IOException ex) {
    //         return false;
    //     }
    // }
 
    // public boolean save() {
    //     try {
    //         PrintWriter writer = new PrintWriter(new File(file));
    //         saveWords(writer);
    //         writer.close();
    //     } catch (Exception e) {
    //         return false;
    //     }
    //     return true;
    // }
 
    // public void add(String word, String translation) {
    //     if (words.containsKey(word)) {
    //         return;
    //     }
 
    //     words.put(word, translation);
    //     words.put(translation, word);
    // }
 
    // public String translate(String word) {
    //     return words.get(word);
    // }
 
    // public void delete(String word) {
    //     String translation = translate(word);
 
    //     words.remove(word);
    //     words.remove(translation);
    // }
 
    // private void saveWords(PrintWriter writer) throws IOException {
    //     List<String> allreadySaved = new ArrayList<>();
    //     words.keySet().stream().forEach(word -> {
    //         if (allreadySaved.contains(word)) {
    //             return;
    //         }
 
    //         String pari = word + ":" + words.get(word);
    //         writer.println(pari);
 
    //         allreadySaved.add(word);
    //         allreadySaved.add(words.get(word));
    //     });
    // }

}
