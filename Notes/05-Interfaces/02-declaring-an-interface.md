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

> [!NOTE]\
> In Java, the declaration of an abstract method in the source code for an interface may omit the public visibility modifier. If public is omitted in this context, the abstract method is still assumed to have public visibility. This behavior is different for classes, turning into a package-private method instead if the modifier is omitted.

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

<p align="center">
  <img src="https://raw.githubusercontent.com/andreasbm/readme/master/assets/lines/solar.png" width="2000" />
</p>

Take a moment to inspect the source code for the `cs1302.interfaces.impl.Fancy` class. You will see both of the abstract methods from `Styleable` implemented. Notice that the implementations contain method bodies (instead of their signatures ending with a semicolon).

```java
package cs1302.interfaces.impl;

import cs1302.interfaces.contract.Styleable;

public class Fancy implements Styleable {

    private String message;
    private boolean styled;

    public Fancy(String msg) {
        message = msg;
        styled = false;
    } // Fancy

    @Override
    public void style() {
        styled = true;
    } // style

    @Override
    public void unstyle() {
        styled = false;
    } // unstyle

    public String toString() {
        String content;
        if (styled) {
            content = "*** " + message + " ***";
        } else {
            content = message;
        } // if
        return String.format("Fancy(%s)", content);
    } // toString

} // Fancy
```
> in cs1302/interfaces/impl/Fancy.java

<br>

Here is the implementation for `SuperFancy`, which provides alternate casing when styled and declares an additional `getAbout()` method:
```java
package cs1302.interfaces.impl;

import cs1302.interfaces.contract.Styleable;

public class SuperFancy implements Styleable {

    private String message;
    private boolean styled;

    public SuperFancy(String msg) {
        message = msg;
        styled = false;
    } // SuperFancy

    @Override
    public void style() {
        styled = true;
    } // style

    @Override
    public void unstyle() {
        styled = false;
    } // unstyle

    public String getAbout() {
        return "A styled SuperFancy object contains alternating characters.";
    } // getAbout

    public String toString() {
        String content = "";
        if (styled) {
            for (int i = 0; i < message.length(); i++) {
                if (i % 2 == 0) {
                    content += Character.toUpperCase(message.charAt(i));
                } else {
                    content += Character.toLowerCase(message.charAt(i));
                } // if
            } // for
            content = "*** " + content + " ***";
        } else {
            content = message;
        } // if
        return String.format("Super Fancy(%s)", content);
    } // toString

} // SuperFancy

```
> in cs1302/interfaces/impl/SuperFancy.java

> [!IMPORTANT]\
> Now, take a moment to compare the Javadoc comments in the source code for the `Styleable` interface with the comments written in the source code for the implementing `Fancy` class. In some cases, new comments are provided. In others, it appears as though Javadoc comments are omitted. In the latter case, this is actually not true. View the API documentation website for both the `Styleable` interface and the `Fancy` class. All of the methods in `Fancy` are documented, even `style()` and `unstyle()` which have no Javadoc comments in the source code. This happens because the Javadoc tool has the ability to inherit comments from an interface when omitted or when explicitly requested in the implementing class's Javadoc comment using the `{@inheritDoc}` tag.


<p align="center">
  <img src="https://raw.githubusercontent.com/andreasbm/readme/master/assets/lines/solar.png" width="2000" />
</p>

<details>
<summary><b>If adding the interface relationship requires us to write more code, where does the benefit to all of this occur?</b></summary>
<br>
  
The benefit comes when we use these classes in a calling method or a driver class. In the payment processor example, we were able to reduce the number of methods required in the driver program after adding the interface relationship.

</details>


Reference variables are called as such because they refer to objects. However, you can only create objects from classes (not interfaces)! Therefore, what can a `Styleable` variable refer to? The answer is that a variable with an interface as its type can refer to an object of any class that implements that interface:

<p align="center">
  <img src="https://github.com/thespcrewroy/CSCI1302-SoftwareDevelopment/blob/main/Notes/assets/5-4.svg" />
</p>

```java
package cs1302.interfaces;

import cs1302.interfaces.contract.Styleable;
import cs1302.interfaces.impl.Fancy;

public class Driver {

    public static void main(String[] args) {
        Styleable s = new Fancy("some message");
    } // main

} // Driver
```
> Compatible interface reference assignment
