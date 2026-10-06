import cs1302.adt.Node;

/**
 *  This program demonstrates simple linked list using the Node class.
 * 
 */
public class Driver {

    /**
     * The main method creates a simple linked list of three nodes
     * and prints the items in each node.
     * 
     * @param args
     */
    public static void main(String[] args) {

        // 1.
        System.out.println();
        Node head = new Node("Cheese");
        head.setNext(new Node("Bread"));
        head.getNext().setNext(new Node("Milk"));

        System.out.println(head.getItem()); // Cheese
        System.out.println(head.getNext().getItem()); // Bread
        System.out.println(head.getNext().getNext().getItem()); // Milk

        // 2.
        System.out.println();
        Node finish = new Node("Hello");
        finish.setNext(new Node("World"));
        Node n = finish.getNext();
        finish.setNext(new Node(","));
        finish.getNext().setNext(new Node("!"));

        System.out.println(finish.getItem()); // Hello
        System.out.println(finish.getNext().getItem()); // ,
        System.out.println(finish.getNext().getNext().getItem()); // '!'
        System.out.println(finish.getNext().getNext().getNext()); // null
        System.out.println(n.getItem()); // World
        System.out.println(n.getNext()); // null

        // 3.
        System.out.println();
        List myList = new LinkedBasedList();
        myList.add(0, "Bread"); // Bread
        myList.add(0, "Cheese"); // Cheese, Bread
        myList.add(1, "Milk"); // Cheese, Milk, Bread
        myList.add(3, "Ice Cream"); // Cheese, Milk, Bread, Ice Cream
        System.out.println("Removed: " + myList.remove(0)); // Cheese
        System.out.println("List Size: " + myList.size()); // 3
        System.out.println("List Contents: " + myList.makeString(", ")); // Bread, Milk, Ice Cream

        // 4.
        System.out.println();
        List myRealList = new LinkedBasedList();
        myRealList.add(0, "Bread"); // Bread
        myRealList.add(0, "Cheese"); // Cheese, Bread
        myRealList.add(2, "Candy"); // Cheese, Bread, Candy
        myRealList.add(2, "Milk"); // Cheese, Bread, Milk, Candy
        myRealList.remove(2); // Cheese, Bread, Candy
        System.out.println("The item at index 2 is: " + myRealList.get(2)); // Candy
        System.out.println("List Size: " + myRealList.size()); // 3
        System.out.println("List Contents: " + myRealList.makeString(", ")); // Cheese, Bread, Candy
    } // main
} // Driver
