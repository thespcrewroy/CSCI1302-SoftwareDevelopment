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
        animalInfo(dog);
        
        // 4.
        System.out.println();
        Dog dog2 = new Dog("Vince", "Mix");
        System.out.println("Dog 2:");
        dog2.makeSound();
        animalInfo(dog2);

        // 5.
        System.out.println();
        Giraffe giraffe = new Giraffe("Geoffrey", "Giraffa camelopardalis");
        Elephant elephant = new Elephant("Dumbo", "Loxodonta africana");
        Frog frog = new Frog("Kermit", "Rana catesbeiana");
        Animal[] animals = {cat, cat2, dog, dog2, giraffe, elephant, frog};
        System.out.println("Animals:");
        makeSounds(animals);

        // 6. Contains Giraffe
        System.out.println();
        System.out.println("Contains Giraffe: " + containsGiraffe(animals));

        // 7. Does Not Contain Giraffe
        System.out.println();
        Animal[] animals2 = {cat, cat2, dog, dog2, elephant, frog};
        System.out.println("Contains Giraffe: " + containsGiraffe(animals2));
    } // main

    public static void animalInfo (Animal currentAnimal) {
        System.out.print("More information about the animal:\n");

        currentAnimal.describe();

        System.out.print("The animal lets out a loud: ");
        currentAnimal.makeSound();
    } // animalInfo

    public static void makeSounds (Animal[] animals) {
        for (Animal individual: animals) {
            individual.makeSound();
        } // for
    } // makeSounds

    /**
     * Returns true if the specified {@code Animal} array contains
     * a reference to a {@code Giraffe} object.
     *
     * @param animals the array of animals to search.
     * @return true if the array contains a giraffe and false otherwise.
     */
    public static boolean containsGiraffe (Animal[] animals) {
        for (Animal individual: animals) {
            if (individual.getGenus().equals("Giraffa")) {
                return true;
            } // if
        } // for
        return false;
    } // containsGiraffe
} // Driver
