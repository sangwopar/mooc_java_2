
import java.util.HashMap;

public class Program {

    public static void main(String[] args) {
        // Test your program here!
    }

    public static void printKeys(HashMap<String,String> hashMap) {
        for (String str : hashMap.keySet()) {
            System.out.println(str);
        }
    }

    public static void printKeysWhere(HashMap<String,String> hashMap, String text) {
        for (String str : hashMap.keySet()) {
            if(str.contains(text)) {
                System.out.println(str);
            }
        }

    }

    public static void printValuesOfKeysWhere(HashMap<String,String> hashMap, String text) {
        for (String str : hashMap.keySet()) {
            if(str.contains(text)) {
                System.out.println(hashMap.get(str));
            }
        }

    }

}
