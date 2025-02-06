class Animal {
    String name;
    public void eat(){
        System.out.println("I can eat");

    }
}

class Dog extends Animal {
    public void bark(){
        System.out.println(name+"barks");

    }
}

class InheritEx1{
    public static void main(String[] args){
        Dog labrador=new Dog();
        labrador.name="Rohu";
        labrador.bark();
        labrador.eat();
    }
}