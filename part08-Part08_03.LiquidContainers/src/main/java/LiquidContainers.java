
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int first = 0;
        int second = 0;
        while (true) {
            System.out.print("> ");
            System.out.println("First: " + first + "/100");
            System.out.println("Second: " + second + "/100");
            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            } else {
                String[] parts = input.split(" ");
                String command = parts[0];
                int liquid = Integer.valueOf(parts[1]);
                if (liquid < 0) {
                    continue;
                }
                if (command.equals("add")) {
                    if (first + liquid <= 100) {
                        first += liquid;
                    } else {
                        first = 100;
                    }
                } else if (command.equals("move")) {
                    if (first < liquid) {
                        int temp = first;
                        first = 0;
                        second += temp;
                    } else {
                        first -= liquid;
                        second += liquid;
                    }
                    if (second > 100) {
                        second = 100;
                    }
                } else if (command.equals("remove")) {
                    second -= liquid;
                    if (second < 0) {
                        second = 0;
                    }
                }
            }
        }
    }

}
