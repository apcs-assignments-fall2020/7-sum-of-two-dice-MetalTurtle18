import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class MyMain {

    // Rolls a single die
    // Returns a random integer between 1 and 6
    public static int rollDie() {
        return ThreadLocalRandom.current().nextInt(1, 7);
    }

    // Rolls two dice n times
    // This method returns an int array of size 11, where each element is
    // the number of times a certain sum of two dice was rolled
    public static int[] sumOfTwoDice(int n) {
        int[] rolls = new int[11];
        for (int i = 0; i < n; i++) rolls[(rollDie() + rollDie()) - 2]++;
        return rolls;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many pairs of dice would you like to roll? ");
        int n = scan.nextInt();
        int[] rolls = sumOfTwoDice(n);
        for (int i = 0; i < 11; i++) System.out.println("% of rolls where sum == " + (i + 2) + ": " + (rolls[i] / (double) n) * 100);
        scan.close();
    }
}
