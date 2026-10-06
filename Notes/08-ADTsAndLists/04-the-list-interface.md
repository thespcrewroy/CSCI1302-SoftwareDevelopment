# The List Interface (ADT)

A common ADT is the List interface. You can think of a ADT List as an ordered collection of objects. There are several important operations (abstract methods) needed for a List. Some common list operations include, but are not limited to:

| Return Type |         Method        |                                                         Description                                                         |
| ----------- | --------------------- | --------------------------------------------------------------------------------------------------------------------------- |
|   `String`  | `get`                 | Retrieves the object at the specified index. This method throws an `IndexOutOfBoundsException`.                             |
|   `boolean` | `add`                 | Inserts the specified object (`String` in this case) at the specified index.                                                |
|   `String`  | `remove`              | Removes and returns the string at the specified position in the list. Shifts any subsequent elements.                       |
|   `void`    | `clear`               | Removes all of the objects from the list. The list will be empty after this call returns.                                   |
|   `int`     | `size`                | Returns the number of elements in the list.                                                                                 |
|   `String`  | `makeString`          | Returns a string representation of this list with every string in the sequence separated.                                   |

<p align="center">
  <img src="https://github.com/thespcrewroy/CSCI1302-SoftwareDevelopment/blob/main/Notes/assets/8-4.png" />
</p>


<p align="center">
  <img src="https://raw.githubusercontent.com/andreasbm/readme/master/assets/lines/solar.png" width="2000" />
</p>


```java
List myList = new ArrayBasedList(); // or LinkedBasedList()
myList.add(0, "Bread");
myList.add(0, "Cheese");
myList.add(1, "Milk");
myList.add(3, "Ice Cream");
System.out.println("Removed: " + myList.remove(0));
System.out.println("List Size: " + myList.size());
System.out.println("List Contents: " + myList.makeString(","));
```
> Create an array-based or linked-based list and add four items to it.

<br>

```java
Removed: Cheese
List Size: 3
List Contents: Milk, Bread, Ice Cream
```
> Program output.
