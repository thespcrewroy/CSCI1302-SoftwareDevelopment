# Introduction to Linked Lists

<p align="center">
  <img src="https://github.com/thespcrewroy/CSCI1302-SoftwareDevelopment/blob/main/Notes/assets/8-1.png" />
</p>

```java
Node n = new Node("Hello");
n.setNext(new Node("World"));
```
> The next reference contained within the first `Node n` references the second `Node` object.

The objects in a linked list are commonly referred to as nodes. Each node contains the value to be stored along with a reference to the next node in the list. A UML diagram showing one possible Node class containing a String reference can be seen above.
