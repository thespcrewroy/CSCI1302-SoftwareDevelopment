# Relationship Sets

## Core Idea

<p align="center">
  <img src="https://github.com/thespcrewroy/CSCI-4370/blob/main/Notes/assets/relationshipsetexample.png" alt="Relationship Set Example" width="800" />
</p>

- Note the relationship set notation above
- A **relationship set** describes how entity sets are associated in an ER model.
- The **degree** of a relationship is the number of participating entity sets.
- The entity set and its attributes are specified in the relationship set
- Primary keys are underlined
- Each entity set needs a primary key

## Relationship Degrees
- **Unary (recursive)**: relationship within the same entity set
- **Binary**: relationship between two entity sets
- **Ternary**: relationship among three entity sets

## Activity: Examples

> [!IMPORTANT]\
> Think of few example entity sets. Recognize some meaningful relationships among the entities. What is the degree of the relationships you recognized?
 

### 1) Students and Courses
- Entities: `Student`, `Course`
- Relationship: `EnrollsIn`
- Example instance: Student `S1` enrolls in Course `C1`
- Degree: **Binary** (2 entities)

### 2) Doctor, Patient, and Hospital
- Entities: `Doctor`, `Patient`, `Hospital`
- Relationship: `TreatsAt`
- Example instance: Doctor `D1` treats Patient `P1` at Hospital `H1`
- Degree: **Ternary** (3 entities)

### 3) Employee and Department
- Entities: `Employee`, `Department`
- Relationship: `WorksIn`
- Example instance: Employee `E1` works in Department `D1`
- Degree: **Binary**

### 4) Supplier, Product, and Project
- Entities: `Supplier`, `Product`, `Project`
- Relationship: `SuppliesFor`
- Example instance: Supplier `S1` supplies Product `P1` for Project `PR1`
- Degree: **Ternary**

### 5) Person Self-Relationship
- Entity: `Person`
- Relationship: `Manages`
- Example instance: Person `P1` manages Person `P2`
- Degree: **Unary** (recursive relationship)

## Activity: Books and Authors

> [!IMPORTANT]\
> A book shop keeps records of books and authors. Each book has an isbn, a title, an year and a subject. Each author has an author id, a first name, a last name and a country. Books are written by authors. Talk with your neighbor and draw an ER diagram for this.


```
        +-------------------+             +-------------------+
        |      AUTHOR       |             |       BOOK        |
        |-------------------|             |-------------------|
        | author_id<pk>     |             | isbn<pk>          |
        | first_name        |             | title             |
        | last_name         |             | year              |
        | country           |             | subject           |
        +-------------------+             +-------------------+
                  \                             /
                   \                           /
                    \                         /
                     \      WRITES           /
                      \      (1:N)          /
                       ---------------------
```

```
Author(author_id<pk>, first_namee, last_name, country)
Book(isbn<pk>, title, year, Subject)
Writes(isbn<pk, fk>, author_id<fk>)
```

* Entities: Author, Book
* Relationship: Writes
* Degree: Binary (2 entities)
* Example instance: Author `A1` writes a Book `B1`
* Cardinality: One-To-Many (1:N)
    * One author can write multiple books
    * A book can only be written by one author
