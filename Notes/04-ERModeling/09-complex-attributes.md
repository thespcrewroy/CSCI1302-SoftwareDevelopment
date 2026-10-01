# Complex Attributes

<p align="center">
  <img src="https://github.com/thespcrewroy/CSCI-4370/blob/main/Notes/assets/complexattributesexample.png" alt="Complex Attributed Entity" width="800" />
</p>


## 1. Simple vs Composite Attributes

### Simple Attribute

A simple attribute cannot be divided further.

Examples:
- ID
- salary

### Composite Attribute


A composite attribute can be broken into smaller parts.

Examples:
- Name
	- first_name
	- middle_initial
	- last_name
- Address
	- street
		- street_number
		- street_name
	- apt_number
	- city
	- state
	- zip

These are hierarchical attributes because attributes contain sub-attributes.

## 2. Single-Valued vs Multi-Valued Attributes

### Single-Valued

- Has one value per entity.
- Examples: ID, date_of_birth, etc.

### Multi-Valued

- Can have multiple values for one entity.
- Example: One instructor can have two phone numbers (123-4567 and 987-6543)
- A table cell cannot have multivalued attributes in the relational model.
    - Relational tables follow First Normal Form (1NF)
    - Every table cell must contain an atomic (single) value
    - Must extend the table: Instructor(ID, name, phone_numbers)
        - Instructor(ID, name)
        - InstructorPhone(ID, phone_number)
            

## 3. Derived Attributes

- Computed from other attributes.
- May be stored, or computed when needed
- Ex. age derived from date_of_birth


## 4. Diagram Interpretation

Entity: Instructor

Attributes:
- ID (primary key)
- name (composite)
- address (composite)
- {phone_number} (multivalued)
- date_of_birth (stored)
- age() (derived)

## 5. ER Notation Quick Reference

| Symbol | Meaning |
| --- | --- |
| Nested attributes | Composite attribute |
| { } | Multivalued attribute |
| ( ) | Derived attribute |

## 6. Key Takeaways

- Composite attributes can be decomposed into smaller parts.
- Multivalued attributes should not be stored directly in relational table cells.
- Derived attributes are computed from other stored data.
- The relational model prefers atomic values (1NF).

| Type | Example | Stored? |
| --- | --- | --- |
| Simple | ID | Yes |
| Composite | Address | Yes (flattened into columns) |
| Multivalued | phone_numbers | No (use a separate table) |
| Derived | age | No (computed) |
