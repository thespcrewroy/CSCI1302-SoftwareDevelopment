package cs1302.animal;

/**
 * Test code for the animal-related inheritance examples.
 */
public class Driver {

    public static void main(String[] args) {
        Animal animal = new Animal("Canis", "Lupus");
        Dog dog = new Dog("Golden Retriever", "Buddy");
        Cat cat = new Cat("Siamese", "Whiskers");

        animal.describe();
        animal.makeSound();

        dog.describe();
        dog.makeSound();
        
        cat.describe();
        cat.makeSound();
    } // main
} // Driver
