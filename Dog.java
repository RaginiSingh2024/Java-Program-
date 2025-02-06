//Create a dog class us of getter/setter constructor to string create two object call getter setter print object 
// Dog class definition
public class Dog {
    // Private attributes of the Dog class
    private String name;
    private int age;
    private String breed;

    // Constructor to initialize the Dog object
    public Dog(String name, int age, String breed) {
        this.name = name;
        this.age = age;
        this.breed = breed;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age
    public void setAge(int age) {
        this.age = age;
    }

    // Getter for breed
    public String getBreed() {
        return breed;
    }

    // Setter for breed
    public void setBreed(String breed) {
        this.breed = breed;
    }

    // toString method to represent Dog object as a string
    @Override
    public String toString() {
        return "Dog [Name=" + name + ", Age=" + age + ", Breed=" + breed + "]";
    }

    // Main method to test the Dog class
    public static void main(String[] args) {
        // Create two Dog objects using constructor
        Dog dog1 = new Dog("Buddy", 3, "Golden Retriever");
        Dog dog2 = new Dog("Max", 5, "Labrador");

        // Print the Dog objects using toString method
        System.out.println("Before using getters/setters:");
        System.out.println(dog1);
        System.out.println(dog2);

        // Using setters to update dog details
        dog1.setAge(4);
        dog2.setBreed("German Shepherd");

        // Using getters to retrieve updated dog details
        System.out.println("\nAfter using getters/setters:");
        System.out.println("Dog 1 - Name: " + dog1.getName() + ", Age: " + dog1.getAge() + ", Breed: " + dog1.getBreed());
        System.out.println("Dog 2 - Name: " + dog2.getName() + ", Age: " + dog2.getAge() + ", Breed: " + dog2.getBreed());
    }
}
