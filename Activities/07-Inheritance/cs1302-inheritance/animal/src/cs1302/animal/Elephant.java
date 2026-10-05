package cs1302.animal;

/**
 * An {@code Elephant} is a large, gray mammal
 * {@link cs1302.animal.Animal}. An {@code Elephant} typically has a long trunk,
 * large ears, and a thick hide.
 */
public class Elephant extends Animal {
    
    /**
     * Constructs an {@code Elephant} object with the specified {@code species}.
     *
     * @param name    name of the elephant
     * @param species species name of the elephant
     */
    public Elephant(String name, String species) {
        super(name, "Elephantidae", species);
    } // Elephant

    /**
     * Makes a sound that the elephant makes.
     */
    @Override
    public void makeSound() {
        System.out.println(this.getName() + " trumpets and then rumbles!");
    } // makeSound

    /**
     * Describes the elephant.
     */
    @Override
    public void describe() {
        System.out.println("This is an elephant named " + this.getName() + ".");
        System.out.println(this.getName() + " is a gentle giant."); // adds to it
    } // describe

}
