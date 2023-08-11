import java.util.LinkedList;
import java.util.Scanner;

public class linkedList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        LinkedList<Integer> linkedList = new LinkedList<>();
        
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        
        System.out.println("Enter " + n + " elements (numbers in the range of 1-50):");
        for (int i = 0; i < n; i++) {
            int element = scanner.nextInt();
            if (element >= 1 && element <= 50) {
                linkedList.add(element);
            } else {
                System.out.println("Invalid input. Please enter a number in the range of 1-50.");
                i--; // Decrement the counter to retry this input
            }
        }
        
        // Deleting nodes with values greater than 25
        deleteNodesGreaterThan25(linkedList);
        
        // Displaying the modified linked list
        System.out.println("Linked list after deleting nodes with values greater than 25:");
        for (int element : linkedList) {
            System.out.print(element + " ");
        }
        
        scanner.close();
    }
    
    // Function to delete nodes with values greater than 25
    public static void deleteNodesGreaterThan25(LinkedList<Integer> linkedList) {
        linkedList.removeIf(value -> value > 25);
    }
}
