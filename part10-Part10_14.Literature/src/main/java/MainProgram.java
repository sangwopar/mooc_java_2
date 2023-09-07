
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        List<Book> list = new ArrayList<>();

        while (true) {
            System.out.println("Input the name of the book, empty stops: ");
            String bookName = scanner.nextLine();
            if (bookName.equals("")) {
                break;
            }
            System.out.println("Input the age recommendation: ");
            int age = Integer.valueOf(scanner.nextLine());
            list.add(new Book(bookName, age));
        }
        System.out.println(list.size() + " books in total.");
        Comparator<Book> comparator = Comparator.comparing(Book::getAge)
            .thenComparing(Book::getName);
        Collections.sort(list, comparator);
        list.stream().forEach(s -> System.out.println(s));

    }

}
