import java.util.Scanner;
public class UserInput1
{
    public static vioid main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter an integer number");
        int i=sc.nextInt();
        System.out.println("int;"+1);

        System.out.println("Enter an float number");
        float f=sc.nextFloat();
        System.out.println("floatf;"+f);

        System.out.println("Enter an double number");
        double d=sc.nextDouble();
        System.out.println("double d;"+d);

        System.out.println("Enter a string");
        String s=sc.next();
        System.out.println("String s:"+s);

        System.out.println("Enter a character");
        char c=sc.next().charAt(0);
        System.out.println("char c:"+c);
        sc.close();
    }
}