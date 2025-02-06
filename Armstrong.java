import java.util.Scanner;
public class Armstrong{
    public static void main(Sring[] args){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the number");
        int num =sc.nextInt();
        int n=num;
        //num numdigits=Integer.toString(num).length();
        int numdigits=String.valueOf(num).length();
        double newnum=0;
        while(num>0){
            int rem=num%10;
            num=num/10;
            newnum=newnum+Math.pow(rem,numdigits);
        }
        if(n==newnum)
        System.out.println(n+"is an armstrong number");
        elseSystem.out.println(n+"is not an armstrong number");
        sc.close();
    }
}   23