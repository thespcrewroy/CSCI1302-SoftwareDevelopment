package cs1302.animal;

public class Cat extends Animal {

    /**
     * Constructs a {@code Cat} object with the specified {@code breed}.
     *
     * @param name   name of the cat
     */
    public Cat(String name) {
        super("Felis", "Catus", name);
    } // Cat

    /**
     * Makes a sound that the cat makes.
     */
    @Override
    public void makeSound() {
        System.out.println("Meow!");
    } // makeSound

    /**
     * Prints a description of the {@Cat}.
     */
    @Override
    public void describe() {
        super.describe(); // calls the describe method of the parent.

        System.out.println(this.getName() + " is an agile cat."); // adds to it
    } // describe
}
