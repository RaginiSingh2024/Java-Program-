// # Function to print natural numbers in reverse
// def print_reverse(n):
//     for i in range(n, 0, -1):
//         print(i)

// # Input: The number from which to start printing in reverse
// n = int(input("Enter a number: "))
// print_reverse(n)

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
        }
    }
}
