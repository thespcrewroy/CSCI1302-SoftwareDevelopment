# Data Definition Language

* The part of SQL used to define and modify the structure (schema) of a database
* It does not manipulate the data itself, but rather defines to structure
* Use cases: enforces data types, controls storage format, enables integrity constraints, and defines how files will be structured
  
## Activity: CREATE

<p align="center">
  <img src="https://github.com/thespcrewroy/CSCI-4370/blob/main/Notes/assets/ddl.png" alt="DDL Example" width="600"/>
</p>

* **create table instructor:** add metadata to system catalog, allocate storage files, and pepare internal structures
* **ID char(5):** fixed-length string. If string is shorter, then pad with spaces
* **dept_name varchar(20) && name varchar(20):** variable-length string up to 20 characters
* **salary numeric(8,2):** numeric value totalling 8 digits, while allocating 2 digits after decimal point

## CREATE

```sql
CREATE TABLE
CREATE INDEX
CREATE VIEW
```
> Creates new objects

## ALTER
```sql
ALTER TABLE instructor ADD office varchar(10);
ALTER TABLE instructor MODIFY salary numeric(10,2);
```
> Modifies existing structure

## DROP
```sql
DROP TABLE instructor;
```
> Removes all rows from the table very quickly

* Faster than `DELETE`
* Cannot use `WHERE`
* Usually cannot be roled back

## TRUNCATE
```sql
TRUNCATE TABLE instructor;
```
> Deletes all records and deallocates storage directly

## DESCRIBE
```sql
DESC instructor;
```
> Outputs a description of the table: column, type, null?, pri_key?, default input

## COMMENT
```sql
COMMENT ON TABLE instructor IS 'Stores instructor information';
COMMENT ON COLUMN instructor.salary IS 'Annual salary in USD';
```