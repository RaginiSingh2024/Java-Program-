//WAP to deonstrate mrthods of stringbuilder class
public class StringBuilderEx1{
    public static void main(String[] argv)
    {
        StringBuilder sb1=new StringBuilder(str:"Hello World");
        System.out.println(sb1);
        StringBuilder reverseSb = sb1.reverse();
        System.out.println("Reverse String ="+ reverseSb);
        System.out.println("Modifies StringBuilder ="+sb1);htmost occurrence of the specified substring//int last

        StringBuilder sb2=new StringBuilder();
        System.out.println("Capacity of StringBuilder ="+sb2.capacity()):

        //charAt(),indexOf(),length(),substring()sames as String
        //int lastindexOf(String str)
        //Returns the index within this string of the rigtmost occurence of the specified substring 
        //int lastindexOf(String str,int fromIndex)
        //Returns the index within this string of the last occurence of the specified substring
        //int length()
        //String substring(int start)
        /*
        //StringBuilder append(boolean b): Appends the string representation of the boolean arguement
        //StringBuilder append(char c)
        //StringBuilder append(char[] str)
        //StringBuilder append(char[] str,int offset,int len)
        //StringBuilder append(double d)
        //StringBuilder append(floiat f)
        //Stringbuilder append(int i)
        //StringBuilder append(long lng)
        //StringBuilder append(string str)
        */


    }
}
    sb2.append(str:"Hello");
    sb2.append(str:"");
    sb2.append(str:"world!");
    System.out.println(sb2.toString()); //output:"Hello world!"
    System.out.println(sb2); //output:"Hello world!"
    StringBuilder sb22=new StringBuilder();

    sb22.append(str:"Hello").append(str:"world");
    System.out.println(sb22);
    sb2.insert(offset:6, str:"beautiful");
    System.out.println(sb2.toString());  //output: "Hello beautiful world!"

    StringBuilder sb3.replace(start:1,end:3,str?:"java");
    System.out.println("After Replace() String="+sb3.toString()); //o/p: HJavalo


    
    StringBuilder sb4=new StringBuilder(str:"Helllo");
    sb4.delete(start:1,end:3);
    System.out.println(sb4);//prints Hlo

    StringBuilder sb5=new StringBuilder();
    System.out.println(sb5.capacity());//default 16
    sb5.append(str:"Hello");
    System.out.println(sb5.capacity());//now 16

    sb5.append(str:"java is my favorite language");
    System.out.println(sb5.capacity()); //now (16*2)+2=34 i.e(oldcapacity*2)+2

    sb5.ensureCapacity(minimunCapacity:10);//now to change
    System.out.println(sb5.capacity());//now34
    sb5.ensureCapacity(minmumCapacity:50); //now (34*2)+2
    System.out.println(sb5.capacity()); //now 70

    StringBuilder sb6=new StringBuilder(str:"Helllo");
    System.out.println(sb6.charAt(index:1));//prints e
    System.out.println(sb6.length());
    System.out.println(sb6.substring(staret:1,end:5));//returns String:ello
    System.out.println(sb6.stringstr)
