import java.util.*;

public class Array_VS_Linked {
    public static void main(String[] args) {
        final int SIZE = 1000;

        // ArrayList performance test
        ArrayList<Integer> arrayList = new ArrayList<>();
        long startTime = System.nanoTime();
        for (int i = 0; i < SIZE; i++) {
            arrayList.add(i);
        }
        long endTime = System.nanoTime();
        long arrayListAddTime = endTime - startTime;
        System.out.println("ArrayList add time: " + arrayListAddTime + " ns");

        startTime = System.nanoTime();
        for (int i = 0; i < SIZE; i++) {
            arrayList.get(i);
        }
        endTime = System.nanoTime();
        long arrayListAccessTime = endTime - startTime;
        System.out.println("ArrayList access time: " + arrayListAccessTime + " ns");

        startTime = System.nanoTime();
        for (int i = SIZE - 1; i >= 0; i--) {
            arrayList.remove(i);
        }
        endTime = System.nanoTime();
        long arrayListRemoveTime = endTime - startTime;
        System.out.println("ArrayList remove time: " + arrayListRemoveTime + " ns");

        // LinkedList performance test
        LinkedList<Integer> linkedList = new LinkedList<>();
        startTime = System.nanoTime();
        for (int i = 0; i < SIZE; i++) {
            linkedList.add(i);
        }
        endTime = System.nanoTime();
        long linkedListAddTime = endTime - startTime;
        System.out.println("LinkedList add time: " + linkedListAddTime + " ns");

        startTime = System.nanoTime();
        for (int i = 0; i < SIZE; i++) {
            linkedList.get(i);
        }
        endTime = System.nanoTime();
        long linkedListAccessTime = endTime - startTime;
        System.out.println("LinkedList access time: " + linkedListAccessTime + " ns");

        startTime = System.nanoTime();
        for (int i = SIZE - 1; i >= 0; i--) {
            linkedList.remove(i);
        }
        endTime = System.nanoTime();
        long linkedListRemoveTime = endTime - startTime;
        System.out.println("LinkedList remove time: " + linkedListRemoveTime + " ns");
    }
}