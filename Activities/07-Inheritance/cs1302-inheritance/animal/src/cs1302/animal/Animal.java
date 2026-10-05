package cs1302.animal;

/**
 * An {@code Animal} represents a living organism that feeds on organic matter,
 * typically having specialized sense organs and nervous system and able to
 * respond rapidly to stimuli. Objects of this class are <em>immutable</em>,
 * i.e., they cannot be modified after construction.
 */
public abstract class Animal {

    private final String name;
    private final String genus;
    private final String species;
    private final String diet;

    /**
     * Constructs a {@code Animal} object with the specified {@code genus} and
     * {@code species}.
     *
     * @param name     name of the animal
     * @param genus    genus name of the animal
     * @param species  species name of the animal
     * @param diet     diet of the animal
     */
    public Animal(String name, String genus, String species, String diet) {
        this.name = name;
        this.genus = genus;
        this.species = species;
        this.diet = diet;
    } // Animal

    /**
     * Returns the name of the animal.
     *
     * @return name of the animal
     */
    public String getName() {
        return name;
    } // getName

    /**
     * Returns the diet of the animal.
     *
     * @return diet of the animal
     */
    public String getDiet() {
        return diet;
    } // getDiet

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
     * Makes a sound that the animal makes.
     */
    public abstract void makeSound();

    /**
     * Prints a description of the {@Animal}.
     */
    public abstract void describe();
} // Animal
