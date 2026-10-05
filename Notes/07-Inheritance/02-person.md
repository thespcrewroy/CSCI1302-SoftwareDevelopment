# Person Example

<p align="center">
  <img src="https://github.com/thespcrewroy/CSCI1302-SoftwareDevelopment/blob/main/Notes/assets/7-3.png" />
</p>

The example code in this section was written without inheritance, so we need to refactor it to eliminate existing redundancies. However, in a real world setting, you would want to design carefully to **avoid writing redundant code in the first place.**

<p align="center">
  <img src="https://github.com/thespcrewroy/CSCI1302-SoftwareDevelopment/blob/main/Notes/assets/7-4.jpg" />
</p>

By utilizing the power of inheritance, we were able to remove two redundant instance variable declarations from `Employee` along with two redundant method declarations. These instance variables and methods are now written only once in the parent `Person` superclass.

<p align="center">
  <img src="https://raw.githubusercontent.com/andreasbm/readme/master/assets/lines/solar.png" width="2000" />
</p>

<p align="center">
  <img src="https://github.com/thespcrewroy/CSCI1302-SoftwareDevelopment/blob/main/Notes/assets/7-6.png" />
</p>

<details>
<summary><b>Given the UML Class Diagram above, write the constructor(s) for the child class(es) in your notes. If the user inputs a negative value for an id, the constructor(s) should throw an <code>IllegalArgumentException</code> containing an appropriate message.</b></summary>

<br>

```java
/**
 * Initializes the instance variables of a new {@code Student} object.
 *
 * @param name the name of the student.
 * @param age the age of the student.
 * @param studentId the student's id number.
 * @throws IllegalArgumentException if the student id number is negative.
 */
public Student(String name, int age, int studentId) {
    super(name, age);

    if (studentId < 0) {
        throw new IllegalArgumentException("The student id number must be nonnegative");
    } // if

    this.studentId = studentId;
} // Student
```

```java
/**
 * Initializes the instance variables of a new {@code Professor} object.
 *
 * @param name the name of the professor.
 * @param age the age of the professor.
 * @param employeeId the professor's employee id number.
 * @throws IllegalArgumentException if the employee id number is negative.
 */
public Professor(String name, int age, int employeeId) {
    super(name, age);

    if (employeeId < 0) {
        throw new IllegalArgumentException("The employee id number must be nonnegative");
    } // if

    this.employeeId = employeeId;
} // Professor
```

</details>

<details>
<summary><b>The constructor for the Professor class should look almost identical to the Student constructor with studentId replaced with employeeId. Can you think of a way to avoid redundancy by writing a method to check if the id is valid?</b></summary>

<br>

```java
/**
 * Error handling method for sub-class id numbers.
 *
 * @throws IllegalArgumentException if the id number is negative.
 */
protected static void validateId(int id, String idType) {
    if (id < 0) {
        throw new IllegalArgumentException("The " + idType + " must be nonnegative");
    } // if
} // validateId
```

```java
/**
 * Initializes the instance variables of a new {@code Student} object.
 *
 * @param name the name of the student.
 * @param age the age of the student.
 * @param studentId the student's id number.
 */
public Student(String name, int age, int studentId) {
    super(name, age);
    validateId(studentId, "student id number");
    this.studentId = studentId;
} // Student
```

```java
/**
 * Initializes the instance variables of a new {@code Professor} object.
 *
 * @param name the name of the professor.
 * @param age the age of the professor.
 * @param employeeId the professor's employee id number.
 */
public Professor(String name, int age, int employeeId) {
    super(name, age);
    validateId(employeeId, "employee id number");
    this.employeeId = employeeId;
} // Professor
```

</details>
