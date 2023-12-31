package session5_advanced_flow_control.challenges;

/*Create a program that asks the user for 10 numbers.
Print the sum of all numbers that are greater than 5.
If the user enters a number less than or equal to 5, use the continue statement to skip the addition for that number.*/

import java.util.Scanner;

public class ChallengeTwelve {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number;
        int sum = 0;
        int predefinedNumber = 5;

        for (int index = 1; index <= 10; index++) {
            System.out.println("Enter number " + index + " : ");
            number = scanner.nextInt();

            if (number > predefinedNumber) {
                sum = sum + number;

                while (number <= predefinedNumber) {
                    continue;
                }
            }
        }
        System.out.println("The sum of all numbers greater than 5 is: " + sum);
    }
}
