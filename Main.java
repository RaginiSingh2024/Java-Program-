// Parent class Animal
class Animal {
    String name;

    // Constructor to initialize the name of the animal
    Animal(String name) {
        this.name = name;
    }

    // Default constructor
    Animal() {
        this.name = "Unknown";  // Default name if none is provided
    }

    // Method to describe the animal making a sound
    public void makeSound() {
        System.out.println(name + " makes a sound");
    }
}

// Dog class that extends Animal
class Dog extends Animal {

    // Constructor with a name parameter
    Dog(String n1) {
        super(n1);  // Call the constructor of the parent class Animal
    }

    // Default constructor
    Dog() {
        super(); // Calls the parent class constructor with a default name
    }

    // Method to make the dog bark
    public void bark() {
        System.out.println(name + " barks");
    }
}

public class Main {
    public static void main(String[] args) {
        // Create instances of Dog
        Dog dog1 = new Dog("Buddy");
        Dog dog2 = new Dog();

        // Call methods
        dog1.bark();  // Output: Buddy barks
        dog2.bark();  // Output: Unknown barks
        dog1.makeSound(); // Output: Buddy makes a sound
    }
}
