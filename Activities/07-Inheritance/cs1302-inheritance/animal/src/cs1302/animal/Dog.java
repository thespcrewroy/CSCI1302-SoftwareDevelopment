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
     * @param name   name of the dog
     * @param breed  breed name of the dog
     */
    public Dog(String name, String breed) {
        super(name, "Canis", "Familiaris", "Carnivore");
        this.breed = breed;
    } // Dog

    /**
     * Returns the breed name of the dog.
     *
     * @return breed name of the dog
     */
    public String getBreed() {
        return breed;
    } // getBreed

    /**
     * Makes a sound that the dog makes.
     */
    @Override
    public void makeSound() {
        System.out.println(this.getName() + " growls and then barks!");
    } // makeSound

    /**
     * Describes the dog.
     */
    @Override
    public void describe() {
        System.out.println("This is a dog named " + this.getName() + ".");
        System.out.println(this.getName() + " is a loyal dog."); // adds to it
    } // describe
} // Dog
