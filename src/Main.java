import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //variable definitions and scanner initialization
        Scanner scanner = new Scanner(System.in);
        int[] list = {15, 12, 788, 1, -1, -778, 2, 0};
        int lowerNumber = Integer.MIN_VALUE;
        int greaterNumber = Integer.MAX_VALUE;

        //sort the array for correct comparisons
        Arrays.sort(list);

        //get user input
        System.out.println("Please enter a number: ");
        int input = scanner.nextInt();

        for (int number : list) {
            if (number < input && number > lowerNumber) {
                lowerNumber = number;
            } else if (number > input && number < greaterNumber) {
                greaterNumber = number;
            }
        }

        System.out.println("Closest smaller number: " + lowerNumber);
        System.out.println("Closest greater number: " + greaterNumber);
    }
}