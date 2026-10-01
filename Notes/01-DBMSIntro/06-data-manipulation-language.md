# Data Manipulation Language

```sql
CREATE TABLE instructor {
    ID          CHAR(5),
    name        VARCHAR(20),
    dept_name   VARCHAR(20),
    salary      NUMERIC(8,2)
};
```

## INSERT
```sql
INSERT INTO instructor (ID, name, dept_name, salary)
VALUES ('12345`, 'Taylor', 'Physics', 88000.00);
```
> Insert one row

```sql
INSERT INTO instructor VALUES
('12345`, 'Taylor', 'Physics', 88000.00).
('34567`, 'Adams', 'History', 65000.00)
```
> Insert multiple rows

## SELECT
```sql
SELECT * FROM instructor;
```
> Select from all columns

```sql
SELECT ID, name
FROM instructor;
```
> Select from specific columns

```sql
SELECT ID, name
FROM instructor
WHERE salary > 50000;
```
> Select with condition

```sql
SELECT ID, name
FROM instructor
ORDER BY salary DESC;
```
> Select with sorting

```sql
SELECT AVG(salary)
FROM instructor;
```
> Select with aggregation

## UPDATE

```sql
UPDATE instructor
SET salary = 90000
WHERE ID = '12345';
```
> Give a raise

```sql
UPDATE instructor
SET salary = salary + 1.10;
```
> Increase all salaries by 10%

## DELETE
```sql
DELETE FROM instructor
WHERE ID = '23456'
```
> Delete one instructor

```sql
DELETE FROM instructor;
```
> Delete all rows

