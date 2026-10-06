# The List Interface (ADT)

A common ADT is the List interface. You can think of a ADT List as an ordered collection of objects. There are several important operations (abstract methods) needed for a List. Some common list operations include, but are not limited to:

<table>
  <thead>
    <tr>
      <th style="width: 10%;">Return Type</th>
      <th style="width: 25%;">Method</th>
      <th style="width: 65%;">Description</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td><code>String</code></td>
      <td style="white-space: nowrap;"><code>get(int index)</code></td>
      <td>Retrieves the object (<code>String</code> in this case) at the specified index. This method throws an <code>IndexOutOfBoundsException</code> if the index is out of range: <code>index &lt; 0</code> or <code>index &gt;= size()</code></td>
    </tr>
    <tr>
      <td><code>boolean</code></td>
      <td style="white-space: nowrap;"><code>add(int index, String s)</code></td>
      <td>Inserts the specified object (<code>String</code> in this case) at the specified index. The method shifts the object currently at that position (if any) and any subsequent objects to the right (i.e. it adds one to their indices)</td>
    </tr>
    <tr>
      <td><code>String</code></td>
      <td style="white-space: nowrap;"><code>remove(int index)</code></td>
      <td>Removes and returns the string at the specified position in the list. Shifts any subsequent elements to the left (i.e. subtracts one from their indices)</td>
    </tr>
    <tr>
      <td><code>void</code></td>
      <td style="white-space: nowrap;"><code>clear()</code></td>
      <td>Removes all of the objects from the list. The list will be empty after this call returns</td>
    </tr>
    <tr>
      <td><code>int</code></td>
      <td style="white-space: nowrap;"><code>size()</code></td>
      <td>Returns the number of elements in the list</td>
    </tr>
    <tr>
      <td><code>String</code></td>
      <td style="white-space: nowrap;"><code>makeString(String sep)</code></td>
      <td>Returns a string representation of this list with every string in the sequence separated by the specified separator string (<code>sep</code>)</td>
    </tr>
  </tbody>
</table>
