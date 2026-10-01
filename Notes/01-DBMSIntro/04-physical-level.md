# Physical Schema in Databases

## Core Concept

- A **physical schema** describes how the DBMS stores and accesses data on disk.
- While the logical schema defines *what* data exists, the physical schema defines *how* it is organized for performance.
- Physical design decisions mainly affect:
	- Query speed
	- Storage usage
	- CRUD operations

## Common Physical Schema Components

### 1) File Organization
- How table records are laid out in storage files.
- Common strategies:
	- **Heap file**: unordered rows, fast inserts.
	- **Sorted file**: rows kept in order by a key, faster range search.

### 2) Indexes
- Extra data structures that speed up lookups.
- Typical choices:
	- **B+ tree index**: great for equality and range queries.
	- **Hash index**: fast equality lookups.
- Trade-off: faster reads, but extra storage and write overhead.

### 3) Partitioning
- Splits a large table into smaller physical pieces.
- Common methods:
	- **Range partitioning** (by date range)
	- **Hash partitioning** (by hash of key)
	- **List partitioning** (by category values)

### 4) Clustering and Data Locality
- Stores related rows near each other physically.
- Helps reduce disk I/O for frequent join or range patterns.

## Example Physical Tuning Operations

```sql
-- Index for fast lookup by primary key access path
CREATE INDEX idx_instructor_id ON instructor(ID);

-- Index for department-based filtering
CREATE INDEX idx_instructor_dept ON instructor(dept_name);
```

```sql
-- Example partitioning idea (syntax varies by DBMS)
CREATE TABLE sales (
  sale_id INT,
  sale_date DATE,
  amount DECIMAL(10,2)
)
PARTITION BY RANGE (sale_date);
```

## Logical vs Physical Schema

| Aspect | Logical Schema | Physical Schema |
|---|---|---|
| Main question | What data is stored? | How is data stored/accessed? |
| Focus | Tables, attributes, constraints | Files, indexes, partitions, access paths |
| Typical user | Developer | Database Administrator |
| Impact | Correctness and meaning | Performance and scalability |

## Activity 1: Representing a Table in Text Files

<p align="center">
  <img src="https://github.com/thespcrewroy/CSCI-4370/blob/main/Notes/assets/physicalschemaactivity1.png" alt="Physical Schema Activity 1" width="800" />
</p>

> [!IMPORTANT]\
> **Talk with your neighbor:** Assume a simple database management system that uses text files under the hood to store data of a database. For every table in the database, there is a corresponding file (or more). File type could be text or binary. How can this database management system represent the above table in a text file? Initial concerns might be: space management, efficiency of access, and encoding.

### Option 1: CSV (Delimiter-Separated)

File: `instructor.csv`

```csv
ID,name,dept_name,salary
22222,Einstein,Physics,95000
12121,Wu,Finance,90000
32343,"El Said",History,60000
```

Encoding and escaping:
- Use UTF-8.
- Handle commas/newlines/quotes using quoted fields.
- Example values: `"El, Said"`, `"Line1\nLine2"`, and `""` for quotes inside strings.

Pros:
- Compact
- Human-readable
- Easy to parse

Cons:
- Slow random access without an index

### Option 2: Fixed-Width Records

File: `instructor.fw`

```text
ID     NAME        DEPT_NAME   SALARY
22222  Einstein    Physics     95000
12121  Wu          Finance     90000
32343  El Said     History     60000
```

Pros:
- Fast random access (seek by record position)
- Simple parsing by column boundaries

Cons:
- Wastes space due to padding
- Harder inserts/deletes

### Option 3: JSON Lines (One Record Per Line)

File: `instructor.jsonl`

```json
{"ID":22222,"name":"Einstein","dept_name":"Physics","salary":95000}
{"ID":12121,"name":"Wu","dept_name":"Finance","salary":90000}
{"ID":32343,"name":"El Said","dept_name":"History","salary":60000}
```

Pros:
- Clean string and escaping behavior
- Flexible schema evolution

Cons:
- Larger storage size
- Still needs indexing for fast random lookup

### Handling Initial Concerns

Space management:
- CSV is usually the smallest.
- Fixed-width wastes space.
- JSONL is often largest because field names repeat.

Efficiency of access:
- Full scans are straightforward.
- Random lookup is poor without an index.
- Lookup process (paging): search index, get offset, seek to pos, read one line

Encoding rules:
- Use UTF-8
- Define consistent delimiter rules
- Use consistent newline (`\n`)

## Activity 2: How DBMS Uses the File Structure

> [!IMPORTANT]\
> **Talk with your neighbor:** How will this file structure you designed be used by the database management system? List some concrete use cases.

### Use Case 1: Finding Name by ID

Query:

```sql
SELECT name FROM instructor WHERE ID = 22222;
```

DBMS steps:
1. Open index file
2. Binary search `ID`
3. Get byte offset
4. Seek to the offset in data file
5. Read record
6. Parse and return `name`

Efficiency:
- Avoids full table scan
- `O(log n)` index lookup + near `O(1)` seek and read

### Use Case 2: Updating Salary

Query:

```sql
UPDATE instructor
SET salary = 98000
WHERE ID = 22222;
```

CSV (variable length):
- Lookup offset
- Read record
- Modify salary
- Rewrite line
- If record length changes: rewrite file or mark old row deleted and append new row

Fixed-width:
- Lookup offset
- Seek directly
- Overwrite salary field in-place
- Conclusion: fixed-width is usually better for in-place updates.
