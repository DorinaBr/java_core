package session4_operators_decision_constructs.challenges;

/*Write a Java program to declare two integer variables firstNumber and secondNumber with any values.
 Use an equality operator to compare these two numbers and print the result. Do the same for two String objects firstString and secondString with the same value,
 but use the equals() method for comparison. Print the result.*/
public class ChallengeTwo {
    public static void main(String[] args) {
        int firstNumber = 5;
        int secondNumber = 7;
        System.out.println(firstNumber == secondNumber);

        String firstString = "Hello";
        String secondString = "Hello";
        System.out.println(firstString.equals(secondString));
    }
}
