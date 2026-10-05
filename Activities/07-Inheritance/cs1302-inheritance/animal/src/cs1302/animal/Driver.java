package cs1302.animal;

/**
 * Test code for the animal-related inheritance examples.
 */
public class Driver {

    public static void main(String[] args) {
        // 1.
        System.out.println();
        Cat cat = new Cat("Whiskers");
        System.out.println("Cat:");
        cat.describe();

        // 2.
        System.out.println();
        Animal cat2 = new Cat("Garfield");
        System.out.println("Cat:");
        cat2.describe();

        // 3.
        System.out.println();
        Animal dog = new Dog("Juno", "Jack Russell Terrier");
        System.out.println("Dog:");
        System.out.println(dog.getGenus());
        System.out.println(dog.getSpecies());
        System.out.println(dog.getName());
        dog.makeSound();
        

        // 4.
        System.out.println();
        Dog dog2 = new Dog("Vince", "Mix");
        System.out.println("Dog 2:");
        dog2.makeSound();

    } // main
} // Driver
