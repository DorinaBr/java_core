package session8.practice;

import java.util.Arrays;

public class ArraysPractice {

    public static void main(String[] args) {
        int[] numbers = {1, 5, 8, 9, 4};
        String[][] names = {{"Mr. ", "Ms."}, {"Alice ", "Ana"}};

        sortArray(numbers);
        System.out.println("printed array: " + Arrays.toString(numbers));
        System.out.println("Binary search index value: " + Arrays.binarySearch(numbers, 9));

        int firstArrayNumber = numbers[0];
        System.out.println("First array number: " + firstArrayNumber);
        printArrayAverage(numbers);
        print2DArray(names);
    }

    public static void sortArray(int[] array) {
        Arrays.sort(array);
    }

    public static void printArrayAverage(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }

        int average = sum / numbers.length;
        System.out.println("Arrays average: " + average);
    }

    public static void print2DArray(String[][] names) {
        for (int index = 0; index < names.length; index++) {
            for (int index2 = 0; index2 < names[index].length; index2++) {
                System.out.print(names[index][index2] + " ");
            }
            System.out.println();
        }
    }
}
