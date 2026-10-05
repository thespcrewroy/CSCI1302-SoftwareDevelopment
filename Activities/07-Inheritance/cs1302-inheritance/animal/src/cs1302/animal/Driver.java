package cs1302.animal;

/**
 * Test code for the animal-related inheritance examples.
 */
public class Driver {

    public static void main(String[] args) {
        // 1.
        Cat cat = new Cat("Whiskers");
        System.out.println("\nCat:");
        cat.describe();

        // 2.
        Animal cat2 = new Cat("Garfield");
        System.out.println("\nCat:");
        cat2.describe();
    } // main
} // Driver
