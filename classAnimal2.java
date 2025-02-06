class Animal2 {
    String name;
    public void eat(){
        System.out.println("I can eat");

    }
}

class Dog2 extends Animal2 {
    public void bark(){
        System.out.println(name+"barks");

    }
}
Dog2(){}
Dog2(String n){
    super(n);
}

class InheritEx1{
    public static void main(String[] args){
        Dog labrador=new Dog();
        labrador.name="Rohu";
        labrador.bark();
        labrador.eat();

        Dog2 d1 = new Dog2(n:"Tuffy");
        d1.eat();
    }
}