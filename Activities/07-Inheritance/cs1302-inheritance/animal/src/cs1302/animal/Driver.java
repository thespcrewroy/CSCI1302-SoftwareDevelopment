package cs1302.animal;

/**
 * Test code for the animal-related inheritance examples.
 */
public class Driver {

    public static void main(String[] args) {
        Dog terrier = new Dog("Terrier"); // object of type Dog
        Animal dog = terrier; // upcasting

        printAnimalInfo(dog, new Dog("Bulldog"));
        printAnimalInfo(dog, new Dog("Poodle"));
        printAnimalInfo(dog, new Dog("Beagle"));
        printAnimalInfo(dog, new Dog("Pug"));
        
    } // main

    /***
     * Prints information about an animal and its breed.
     * @param animal the animal
     * @param dog the dog
     */
    public static void printAnimalInfo(Animal animal, Dog dog) {
        System.out.println("Genus: " + animal.getGenus());
        System.out.println("Species: " + animal.getSpecies());
        System.out.println("Breed: " + dog.getBreed());
    } // printAnimalInfo

} // Driver
