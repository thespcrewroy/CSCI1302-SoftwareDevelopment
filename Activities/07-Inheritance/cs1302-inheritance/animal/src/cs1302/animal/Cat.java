package cs1302.animal;

public class Cat extends Animal {

    private final String breed;
    private final String name;

    /**
     * Constructs a {@code Cat} object with the specified {@code breed}.
     *
     * @param breed  breed name of the cat
     * @param name   name of the cat
     */
    public Cat(String breed, String name) {
        super("Felis", "Catus");
        this.breed = breed;
        this.name = name;
    } // Cat

    /**
     * Returns the breed name of the cat.
     *
     * @return breed name of the cat
     */
    public String getBreed() {
        return breed;
    } // getBreed

    /**
     * Returns the name of the cat.
     *
     * @return name of the cat
     */
    public String getName() {
        return name;
    } // getName

    /**
     * Makes a sound that the cat makes.
     */
    @Override
    public void makeSound() {
        System.out.println("Meow!");
    } // makeSound

    /**
     * Describes the cat.
     */
    @Override
    public void describe() {
        System.out.println("This is a " + getGenus() + " " + getSpecies() + " of the breed " + breed + " named " + name);
    } // describe
    
}
