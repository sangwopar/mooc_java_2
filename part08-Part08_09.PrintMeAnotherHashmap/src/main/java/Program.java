
import java.util.HashMap;

public class Program {

    public static void main(String[] args) {
        // Test your program here!
    }

    public static void printValues(HashMap<String, Book> hashMap) {
        for (String str : hashMap.keySet()) {
            System.out.println(hashMap.get(str));
        }
    }

    public static void printValueIfNameContains(HashMap<String,Book> hashMap, String text) {
        for (String str : hashMap.keySet()) {
            if (hashMap.get(str).getName().contains(text)) {
                System.out.println(hashMap.get(str));
            }
        }
    }



}
