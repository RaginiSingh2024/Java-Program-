public class StringEx1{
    public static void main(String[]args){
        System.out.println(sch2);


        //******Concatenation of String******
        String s3=s1+s2;
        System.out.println(s3);
        String s4=s3+4+4;
        System.out.println(s4+23);
        String s41=s4.concat(str:"55");
        System.out.println(s41);
        s41.concat(str:"66");
        System.out.println(s41);


        // //******Stringpool***
        // String s5="abc";
        // String s6="abc";
        // String s66=new String(orginal:"abc");
        // if(s5==s6)
        //   System.out.println(x:"s5 equal to 56");

        //   if(s6==s66)
        //   System.out.println(x:s6 not equal to s66");

        //   String s7 = new String(orginal:"xyz");



    }
}


//*****Converting different type to String****
int a=1234;
double b=-1234.56;
boolean c=false;
String str1=Integer.toString(a);
String str2 =String.valueOf(b);
String str3=""+c;
System.