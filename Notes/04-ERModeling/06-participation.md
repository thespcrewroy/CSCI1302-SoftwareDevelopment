# Participation of Entity Sets

## Types of Participation

### 1. Total Participation (Mandatory)

- Every entity in the entity set must participate in the relationship.
- In ER diagrams, this is shown with a double line.

### 2. Partial Participation (Optional)
- Some entities may participate, while others may not.
- In ER diagrams, this is shown with a single line.

## Example: Diagram Interpretation
<p align="center">
  <img src="https://github.com/thespcrewroy/CSCI-4370/blob/main/Notes/assets/totalparticipationexample.png" alt="Entity Set Participation Example" width="800" />
</p>

- `Instructor` -- `Advisor` == `Student`
- `Instructor` side is optional, `Student` side is mandatory.
- Every `Student` must be connected to an `Instructor` through the `Advisor` relationship.
- Not every `Instructor` must advise a student.