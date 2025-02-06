public class LogicalOperatorsDemo {

    public static void main(String[] args) {
        // Initialize variables
        boolean a = true;
        boolean b = false;

        // Logical AND (&&)
        System.out.println("a && b: " + (a && b)); // Output: false

        // Logical OR (||)
        System.out.println("a || b: " + (a || b)); // Output: true

        // Logical NOT (!)
        System.out.println("!a: " + !a); // Output: false

        // Example with conditions
        int x = 10;
        int y = 5;

        if (x > 0 && y > 0) {
            System.out.println("Both x and y are positive.");
        }

        if (x > 0 || y < 0) {
            System.out.println("At least one condition is true.");
        }
    }
}
