# Person Example

<p align="center">
  <img src="https://github.com/thespcrewroy/CSCI1302-SoftwareDevelopment/blob/main/Notes/assets/7-3.png" />
</p>

The example code in this section was written without inheritance, so we need to refactor it to eliminate existing redundancies. However, in a real world setting, you would want to design carefully to **avoid writing redundant code in the first place.**

<p align="center">
  <img src="https://github.com/thespcrewroy/CSCI1302-SoftwareDevelopment/blob/main/Notes/assets/7-4.jpg" />
</p>

By utilizing the power of inheritance, we were able to remove two redundant instance variable declarations from `Employee` along with two redundant method declarations. These instance variables and methods are now written only once in the parent `Person` superclass.