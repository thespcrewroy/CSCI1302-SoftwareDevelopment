# CREATE TABLE

## Core Concept

```sql
CREATE TABLE r (
	A1 D1,
	A2 D2,
	...,
	An Dn,
	integrity_constraint1,
	...,
	integrity_constraintk
);
```

* **r**:  Name of the table (relation).
* **A<sub>i</sub>** column names.
* **D<sub>i</sub>**: The type of data each column stores.

## Integrity Constraints

- **PRIMARY KEY**: No duplicate IDs. ID cannot be NULL. Combines UNIQUE and NOT NULL.
- **FOREIGN KEY**: Valid references to other tables. Enforces referential integrity.
- **NOT NULL**: Required fields cannot be empty. Ensures data completeness. Prevents missing critical information.
- **UNIQUE**
- **CHECK**

## Activity: Detailed Constraints Interpretation

```sql
CREATE TABLE instructor (
	ID CHAR(6),
	name VARCHAR(50) NOT NULL,
	salary NUMERIC(8, 2) NOT NULL,
	dept_name VARCHAR(20) NOT NULL,
	PRIMARY KEY (ID),
	FOREIGN KEY (dept_name) REFERENCES department(dept_name)
);
```
> [!IMPORTANT]\
> What are the constraints that you see above? Data types for each column.
> Null not allowed for some columns. What does this mean? What is the importance?
> Primary key constraint.

### Data Type Constraints

Each column has a domain (type):

| Column | Type | Meaning |
| --- | --- | --- |
| ID | CHAR(6) | Fixed-length string |
| name | VARCHAR(50) | Variable-length string |
| salary | NUMERIC(8,2) | Variable-length string |
| dept_name | VARCHAR(20) | String |

### NOT NULL Constraints

```sql
name NOT NULL
salary NOT NULL
dept_name NOT NULL
```

### Primary Key Constraint

```sql
PRIMARY KEY (ID)
```

### D) Foreign Key Constraint

```sql
FOREIGN KEY (dept_name) REFERENCES department(dept_name)
```

## Activity: DESCRIBE ```department```

```sql
DESCRIBE department;
```

Sample output:

| Field | Type | Null | Key |
| --- | --- | --- | --- |
| dept_name | VARCHAR(20) | NO | PRI |
| building | VARCHAR(20) | YES | |
| budget | NUMERIC | YES | |

## Activity: Foreign Key Reference Quorum

> [!IMPORTANT]\
> Can you add fk if referenced table does not exist? What if the table exists but the column does not exist? Can a foreign key reference a non-primary-key column?

- You cannot add an FK if the referenced table or column do not exist
- A foreign key can reference a non-primary key column only if the referenced column is UNIQUE
- If the target column is neither PRIMARY KEY nor UNIQUE, it is not allowed because the reference could be ambiguous.

Valid example:

```sql
CREATE TABLE department (
	dept_name VARCHAR(20) UNIQUE,
	building VARCHAR(20)
);

FOREIGN KEY (dept_name) REFERENCES department(dept_name)
```

## Activity: Create The Following Schema

<p align="center">
  <img src="https://github.com/thespcrewroy/CSCI-4370/blob/main/Notes/assets/create.png" alt="Relation Example" width="800" />
</p>

```sql
CREATE TABLE Customers (
    cid INT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    zip VARCHAR(10) NOT NULL
);

CREATE TABLE Orders (
    oid INT PRIMARY KEY,
    date DATE NOT NULL,
    amount DECIMAL(10,2) NOT NULL CHECK (amount >= 0),
    cid INT NOT NULL,
    FOREIGN KEY (cid) REFERENCES Customers(cid)
);
```
