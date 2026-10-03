package cs1302.draw;

import java.awt.Color;

/** Sample driver class. */
public class Driver {

    public static void main(String[] args) {

        Tree tree0 = new Tree(10, Color.ORANGE);
        Tree tree1 = new Tree(42, Color.YELLOW);

        Airplane plane0 = new Airplane(Color.WHITE, 2, 100);
        Airplane plane1 = new Airplane(Color.BLUE, 4, 150);

        Person person0 = new Person(Color.RED, Color.BLUE);
        Person person1 = new Person(Color.BLUE, Color.RED);

        Flower flower0 = new Flower(Color.RED, 4);
        Flower flower1 = new Flower(Color.YELLOW, 8);

        Meme meme0 = new Meme("Hello, World!", Color.GREEN);
        Meme meme1 = new Meme("Have a great day!", Color.BLUE);

        Drawable[] drawables = new Drawable[4];
        drawables[0] = tree0;
        drawables[1] = person1;
        drawables[2] = plane0;
        drawables[3] = meme0;

        // Call the drawAll method
        Utility.drawAll(drawables);

    } // main

} // Driver
