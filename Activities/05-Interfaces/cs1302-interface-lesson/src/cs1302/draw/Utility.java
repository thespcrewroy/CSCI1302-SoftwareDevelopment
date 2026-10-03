package cs1302.draw;

/** Simple utility class to help with drawing. */
public class Utility {

    /**
     * Draw the object referred to by {@code obj}.
     *
     * @param obj The object to draw.
     */
    public static void drawIt(Drawable obj) {
        obj.draw();
    } // drawIt

    /**
     * Draw all the objects referred to by the elements of {@code objs}.
     *
     * @param objs The objects to draw.
     */
    public static void drawAll(Drawable[] objs) {
        for (Drawable obj : objs) {
            obj.draw();
        } // for
    } // drawAll

} // Utility
