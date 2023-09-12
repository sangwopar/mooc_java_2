
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // test your method here
        int[] numbers = { 8, 2, 9, 1, 1 };
        System.out.println(sum(numbers, 0, numbers.length, 0, 999));

    }

    public static int sum(int[] array, int fromwhere, int towhere, int smallest,
            int largest) {
        int sum = 0;
        if (fromwhere < 0) {
            fromwhere = 0;
        }
        if (array.length < towhere) {
            towhere = array.length;
        }
        for (int i = fromwhere; i < towhere; i++) {
            if (array[i] >= smallest && array[i] <= largest) {
                sum += array[i];
            }
        }
        return sum;
    }

}
