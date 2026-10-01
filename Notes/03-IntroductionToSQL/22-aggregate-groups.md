# Group By

## Activity: Salary

> [!IMPORTANT]\
> Find the minimum, maximum, and average salary of instructors in the departments Statistics and Athletics, grouped by department.

```sql
SELECT department,
	   MIN(salary),
	   MAX(salary),
	   AVG(salary)
FROM instructor
WHERE department IN ('Statistics', 'Athletics')
GROUP BY department;
```

```text
+------------+---------+---------+---------+
| department | min     | max     | avg     |
+------------+---------+---------+---------+
| Statistics |  ...    |  ...    |  ...    |
| Athletics  |  ...    |  ...    |  ...    |
+------------+---------+---------+---------+
```

> [!IMPORTANT]\
> Find the average salary of instructors in each department.

```sql
SELECT department,
       AVG(salary)
FROM instructor
GROUP BY dept_name;
```

<p align="center">
  <img src="https://github.com/thespcrewroy/CSCI-4370/blob/main/Notes/assets/groupbyexample.png" alt="Group By Aggregation Example" width="800" />
</p>

## Activity: Grouping Issue

> [!IMPORTANT]\
> What do you think about the following query? Will it work? Talk with your neighbor.

```sql
SELECT dept_name,
       ID,
       AVG(salary)
FROM instructor
GROUP BY dept_name;
```

It will not work. The issue is `ID`.

When using `GROUP BY`, every selected column must be either:
- included in `GROUP BY`, or
- wrapped in an aggregate function (`AVG`, `COUNT`, `MIN`, `MAX`, etc.)

In this query:
- `dept_name`: grouped (valid)
- `AVG(salary)`: aggregated (valid)
- `ID`: neither grouped nor aggregated (invalid)


A department usually has many instructors, so it has many `ID` values.
For one grouped row per department, SQL cannot decide which single `ID` to display.

### How to Fix It

#### Option 1: Remove `ID` (common)

```sql
SELECT dept_name,
       AVG(salary)
FROM instructor
GROUP BY dept_name;
```

#### Option 2: Group by both `dept_name` and `ID`

```sql
SELECT dept_name,
       ID,
       AVG(salary)
FROM instructor
GROUP BY dept_name, ID;
```

#### Option 3: Aggregate `ID` (rare)

```sql
SELECT dept_name,
       MIN(ID),
       AVG(salary)
FROM instructor
GROUP BY dept_name;
```
