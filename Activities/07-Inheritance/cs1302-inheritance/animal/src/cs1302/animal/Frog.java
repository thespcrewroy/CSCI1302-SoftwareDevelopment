package cs1302.animal;

/**
 * A {@code Frog} is a small, tailless amphibian
 * {@link cs1302.animal.Animal}. A {@code Frog} typically has a smooth, moist skin,
 * long hind legs for jumping, and webbed feet for swimming.
 */
public class Frog extends Animal {

    /**
     * Constructs a {@code Frog} object with the specified {@code species}.
     *
     * @param name    name of the frog
     * @param species species name of the frog
     */
    public Frog(String name, String species) {
        super(name, "Anura", species);
    } // Frog

    /**
     * Makes a sound that the frog makes.
     */
    @Override
    public void makeSound() {
        System.out.println(this.getName() + " croaks and then ribbits!");
    } // makeSound

    /**
     * Describes the frog.
     */
    @Override
    public void describe() {
        System.out.println("This is a frog named " + this.getName() + ".");
        System.out.println(this.getName() + " is a small amphibian."); // adds to it
    } // describe
    
}
