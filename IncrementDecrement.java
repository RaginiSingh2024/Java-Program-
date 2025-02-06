//  Que 7 // public class VariableDemo {
//     public static void main(String[] args) {
//         byte b = 100;
//         short s = 30000;
//         int i = 123456;
//         long l = 123456789L;
//         float f = 10.5f;
//         double d = 20.99;
//         char c = 'A';
//         boolean bool = true;

//         System.out.println("Byte: " + b);
//         System.out.println("Short: " + s);
//         System.out.println("Int: " + i);
//         System.out.println("Long: " + l);
//         System.out.println("Float: " + f);
//         System.out.println("Double: " + d);
//         System.out.println("Char: " + c);
//         System.out.println("Boolean: " + bool);
//     }
// }
 


// QUE9// public class ExplicitConversion {
//     public static void main(String[] args) {
//         double d = 9.99;
//         int i = (int) d;  // Explicit conversion
//         System.out.println("Double: " + d);
//         System.out.println("Integer: " + i);
//     }
// }


// QUE 10 public class ImplicitConversion {
//     public static void main(String[] args) {
//         int x = 100;
//         long y = x;  // Implicit conversion from int to long
//         System.out.println("Int: " + x);
//         System.out.println("Long: " + y);
//     }
// }



// Que 12 public class ArithmeticOperators {
//     public static void main(String[] args) {
//         int a = 10, b = 5;
//         System.out.println("Addition: " + (a + b));
//         System.out.println("Subtraction: " + (a - b));
//         System.out.println("Multiplication: " + (a * b));
//         System.out.println("Division: " + (a / b));
//         System.out.println("Modulus: " + (a % b));
//     }
// }


public class IncrementDecrement {
    public static void main(String[] args) {
        int x = 5;
        System.out.println("Post-increment: " + x++);
        System.out.println("Pre-increment: " + ++x);
        System.out.println("Post-decrement: " + x--);
        System.out.println("Pre-decrement: " + --x);
    }
}
