# Declaring and Interface

The first big syntax difference between a class and an interface is illustrated in the type declaration:

```java
public interface Styleable {
```


The second big syntax difference between classes and interfaces involves the inclusion of abstract methods:
```java
public void style();
```


<details>
<summary><b>Is the following an abstract method?</b><br><code>public void style() { }</code></summary>
<br>
  
No, it is not an abstract method.
While the `{ }` may not do anything, it is an implementation that does nothing.
Compare that to the actual abstract method signature presented above that ends with a semicolon, thus lacking an implementation.

</details>


Remember, that the abstract method(s) represent what the signer of the contract must be able to do. If a class implements the `Styleable` interface, it is obligated to have a concrete `style` and/or a concrete `unstyle` method. If an implementing class does not have implementations for one or both of these methods, it will not compile.

In Java, the declaration of an abstract method in the source code for an interface may omit the public visibility modifier. If public is omitted in this context, the abstract method is still assumed to have public visibility. This behavior is different for classes, a topic that will be covered more in-depth at a later time when the nuances of visibility are presented.

```java
package cs1302.interfaces.contract;

/**
 * Represents the interface for an object that can be styled and unstyled.
 */
public interface Styleable {

    /**
     * Styles the object.
     */
    public void style();

    /**
     * Unstyles the object.
     */
    public void unstyle();

} // Styleable
```
> Complete Interface in `cs1302/interfaces/contract/Styleable.java`
