package session8_array_vs_arraylist.practice;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListVersusLinkedList {

    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();

        for (int index = 0; index < 500_000; index++) {
            arrayList.add(String.valueOf(index));
            linkedList.add(String.valueOf(index));
        }

        long startTimerArrayList = System.currentTimeMillis();
        for (int index = 0; index < 100_000; index++) {
            arrayList.add(0, String.valueOf(index));
        }
        long endTimerArrayList = System.currentTimeMillis();


        long startTimerLinkedList = System.currentTimeMillis();
        for (int index = 0; index < 100_000; index++) {
            linkedList.add(0, String.valueOf(index));
        }
        long endTimerLinkedList = System.currentTimeMillis();

        System.out.println("ArrayList time: " + (endTimerArrayList - startTimerArrayList));
        System.out.println("LinkedList time: " + (endTimerLinkedList - startTimerLinkedList));
    }
}
