public class IncrementDecrementDemo {

    public static void main(String[] args) {
        // Initialize variables
        int x = 5;
        int y = 10;

        // Prefix increment
        System.out.println("Prefix increment of x: " + ++x); // Output: 6

        // Postfix increment
        System.out.println("Postfix increment of y: " + y++); // Output: 10
        System.out.println("Value of y after postfix increment: " + y); // Output: 11

        // Prefix decrement
        System.out.println("Prefix decrement of x: " + --x); // Output: 5

        // Postfix decrement
        System.out.println("Postfix decrement of y: " + y--); // Output: 11
        System.out.println("Value of y after postfix decrement: " + y); // Output: 10
    }
}