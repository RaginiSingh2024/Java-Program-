//java program to illustrate explicit type conversion
class TypeCastingEx
{
    public static void main(String[]args)
    {
        double d = 100.23;
        long l =(long)d;              //expicit type casting :truncation,
        int i =(int)l;                //explicit type casting
        System.out.println("Long value"+1);//fraction part lost;value:100
        System.out.println("Int value"+i);                        //fraction part lost; value;100
            }
}