// public class Alphabet {
//     public static void main(String[] args) {
//         for (char c = 'a'; c <= 'z'; c++) {
//             System.out.print(c + " ");
//         }
//     }
// }


// public class ReverseAlphabet {
//     public static void main(String[] args) {
//         for (char c = 'Z'; c >= 'A'; c--) {
//             System.out.print(c + " ");
//         }
//     }
// }


// public class SumOddNumbers {
//     public static void main(String[] args) {
//         int sum = 0;
//         for (int i = 1; i <= 50; i += 2) {
//             sum += i;
//         }
//         System.out.println("Sum of odd numbers between 1 to 50: " + sum);
//     }
// }



// import java.util.Scanner;

// public class Weekday {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter a weekday number (1-7): ");
//         int day = scanner.nextInt();

//         switch (day) {
//             case 1: System.out.println("Sunday"); break;
//             case 2: System.out.println("Monday"); break;
//             case 3: System.out.println("Tuesday"); break;
//             case 4: System.out.println("Wednesday"); break;
//             case 5: System.out.println("Thursday"); break;
//             case 6: System.out.println("Friday"); break;
//             case 7: System.out.println("Saturday"); break;
//             default: System.out.println("Invalid input");
//         }
//     }
// }


// import java.util.Scanner;

// public class VowelOrConsonant {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter a character: ");
//         char ch = scanner.next().toLowerCase().charAt(0);

//         switch (ch) {
//             case 'a':
//             case 'e':
//             case 'i':
//             case 'o':
//             case 'u': 
//                 System.out.println(ch + " is a vowel");
//                 break;
//             default:
//                 System.out.println(ch + " is a consonant");
//         }
//     }
// }


// import java.util.Scanner;

// public class ReverseDigits {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int number = scanner.nextInt();
        
//         int reversed = 0;
//         while (number != 0) {
//             int digit = number % 10;
//             reversed = reversed * 10 + digit;
//             number /= 10;
//         }
//         System.out.println("Reversed number: " + reversed);
//     }
// }


// import java.util.Scanner;

// public class SumOfDigits {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int number = scanner.nextInt();

//         int sum = 0;
//         while (number != 0) {
//             sum += number % 10;
//             number /= 10;
//         }
//         System.out.println("Sum of digits: " + sum);
//     }
// }


// import java.util.Scanner;

// public class ArmstrongNumber {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int number = scanner.nextInt();
        
//         int originalNumber = number;
//         int sum = 0;
//         int digits = String.valueOf(number).length();
        
//         while (number != 0) {
//             int digit = number % 10;
//             sum += Math.pow(digit, digits);
//             number /= 10;
//         }
        
//         if (sum == originalNumber) {
//             System.out.println(originalNumber + " is an Armstrong number.");
//         } else {
//             System.out.println(originalNumber + " is not an Armstrong number.");
//         }
//     }
// }

import java.util.Scanner;

// public class PrimeNumber {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int number = scanner.nextInt();

//         boolean isPrime = true;
        
//         if (number <= 1) {
//             isPrime = false;
//         } else {
//             for (int i = 2; i <= Math.sqrt(number); i++) {
//                 if (number % i == 0) {
//                     isPrime = false;
//                     break;
//                 }
//             }
//         }
        
//         if (isPrime) {
//             System.out.println(number + " is a prime number.");
//         } else {
//             System.out.println(number + " is not a prime number.");
//         }
//     }
// }


// import java.util.Scanner;

// public class ArithmeticOperations {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
        
//         System.out.println("Select an operation:");
//         System.out.println("1. Addition");
//         System.out.println("2. Subtraction");
//         System.out.println("3. Multiplication");
//         System.out.println("4. Division");
//         System.out.print("Enter your choice: ");
//         int choice = scanner.nextInt();
        
//         System.out.print("Enter first number: ");
//         int num1 = scanner.nextInt();
//         System.out.print("Enter second number: ");
//         int num2 = scanner.nextInt();
        
//         switch (choice) {
//             case 1:
//                 System.out.println("Result: " + (num1 + num2));
//                 break;
//             case 2:
//                 System.out.println("Result: " + (num1 - num2));
//                 break;
//             case 3:
//                 System.out.println("Result: " + (num1 * num2));
//                 break;
//             case 4:
//                 if (num2 != 0) {
//                     System.out.println("Result: " + (num1 / num2));
//                 } else {
//                     System.out.println("Error! Division by zero.");
//                 }
//                 break;
//             default:
//                 System.out.println("Invalid choice");
//         }
//     }
// }


import java.util.Scanner;

public class AverageOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int N = scanner.nextInt();

        int sumOdd = 0, sumEven = 0;
        int oddCount = 0, evenCount = 0;

        // Calculating sum of first N odd numbers
        for (int i = 1; oddCount < N; i += 2) {
            sumOdd += i;
            oddCount++;
        }

        // Calculating sum of first N even numbers
        for (int i = 2; evenCount < N; i += 2) {
            sumEven += i;
            evenCount++;
        }

        System.out.println("Average of first " + N + " odd numbers: " + (sumOdd / (double)N));
        System.out.println("Average of first " + N + " even numbers: " + (sumEven / (double)N));
    }
}
