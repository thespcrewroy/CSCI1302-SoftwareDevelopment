package cs1302.linkedlists;

import cs1302.adt.Node;

public class Driver {

    public static void main(String[] args) {
        Node head = new Node("Cheese");
        head.setNext(new Node("Bread"));
        head.getNext().setNext(new Node("Milk"));
    }

}
