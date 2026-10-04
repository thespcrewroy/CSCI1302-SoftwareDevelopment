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
  <img src="https://github.com/thespcrewroy/CSCI1302-SoftwareDevelopment/blob/main/Notes/assets/7-6.png" />
</p>

<details>
<summary><b>Given the UML Class Diagram below, write the constructor(s) for the child class(es) in your notes. If the user inputs a negative value for an id, the constructor(s) should throw an <code>IllegalArgumentException</code> containing an appropriate message.</b></summary>

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
 * Initializes the instance variables of a new {@code Student} object.
 *
 * @param name the name of the student.
 * @param age the age of the student.
 * @param studentId the student's id number.
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