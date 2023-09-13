
import java.util.ArrayList;
import java.util.Random;

public class LotteryRow {

    private Random random;
    private ArrayList<Integer> numbers;

    public LotteryRow() {
        // Draw the numbers when the LotteryRow is created
        this.random = new Random();
        this.randomizeNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void randomizeNumbers() {
        // Initialize the list for numbers
        this.numbers = new ArrayList<>();
        for (numbers.size(); numbers.size()<7;) {
            int num = random.nextInt(40) + 1;
            if (!containsNumber(num)) {
                numbers.add(num);
            }
        }
        // Implement the random number generation here
        // the method containsNumber is probably useful
    }

    public boolean containsNumber(int number) {
        // Check here whether the number is among the drawn numbers
        if (numbers.contains(number)) {
            return true;
        }
        return false;
    }
}

