class BasicMath{
    public static void main(String args[])
    {
        int a=1+1; //2
        int b=a*3;  //6
        int c=b/4;     //1
        int d=c-a; //-1
        int e=-d;  //1
        System.out.printf("a=%d,b=%d,c=%d,d=%d,e=%d",a,b,c,d,e);
        System.out.println("\nFloating Point Arithmetic");
        double da=1+1; //2.0
        double db=da*3; //6.0
        double dc=db/4; //1.5
        double dd=db/4; //-0.5
        double de=-dd;
        System.out.printf("a=%f,b=%f,c=%f,d=%f,e=%f",da,db,dc,dd,de);
    }
}
