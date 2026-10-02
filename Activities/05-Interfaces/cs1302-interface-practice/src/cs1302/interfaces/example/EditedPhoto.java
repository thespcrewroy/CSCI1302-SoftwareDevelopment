package cs1302.interfaces.example;

/** A photo filename and filter with a simulated save operation. */
public class EditedPhoto implements Savable {
    /** Name of the photo file. */
    private String fileName;
    /** Name of the applied filter. */
    private String filterApplied;

    /**
     * Creates a description of an edited photo.
     * @param fileName the photo filename
     * @param filterApplied the filter name
     */
    public EditedPhoto(String fileName, String filterApplied) {
        this.fileName = fileName;
        this.filterApplied = filterApplied;
    } // EditedPhoto

    /** Prints a message simulating persistence of this photo. */
    @Override
    public void save() {
        // Logic to save image bytes or update image path
        System.out.println("Photo '" + fileName + "' saved with " + filterApplied + " filter.");
    } // save
} // EditedPhoto
