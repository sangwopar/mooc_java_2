import java.util.Scanner;

public class UserInterface {
	private TodoList todoList;
	private Scanner scanner;

	public UserInterface(TodoList todoList, Scanner scanner) {
		this.todoList = todoList;
		this.scanner = scanner;
	}

	public void start() {

		while (true) {
			System.out.print("Command: ");
			String input = scanner.nextLine();
			if (input.equals("stop")) {
				break;
			} else {
				if (input.equals("add")) {
					System.out.print("To add: ");
					String todo = scanner.nextLine();
					todoList.add(todo);
				} else if (input.equals("list")) {
					todoList.print();
				} else if (input.equals("remove")) {
					System.out.print("Which one is removed? ");
					int number = Integer.valueOf(scanner.nextLine());
					todoList.remove(number);
				}
			}
		}
	}

}
