class Animal {
    String name;
    public void eat(){
        System.out.println(name+" eat");

    } 
    Animal (){}
    Animal(String n){name=n;}

}

class Dog extends Animal {
    public void bark() {
        System.out.println(name+" barks");

    }
    Dog(){}
    Dog(String n){
        super(n);
    }
}