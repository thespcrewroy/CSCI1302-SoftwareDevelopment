package cs1302.interfaces.example;

/** Represents a memory that can be saved. */
public class Memory implements Savable {
    /** The data stored in the memory. */
    private String data;

    /**
     * Creates a new Memory instance with the specified data.
     * @param data
     */
    public Memory(String data) {
        this.data = data;
    } // Memory

    /**
     * Returns the data stored in the memory.
     * @return the data stored in the memory
     */
    public String getData() {
        return data;
    } // getData

    /** Simulates saving the memory by printing a message to the console. */
    @Override
    public void save() {
        // Logic to save the memory data
        System.out.println("Saving memory + '" + data + "' to persistent storage.");
    } // save
} // Memory
