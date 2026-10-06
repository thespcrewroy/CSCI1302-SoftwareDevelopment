# The Node Class

<p align="center">
  <img src="https://github.com/thespcrewroy/CSCI1302-SoftwareDevelopment/blob/main/Notes/assets/8-2.svg" />
</p>

```java
Node head = new Node("Cheese");
head.setNext(new Node("Bread"));
head.getNext().setNext(new Node("Milk"));
```
> Creating and linking three `Node` objects for a shopping list.

To store the list, we needed to create one `Node` object for each item on the list. The code is trickier when using the `Node` class directly. Later in this chapter, we will see how to implement the linked list class that hides the complexity from the programmer so that using linked lists becomes as easy as using an array.

<p align="center">
  <img src="https://raw.githubusercontent.com/andreasbm/readme/master/assets/lines/solar.png" width="2000" />
</p>

<p align="center">
  <img src="https://github.com/thespcrewroy/CSCI1302-SoftwareDevelopment/blob/main/Notes/assets/8-3.svg" />
</p>

```java
Node finish = new Node("Hello");
finish.setNext(new Node("World"));
Node n = finish.getNext();
finish.setNext(new Node(","));
finish.getNext().setNext(new Node("!"));
```

Using your memory diagrams from the last step, write the output for the last seven lines of code. You should assume this code is in the same scope and has access to all the variables in your diagram:

```java
System.out.println(finish.getItem()); // Hello
System.out.println(finish.getNext().getItem()); // ,
System.out.println(finish.getNext().getNext().getItem()); // '!'
System.out.println(finish.getNext().getNext().getNext()); // null
System.out.println(n.getItem()); // World
System.out.println(n.getNext()); // null
```