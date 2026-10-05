package cs1302.animal;

/**
 * A {@code Giraffe} is a tall, long-necked, spotted ruminant
 * {@link cs1302.animal.Animal}. A {@code Giraffe} typically has a 
 * long neck, long legs, and a spotted coat.
 */
public class Giraffe extends Animal {

    /**
     * Constructs a {@code Giraffe} object with the specified {@code species}.
     *
     * @param name    name of the giraffe
     * @param species species name of the giraffe
     */
    public Giraffe(String name, String species) {
        super(name, "Giraffa", "Camelopardalis");
    } // Giraffe

    /**
     * Makes a sound that the giraffe makes.
     */
    @Override
    public void makeSound() {
        System.out.println(this.getName() + " hums and then bleats!");
    } // makeSound

    /**
     * Describes the giraffe.
     */
    @Override
    public void describe() {
        System.out.println("This is a giraffe named " + this.getName() + ".");
        System.out.println(this.getName() + " is a gentle giant."); // adds to it
    } // describe
} // Giraffe