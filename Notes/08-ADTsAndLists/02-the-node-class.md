# The Node Class

```java
Node head = new Node("Cheese");
head.setNext(new Node("Bread"));
head.getNext().setNext(new Node("Milk"));
```
> Creating and linking three `Node` objects for a shopping list.

To store the list, we needed to create one `Node` object for each item on the list. The code is trickier when using the `Node` class directly. Later in this chapter, we will see how to implement the linked list class that hides the complexity from the programmer so that using linked lists becomes as easy as using an array.
