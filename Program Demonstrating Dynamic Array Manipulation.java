import java.util.ArrayList;

public class DynamicArrayDemo {
    public static void main(String[] args) {
        // Create a dynamic array using ArrayList
        ArrayList<Integer> dynamicArray = new ArrayList<>();

        // Adding elements
        dynamicArray.add(10);
        dynamicArray.add(20);
        dynamicArray.add(30);
        dynamicArray.add(40);
        
        System.out.println("Array after adding elements: " + dynamicArray);

        // Removing an element
        dynamicArray.remove(Integer.valueOf(20)); // Removes first occurrence of 20
        System.out.println("Array after removing 20: " + dynamicArray);

        // Accessing an element
        int element = dynamicArray.get(1); // Access element at index 1
        System.out.println("Element at index 1: " + element);

        // Display the size
        System.out.println("Size of the array: " + dynamicArray.size());
    }
}
