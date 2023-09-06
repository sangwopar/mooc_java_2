
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // toteuta ohjelmasi tänne
        List<String> list = new ArrayList<>();
        System.out.println("Input numbers, type \"end\" to stop.");
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("end")) {
                break;
            }
            list.add(input);
        }
        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
        String ifstr = scanner.nextLine();
        if (ifstr.equals("n")) {
            Double average = list.stream().mapToInt(s -> Integer.valueOf(s))
                .filter(f -> f < 0 ? true : false).average().getAsDouble();
            System.out.println("Average of the negative numbers: " + average);
        } else if (ifstr.equals("p")) {
            Double average = list.stream().mapToInt(s -> Integer.valueOf(s))
                .filter(s -> s > 0 ? true : false).average().getAsDouble();
            System.out.println("Average of the positive numbers: " + average);
        }

    }
}
