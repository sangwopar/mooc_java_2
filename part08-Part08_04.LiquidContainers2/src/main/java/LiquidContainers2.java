
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        Container first = new Container();
        Container second = new Container();
        while (true) {
            System.out.print("> ");
            System.out.println("First: " + first);
            System.out.println("Second: " + second);
            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            } else {
                String[] parts = input.split(" ");
                int liquid = Integer.valueOf(parts[1]);
                String command = parts[0];
                if (command.equals("add")) {
                    first.add(liquid);
                } else if(command.equals("move")) {
                    if (first.contains() < liquid) {
                        second.add(first.contains());
                        first.remove(liquid);
                    } else {
                        second.add(liquid);
                        first.remove(liquid);
                    }
                } else if (command.equals("remove")) {
                    second.remove(liquid);
                }
            }

        }
    }

}
