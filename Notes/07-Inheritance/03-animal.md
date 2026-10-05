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
  <img src="https://github.com/thespcrewroy/CSCI1302-SoftwareDevelopment/blob/main/Notes/assets/7-7.png" />
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
<summary><b>What is the output?</b></summary>
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

<p align="center">
  <img src="https://raw.githubusercontent.com/andreasbm/readme/master/assets/lines/solar.png" width="2000" />
</p>

<p align="center">
  <img src="https://github.com/thespcrewroy/CSCI1302-SoftwareDevelopment/blob/main/Notes/assets/7-8.png" />
</p>

By declaring the `Animal` class abstract, we are telling the users of our hierarchy that they should not instantiate it (it doesn't really make sense to do so) and that they should instantiate one of the child classes instead.

<p align="center">
  <img src="https://raw.githubusercontent.com/andreasbm/readme/master/assets/lines/solar.png" width="2000" />
</p>

<p align="center">
  <img src="https://github.com/thespcrewroy/CSCI1302-SoftwareDevelopment/blob/main/Notes/assets/7-9.png" />
</p>

We can leverage polymorphism in inheritance hierarchies as well. For example, variables of type `Animal` can reference objects of type `Dog`. If we extended this hierarchy further by adding other animals as child classes to `Animal`, the compatibility would work.

```java
public static void main(String[] args) {
   Dog fido = new Dog("Juno", "Jack Russell");
   Animal garfield = new Cat("Garfield");

   // AnimalInfo works for either variable / object!
   Driver.animalInfo(fido);
   Driver.animalInfo(garfield);
} // main
```

```java
public static void animalInfo (Animal currentAnimal) {
   System.out.println("More information about the animal:\n"):

   currentAnimal.describe();

   System.out.println("The animal lets out a loud: ");
   currentAnimal.makeSound();
} // animalInfo
```

Assuming that the `makeSound` method in each child class is implemented and prints an appropriate "sound" for each animal, we could leverage polymorphism to write code using an `Animal` variable like the above.
