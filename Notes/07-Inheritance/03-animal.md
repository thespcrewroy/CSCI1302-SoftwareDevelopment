# Animal Example

<p align="center">
  <img src="https://github.com/thespcrewroy/CSCI1302-SoftwareDevelopment/blob/main/Notes/assets/7-5.png" />
</p>

<details>
<summary><b>How many inheritance relationships are present in the diagram?</b></summary>
<br>

There is one inheritance relationship: `Dog` extends `Animal`.

</details>

<details>
<summary><b>In each inheritance relationship, which class is the parent and which is the child?</b></summary>
<br>

`Dog` is the child class and `Animal` is the parent.

</details>

<details>
<summary><b>Look at each inheritance relationship. Intuitively, does an inheritance relationship seem appropriate?.</b></summary>
<br>

Would you say that `Dog` is an `Animal`? Yes. So, the inheritance relationship is appropriate. Another way to think about it is whether or not it is appropriate for `Dog` to inherit the genus and species attributes and the getGenus and getSpecies methods. Again, the answer is "yes"

</details>

<p align="center">
  <img src="https://raw.githubusercontent.com/andreasbm/readme/master/assets/lines/solar.png" width="2000" />
</p>

<p align="center">
  <img src="https://github.com/thespcrewroy/CSCI1302-SoftwareDevelopment/blob/main/Notes/assets/7-7.jpg" />
</p>

```java
/**
 * Prints a description of the {@Animal}.
 */
 public void describe() {
    System.out.println("This is an animal named " + this.name + ".");
 } // describe
```

```java
/**
 * Prints a description of the {@Cat}.
 */
 @Override
 public void describe() {
    super.describe(); // calls the describe method of the parent.

    System.out.println(this.getName() + " is an agile cat."); // adds to it
 } // describe
```
</details>

<details>
<summary><b>What is the output?.</b></summary>
<br>

```
Cat:
This is an animal named Whiskers.
Whiskers is an agile cat.

Cat:
This is an animal named Garfield.
Garfield is an agile cat.
```

</details>
