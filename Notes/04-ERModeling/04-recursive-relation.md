
# Recursive Relationship

## Core Idea

<p align="center">
  <img src="https://github.com/thespcrewroy/CSCI-4370/blob/main/Notes/assets/recursiveexample.png" alt="Recursive Relation Example" width="800" />
</p>

- A **recursive** relationship happens when an entity is related to itself.
- A unary relationship
- In this example, the entity is `course`, and the relationship is `prereq`

### Entity and Attributes
- Entity: `course`
- Key attributes shown:
  - `course_id` (primary key)
  - `title`
  - `credits`

### Relationship: `prereq`
- The relationship connects `course` to `course`.
- This models the rule that one course can require another course before enrollment.

### Role Interpretation
- Even though both sides are the same entity, they represent different roles:
  - `course_id`: the main course
  - `prereq_id`: the prerequisite course

### How to Read the Diagram
- The `course` entity appears on both sides of the relationship.
- This does not mean two different entities exist.
- It means one entity type participates twice in different roles.

### Example Meaning
- "Database Systems requires Data Structures"
- Both are rows in the `course` table, but each plays a different role in the `prereq` relationship.

## Why This Matters in Database Design
- Captures dependency chains within the same entity set.
- Prevents duplicate structures just to model prerequisites.
- Provides a clean, standard way to represent self-referencing rules.

## Activity: Example

> [!IMPORTANT]\
> Any other examples? Talk with your neighbor.

Q) **Employee supervised by a manager**

```
    (Manager)           (Subordinate)
               |                      |
               v                      v
          +------------------------------+
          |          EMPLOYEE            |
          |------------------------------|
          | employee_id<pk>              |
          | name                         |
          | salary                       |
          +------------------------------+
                    \        /
                     \      /
                    SUPERVISES
```


Q) **Follower follows a followee in a social network.**

```
   (Follower)            (Followee)
              |                     |
              v                     v
         +-----------------------------+
         |            USER             |
         |-----------------------------|
         | user_id<pk>                 |
         | username                    |
         +-----------------------------+
                   \       /
                    \     /
                     FOLLOWS
```

Q) **Module dependencies.**

```
  (Dependent)           (Dependency)
           |                   |
           v                   v
     +-----------------------------+
     |          MODULE             |
     |-----------------------------|
     | module_id<pk>               |
     | name                        |
     +-----------------------------+
               \        /
                \      /
               DEPENDS_ON
```