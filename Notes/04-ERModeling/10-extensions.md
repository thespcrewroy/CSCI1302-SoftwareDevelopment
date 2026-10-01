# Extended ER (EER): Specialization and Generalization

<p align="center">
  <img src="https://github.com/thespcrewroy/CSCI-4370/blob/main/Notes/assets/extensionexample.png" alt="Complex Attributed Entity" width="800" />
</p>

Extended ER (EER) adds inheritance-style modeling using IS-A relationships.

## Specialization

- A top-down approach
- Start with a general entity (supertype).
- Split it into more specific entities (subtypes).
- Example: Person -> Student, Employee
    - A Student IS-A Person
    - An Employee IS-A Person.

## Generalization

Generalization is a bottom-up approach:
- Start with multiple specific entities.
- Combine them into a more general entity.
- Example: Instructor + Secretary -> Employee -> Person

## Example: Diagram Interpretation

Person (supertype):
- ID
- name
- street
- city

Employee (subtype of Person):
- salary

Student (subtype of Person):
- tot_credits

Instructor (subtype of Employee):
- rank

Secretary (subtype of Employee):
- hours_per_week

## Inheritance

- Subtypes inherit all attributes from their parent(s).
- Example: Instructor inherits
    - ID, name, street, city (from Person)
    - salary (from Employee)
    - rank (its own attribute)

## Constraint: Disjoint vs Overlapping

- Disjoint:
    - An entity can belong to only one subtype in that specialization tree.
    - Example: Someone is either Instructor or Secretary, not both.
    - Denoted by shared arrow head
- Overlapping:
    - An entity can belong to multiple subtypes.
    - Example: Someone can be both Student and Employee.
    - Denoted by seperate arrow head

## Conversion to Schema

<p align="center">
  <img src="https://github.com/thespcrewroy/CSCI-4370/blob/main/Notes/assets/specializationtoschema.png" alt="Specialization to Schema" wight="400" height="450"/>
</p>
<p align="center">
  <img src="https://github.com/thespcrewroy/CSCI-4370/blob/main/Notes/assets/specializationtoschema2.png" alt="Specialization to Schema Converted" wight="400" height="450"/>
</p>

* Take a specialization of entity set (E) into S1, ...,Sn
* Create a relation for entity set (E) with all attributes of E
* The PK of E is the PK of the new relation
* For each S_i:
    * Create a relation with PK(E) as PK
    * Make PK(E) a foreign key to entity set (E)
    * Add all attributes of Si that do not exist in entity set (E)

## Reference Guide

| Symbol | Meaning |
| --- | --- |
| Triangle arrows | IS-A relationship |
| Separate arrows to subtypes | Overlapping constraint |
| Shared arrowhead | Disjoint constraint |
