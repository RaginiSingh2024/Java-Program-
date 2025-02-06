Class Cat extends Animal {
    public void meow(){
        System.out.println(name+" meow");

    }
}

class HierarInherit{
    public static void main(String[] args){
        Animal a= new Animal();
        a.name= "Rocky";
        a.eat();

        Dog d1 = new Dog(n: "Tuffy");
        d1.eat();
        d1.bark();


        Cat c=new Cat();
        c.name="Mew";
        c.eat();
        c.meow();
    }
}