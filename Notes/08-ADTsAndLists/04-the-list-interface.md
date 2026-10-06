# The List Interface (ADT)

A common ADT is the List interface. You can think of a ADT List as an ordered collection of objects. There are several important operations (abstract methods) needed for a List. Some common list operations include, but are not limited to:

| Return Type |         Method        |                                                         Description                                                         |
| ----------- | --------------------- | --------------------------------------------------------------------------------------------------------------------------- |
|   `String`  | `get`                 | Retrieves the object at the specified index. This method throws an `IndexOutOfBoundsException` if the index is out of range |
|   `boolean` | `add`                 | Inserts the specified object (`String` in this case) at the specified index.                                                |
|   `String`  | `remove`              | Removes and returns the string at the specified position in the list. Shifts any subsequent elements to the left            |
|   `void`    | `clear`               | Removes all of the objects from the list. The list will be empty after this call returns                                    |
|   `int`     | `size`                | Returns the number of elements in the list                                                                                  |
|   `String`  | `makeString`          | Returns a string representation of this list with every string in the sequence separated by the specified separator string  |
