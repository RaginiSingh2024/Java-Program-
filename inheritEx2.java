class Animal {
    String name;
    public void eat(){
        System.out.println("I can eat");

    }
}

class Dog1 extends Animal {
    public void bark(){
        System.out.println(name+"barks");

    }
}

class InheritEx2{
    public static void main(String[] args){
        Dog1 labrador=new Dog1();
        labrador.name="Rohu";
        labrador.bark();
        labrador.eat();
    }
}