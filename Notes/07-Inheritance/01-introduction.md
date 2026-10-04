# Introduction

<p align="center">
  <img src="https://github.com/thespcrewroy/CSCI1302-SoftwareDevelopment/blob/main/Notes/assets/7-1.png" />
</p>

<details>
<summary><b>Take a moment to identify the instance variables and methods that will be identical in both classes. You should see a high degree of overlap. If we added an interface <code>Drivable</code>, could that help us eliminate this redundancy?</b></summary>
<br>

The methods <code>getMake</code> and <code>getYear</code> are the exact same in both classes. Rather than having the same method name with different implementations, they actually contain the exact same code in both classes. Thus, interfaces cannot help here. Interfaces help us cut down on redundant code in the Driver program when we call these classes, but it won't cut down on redundant code across the class definitions. We would benefit from the polymorphism and type compatibility that comes with using an interface but it would not cut down on the amount of code required to create these classes.

</details>

<br>

<p align="center">
  <img src="https://github.com/thespcrewroy/CSCI1302-SoftwareDevelopment/blob/main/Notes/assets/7-2.png" />
</p>

Compare the second version of the UML class diagram to the first one. Notice how much smaller the `Car` class is now. Instead of copy/pasting methods and instance variables, we simply add the inheritance (extends) relationship and everything from `Vehicle` is automatically copied into `Car`.

> [!NOTE]\
> The functionality of the <code>Car</code> class has not changed. We can still call <code>getMake()</code> and <code>getYear()</code> using a <code>Car</code> reference even though those methods aren't explicitly defined in the <code>Car</code> class. That's because they are inherited.