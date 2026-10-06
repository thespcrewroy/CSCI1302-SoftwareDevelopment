# The List Interface (ADT)

A common ADT is the List interface. You can think of a ADT List as an ordered collection of objects. There are several important operations (abstract methods) needed for a List. Some common list operations include, but are not limited to:

| Return Type | Method | Description |
|---|---|---|
| `String` | `get(int index)` | Retrieves the object (`String` in this case) at the specified index. This method throws an `IndexOutOfBoundsException` if the index is out of range: `index < 0` or `index >= size()` |
| `boolean` | `add(int index, String s)` | Inserts the specified object (`String` in this case) at the specified index. The method shifts the object currently at that position (if any) and any subsequent objects to the right (i.e. it adds one to their indices) |
| `String` | `remove(int index)` | Removes and returns the string at the specified position in the list. Shifts any subsequent elements to the left (i.e. subtracts one from their indices) |
| `void` | `clear()` | Removes all of the objects from the list. The list will be empty after this call returns |
| `int` | `size()` | Returns the number of elements in the list |
| `String` | `makeString(String sep)` | Returns a string representation of this list with every string in the sequence separated by the specified separator string (`sep`) |
