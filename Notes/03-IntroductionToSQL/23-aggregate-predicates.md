# Aggregate Predicates

## Activity: Salaries

> [!IMPORTANT]\
> Find the names and average salaries of all departments whose average salary is greater than 50000.

## Answer

```sql
SELECT dept_name, AVG(salary)
FROM instructor
GROUP BY dept_name
HAVING AVG(salary) > 50000;
```

## Short Explanation

- `GROUP BY dept_name` creates one group per department.
- `AVG(salary)` computes each department's average salary.
- `HAVING AVG(salary) > 50000` filters groups after aggregation.

Use `WHERE` for row-level filtering before grouping, and `HAVING` for group-level filtering after aggregates are computed.

## Activity: Courses

> [!IMPORTANT]\
> Find the courses that are used as prerequisites of more than 2 immediate downstream courses. include the columns course_id, title, dependent_count in your result.

```sql
SELECT p.prereq_id AS course_id, c.title, COUNT(*) AS dependent_count
FROM prereq p
JOIN course c ON p.prereq_id = c.course_id
GROUP BY p.prereq_id, c.title
HAVING COUNT(*) > 2;
```