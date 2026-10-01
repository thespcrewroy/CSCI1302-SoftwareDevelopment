# Aggregate Functions

Aggregate functions compute a single summary value from multiple rows.

Common examples:
- AVG()
- COUNT()
- MIN()
- MAX()

## Activity: Average Salary

> [!IMPORTANT]\
> Find the average salary of instructors in the Computer Science department.

```sql
SELECT AVG(salary)
FROM instructor
WHERE dept_name = 'Comp. Sci.';
```

## Activity: Count of Instructors Teaching

> [!IMPORTANT]\
> Find the total number of instructors who teach a course in the Spring 2018 semester.

```sql
SELECT COUNT(DISTINCT ID)
FROM teaches
WHERE semester = 'Spring' AND year = 2018;
```

## Activity: Number of Tuples

> [!IMPORTANT]\
> Find the number of tuples in the course relation.

```sql
SELECT COUNT(*)
FROM course;
```

## Quick Notes

- COUNT(*) counts all rows.
- COUNT(DISTINCT col) counts unique non-NULL values.
- AVG(), MIN(), and MAX() ignore NULL values.
- GROUP BY creates one result row per group.
