# Database Abstraction Levels

## Why Abstraction Matters
<p align="center">
  <img src="https://github.com/thespcrewroy/CSCI-4370/blob/main/Notes/assets/abstractionvisualization.png" alt="Abstraction Example" width="800" />
</p>

- Database systems hide low-level complexity so users can work with data more easily.
- Abstraction separates:
	- What users see
	- What the schema defines
	- How data is actually stored

### 1) View Level (External Level)
- Provides **user-specific views** of the database.
- Different users can see different subsets of data.
- Used for simplicity, usability, and security.
- Example idea: `view_1`, `view_2`, ..., `view_n`.

### 2) Logical Level (Conceptual Level)
- Describes **what data is stored** and **relationships** among tables.
- This is where the relational schema is defined.
- Example schema:
	- `instructor(ID, name, dept_name, salary)`

### 3) Physical Level (Internal Level)
- Describes **how data is stored physically**.
- Includes storage details such as:
	- File structures
	- Indexing
	- Storage access methods
- Normally hidden from regular end users.

## Main Purpose of the 3-Level Architecture
- Hide implementation complexity
- Support multiple customized views
- Keep logical design independent from physical storage choices

## Activity: Example Views
<p align="center">
  <img src="https://github.com/thespcrewroy/CSCI-4370/blob/main/Notes/assets/abstractionexample.png" alt="Views Example" width="800" />
</p>

> [!IMPORTANT]\
> **Talk to your neighbor:** Describe a **view** for the following relation instance that was taken from a university database. What could be a use for the view you described?


### Public Instructor View:
  
```sql
CREATE VIEW instructor_public AS
SELECT ID, name, dept_name
FROM instructor;
```

- Intended for students
- Excludes sensitive fields like salary

### High Salary View:

```sql
CREATE VIEW high_salary AS
SELECT name, dept_name, salary
FROM instructor
WHERE salary > 80000;
```

- Intended for administrative analysis
- Focuses on identifying highly paid faculty

### Department Specific View:

```sql
CREATE VIEW comp_sci_instructors AS
SELECT *
FROM instructor
WHERE dept_name = 'Comp. Sci.';
```

- Intended for department heads
- Focuses on instructors within a specific department

## Quick Takeaway
- View level answers: "What does this user need to see?"
- Logical level answers: "What is the data model?"
- Physical level answers: "How is it stored efficiently?"
