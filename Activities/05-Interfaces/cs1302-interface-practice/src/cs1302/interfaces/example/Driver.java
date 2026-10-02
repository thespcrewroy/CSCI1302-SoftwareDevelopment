package cs1302.interfaces.example;


/** Demonstrates the save operations of three unrelated classes. */
public class Driver {
    /**
     * Creates one instance of each class and invokes its save operation.
     * @param args command-line arguments (unused)
     */
    public static void main(String[] args) {
        Savable[] saveables = new Savable[4];

        saveables[0] = new Note("Finish the Java project!");
        saveables[1] = new EditedPhoto("sunset.jpg", "Sepia");
        saveables[2] = new UserProfile("JavaDev2026", "dev@example.com");
        saveables[3] = new Memory("This is a spicy sonic.");

        saveAll(saveables);
    } // main

    /**
     * Invokes the save operation on each object in the array.
     * @param saveables an array of objects that implement the Savable interface
     */
    public static void saveAll(Savable[] saveables) {
        for (Savable s : saveables) {
            s.save();
        } // for
    } // saveAll
} // Driver
