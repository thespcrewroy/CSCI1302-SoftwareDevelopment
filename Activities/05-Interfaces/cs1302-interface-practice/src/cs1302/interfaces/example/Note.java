package cs1302.interfaces.example;

/** A text note with a simulated save operation. */
public class Note implements Savable {
    /** Text stored in this note. */
    private String content;

    /**
     * Creates a note with the supplied text.
     * @param content the note text
     */
    public Note(String content) {
        this.content = content;
    } // Note

    
    /** Prints a message simulating persistence of this note. */
    @Override
    public void save() {
        // Logic to save text to a database or file
        System.out.println("Note saved successfully: " + content);
    } // save
} // Note
