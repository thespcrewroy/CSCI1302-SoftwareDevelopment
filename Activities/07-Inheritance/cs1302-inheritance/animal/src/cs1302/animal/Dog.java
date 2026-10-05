package cs1302.animal;

/**
 * A {@code Dog} is a domesticated, usually carnivorous,
 * {@link cs1302.animal.Animal}. A {@code Dog} typically has a long snout, an acute sense
 * of smell, nonretractable claws, and a barking, howling, or whining voice.
 */
public class Dog extends Animal {

    private final String breed;

    /**
     * Constructs a {@code Dog} object with the specified {@code breed}.
     *
     * @param breed  breed name of the dog
     * @param name   name of the dog
     */
    public Dog(String breed, String name) {
        super("Canis", "Lupus Familiaris", name);
        this.breed = breed;
    } // Dog

    /**
     * Makes a sound that the dog makes.
     */
    @Override
    public void makeSound() {
        System.out.println("Woof!");
    } // makeSound

    /**
     * Describes the dog.
     */
    @Override
    public void describe() {
        super.describe(); // calls the describe method of the parent.

        System.out.println(this.getName() + " is a loyal dog."); // adds to it
    } // describe

    /**
     * Returns the breed name of the dog.
     *
     * @return breed name of the dog
     */
    public String getBreed() {
        return breed;
    } // getBreed
} // Dog
