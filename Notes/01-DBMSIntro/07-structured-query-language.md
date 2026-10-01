# Structured Query Language

## Example: SELECT

<p align="center">
  <img src="https://github.com/thespcrewroy/CSCI-4370/blob/main/Notes/assets/instr.png" alt="Instructor Table" width="500"/>
</p>

<p align="center">
  <img src="https://github.com/thespcrewroy/CSCI-4370/blob/main/Notes/assets/query.png" alt="Instructor Table" width="300" />
</p>

## Activity: SQL Query Writing

Q) Write a SQL query to retreive `ID`, `name`, and `dept_name` from `instructors`

```sql
SELECT ID, name, dept_name
FROM instructor;
```

Q) Write a SQL query  to retreive  `ID`, `name` of the `instructors` whose salary is greater than 50000

```sql
SELECT ID, name
FROM instructor
WHERE salary > 50000;
```