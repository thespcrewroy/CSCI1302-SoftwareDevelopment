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

<details>
<summary><b>Imagine you are writing an application that allows users to add items to a grocery list. Would you choose an array or list?</b></summary>
<br>

If we use an array to hold our items, we may need to allocate more space than we need in order to avoid creating new arrays each time we add a new item.

<br>

If we use a linked list to hold our items, we can connect new objects to existing objects without having to recreate the entire list since each object refers to the next.
</details>
