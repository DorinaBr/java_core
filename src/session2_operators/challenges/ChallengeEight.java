package session2_operators.challenges;

import java.util.Scanner;

//Create a program that takes two byte values, adds them together, and stores the result in a byte variable.
public class ChallengeEight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Type the first byte value: ");
        byte firstByte = scanner.nextByte();

        System.out.println("Type a second byte value: ");
        byte secondByte = scanner.nextByte();

        System.out.println("The sum of the 2 values: " + (firstByte + secondByte));
    }
}
