package cs1302.draw;

import java.awt.Color;

/**
 * Describes a tree.
 */
public class Tree implements Drawable {

    private int height;
    private Color trunkColor;

    /**
     * Construct a {@code Tree}.
     *
     * @param height The initial height of the tree.
     * @param trunkColor The color of the tree trunk.
     */
    public Tree(int height, Color trunkColor) {
        this.height = height;
        this.trunkColor = trunkColor;
    } // Tree

    /**
     * Grow the tree by specified {@code amount}.
     *
     * @param amount The amount to grow by. The tree will shrink if a negative
     *     value is used. No error checking is done to prevent the tree's
     *     height from becoming negative.
     */
    public void grow(int amount) {
        this.height += amount;
        System.out.println("The tree is now " + height + " feet tall.");
    } // grow

    /**
     * Get the height.
     *
     * @return The height.
     */
    public int getHeight() {
        return this.height;
    } // getHeight

    /**
     * Get the trunk color.
     *
     * @return The trunk color.
     */
    public Color getTrunkColor() {
        return this.trunkColor;
    } // getTrunkColor

    @Override
    public void draw() {
        System.out.println("**** Gathering info to draw Tree ****");
        System.out.printf("Getting trunk color... %s\n", this.getTrunkColor());
        System.out.printf("Getting the height... %d\n", this.getHeight());
        System.out.println("Doing some math...");
        System.out.println("**** Rendering Tree ****");
        System.out.printf(
            "This %s tree is %d meters tall.\n",
            this.getTrunkColor().toString(),
            this.getHeight()
        );

        // Leaves (triangle shape)
        for (int i = 1; i <= height; i++) {
            for (int j = 0; j < height - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Trunk
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < height - 1; j++) {
                System.out.print(" ");
            }
            System.out.println("|");
        }

    } // drawTree

} // Tree
