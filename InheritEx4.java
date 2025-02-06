class Animal2 {
    int i;
    String name;
    public void eat(){
        System.out.println("I can eat");

    }

Animal2(){}
Animal2(String n, int i1){
    name=n;
    i=i1;
}

}

class Dog2 extends Animal2 {

    public void bark(){
        System.out.println(name+" barks");
        System.out.println("i" +i+"super.i"+super.i);

    }

Dog2(){}
Dog2(String n,int i1, int i2){
    super(n,i1);
    i=i2;
}
}
    


class InheritEx1{
    public static void main(String[] args){
        Dog2 labrador=new Dog2();
        labrador.name="Rohu";
        labrador.bark();
        labrador.eat();

        Dog2 d1 = new Dog2("Tuffy", 10, 20);
        d1.eat();
    }
}