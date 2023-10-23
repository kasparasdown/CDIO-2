import java.util.Random;
import java.util.Scanner;

public class Die {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        Random rand = new Random();
        int die1 = 0;
        int die2 = 0;
        int n = 0;

        while (true) {
            System.out.print("Write a number between 1 and 11 to choose the dice: ");
            n = scanner.nextInt();

            if (n > 0 && n < 12) {
                break;
            } else {
                System.out.println("Wrong input! Please enter a number between 1 and 11.");
            }
        }
        die1 = rand.nextInt(n) + 1;
        die2 = rand.nextInt(12 - n) + 1;
        System.out.println("Die 1: " + die1 + "\nDie 2: " + die2);
        scanner.close();
    }
}