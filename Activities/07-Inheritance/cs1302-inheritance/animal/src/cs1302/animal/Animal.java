package cs1302.animal;

/**
 * An {@code Animal} represents a living organism that feeds on organic matter,
 * typically having specialized sense organs and nervous system and able to
 * respond rapidly to stimuli. Objects of this class are <em>immutable</em>,
 * i.e., they cannot be modified after construction.
 */
public class Animal {

    private final String genus;
    private final String species;
    private final String name;

    /**
     * Constructs a {@code Animal} object with the specified {@code genus} and
     * {@code species}.
     *
     * @param genus    genus name of the animal
     * @param species  species name of the animal
     * @param name     name of the animal
     */
    public Animal(String genus, String species, String name) {
        this.genus = genus;
        this.species = species;
        this.name = name;
    } // Animal

    /**
     * Returns the genus name of the animal.
     *
     * @return genus name of the animal
     */
    public String getGenus() {
        return genus;
    } // getGenus

    /**
     * Returns the species name of the animal.
     *
     * @return species name of the animal
     */
    public String getSpecies() {
        return species;
    } // getSpecies

    /**
     * Returns the name of the animal.
     *
     * @return name of the animal
     */
    public String getName() {
        return name;
    } // getName

    /**
     * Makes a sound that the animal makes.
     */
    public void makeSound() {
        System.out.println("Generic animal sound");
    } // makeSound

    /**
     * Prints a description of the {@Animal}.
     */
    public void describe() {
        System.out.println("This is an animal named " + this.name + ".");
    } // describe

} // Animal
