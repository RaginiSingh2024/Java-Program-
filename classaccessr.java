//Example private members are not inherited
class A {
    int i; //default access
    private int j; // private to A
    void setij(int x, int y){
        i=x;
        j=y;

    }
}

//A's j is not accessible here.
class B extends A{
    int total;

    void sum(){
        total =i+j; //ERROR , j is not accesible here

    }
}

class Access {
    public static void main(String args[]){
        B subob = new B ();

        subob.setij(10,12);

        subob.sum();
System.out.println("Total is"+subob.total);

    }
}