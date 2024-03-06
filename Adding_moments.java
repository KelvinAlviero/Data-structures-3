import java.util.LinkedList;

public class Adding_moments {
    public static void main(String[] args) {
        // Create a LinkedList
        LinkedList<Integer> linkedList = new LinkedList<>();

        // Add elements to the LinkedList
        linkedList.add(5);
        linkedList.add(7);
        linkedList.add(10);
        linkedList.add(30);

        // Calculate the sum of all elements in the LinkedList
        int sum = 0;
        for (int num : linkedList) {
            sum += num;
        }

        // Print the sum
        System.out.println("Sum of all elements in the LinkedList: " + sum);
    }
}
