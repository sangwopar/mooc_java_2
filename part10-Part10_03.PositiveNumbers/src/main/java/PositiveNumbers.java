
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // test your method here
        List<Integer> list = new ArrayList<>();
        System.out.println("go");
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("end")) {
                break;
            }
            list.add(Integer.valueOf(input));
            
        }
    List<Integer> list2 = positive(list);
    for (Integer num : list2) {
        System.out.println(num);
    }

    }

    public static List<Integer> positive(List<Integer> numbers) {
       List<Integer> list = numbers.stream().filter(v -> v > 0).collect(Collectors.toList());
       
       return list;
    }

}
