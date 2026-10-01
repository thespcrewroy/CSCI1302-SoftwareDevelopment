# Schema Design

## Example: University Schema

```
classroom(building<pk>, room_number<pk>, capacity)
department(dept_name<pk>, building, budget)
course(course_id<pk>, title, dept_name<fk>, credits)
instructor(instr_id<pk>, name, dept_name<fk>, salary)
section(course_id<pk, fk>, sec_id<pk>, semester<pk>, year<pk>, building<fk>, room_number<fk>, time_slot_id<fk>)
teaches(instr_id<pk, fk>, course_id<pk, fk>, sec_id<pk, fk>, semester<pk, fk>, year<pk, fk>)
student(stu_id<pk>, name, dept_name<fk>, total_credit)
takes(stu_id<pk, fk>, course_id<pk, fk>, sec_id<pk, fk>, semester<pk, fk>, year<pk, fk>, point_grade)
advisor(stu_id<pk, fk>, instr_id<fk>)
time_slot(time_slot_id<pk>, day<pk>, start_time<pk>, end_time)
prereq(course_id<pk, fk>, prereq_id<pk, fk>)
```
> [!IMPORTANT]\
> How do you design a schema like the university schema capturing business requirements? What relations do you create? What should be the attributes of those relations? What are the primary and foreign keys? How do you know for sure your design can model the application without missing anything?

### Step-By-Step

#### 1. Identify Entity Sets
- Ask: what core "things" exist in the system?
- These tables have no foreign key as their primary key.
- These become base tables because each represents a real object with its own data.
- Ex. `classroom`, `department`, `course`, `instructor`, `student`, and `time_slot`

#### 2. Identify Relationship Sets
- Ask: how are entities connected?
- Relationship tables are usually needed when the relationship is many-to-many or the relationship has its own attributes
- Examples:
	- `section(course_id. sec_id, semester, year, building, room_number, time_slot_id`
	    - one instructor can offer many sections (many-to-many)
	    - one section can be taught by many instructions (many-to-many)
	- `teaches(instr_id, course_id, sec_id, semester, year)`
	    - an instructor can offer many sections (many-to-many)
	    - one section can be taught by many instructions (many-to-many)
	- `takes(stu_id, course_id, sec_id, semester, year, point_grade)`
		- one student takes many sections (many-to-many)
		- one section has many students (many-to-many)
		- the relationship has its own attribute (`point_grade`)
	- `advisor(stu_id, instr_id)`
	  - one student can have many advisors (many-to-many)
	  - one advisor has many students (many-to-many)
	- `prereq(course_id, prereq_id)`
	  - self-relationship over `course`
	  - a course can require many other courses as prereqs (many-to-many)
	  - a prereq can satisfy many different courses (many-to-many)

#### 3. Decide Attributes For Each Relation
- Attributes should be descriptive (ex. `student(stu_id, name, dept_name, total_credit)`.
- Similar attribute names for different entity sets must have intentional naming differences.

#### 4. Choose Primary Keys
- A PK must uniquely identify each row.
- Use the smallest set of columns that uniquely identifies each row.
- Single-column PK examples:
	- `student(stu_id, ...)`: PK is `stu_id`
	- `course(course_id, ...)`: PK is `course_id`
- Composite PK example:
	- `section(course_id, sec_id, semester, year, ...)`: PK is `(course_id, sec_id, semester, year)` because the same course and section can be offered in multiple semesters.

#### 5. Add Foreign Keys
- An FK indicates one table refers to another table.
- If a column points to data owned by another table, model it as an FK.
- Examples:
	- `student.dept_name` -> `department.dept_name`
	- `course.dept_name` -> `department.dept_name`
	- `advisor.stu_id` -> `student.stu_id`
	- `advisor.instr_id` -> `instructor.instr_id`
  
### Final Schema

#### Entity Set Tables
```
classroom(building<pk>, room_number<pk>, capacity)
department(dept_name<pk>, building, budget)
course(course_id<pk>, title, dept_name<fk>, credits)
instructor(instr_id<pk>, name, dept_name<fk>, salary)
student(stu_id<pk>, name, dept_name<fk>, total_credit)
time_slot(time_slot_id<pk>, day<pk>, start_time<pk>, end_time)
```

#### Relationship Set Tables
```
section(course_id<pk, fk>, sec_id<pk>, semester<pk>, year<pk>, building<fk>, room_number<fk>, time_slot_id<fk>)
teaches(instr_id<pk, fk>, course_id<pk, fk>, sec_id<pk, fk>, semester<pk, fk>, year<pk, fk>)
takes(stu_id<pk, fk>, course_id<pk, fk>, sec_id<pk, fk>, semester<pk, fk>, year<pk, fk>, point_grade)
advisor(stu_id<pk, fk>, instr_id<fk>)
prereq(course_id<pk, fk>, prereq_id<pk, fk>)
```


## Activity: Books and Authors

Each book has the following information: ```isbn```, ```title```, ```year```, ```publisher name```, and ```subject```.

Each author has the following information: ```author id```, ```first name```, ```last name```, ```country```, and ```genre```.

**A book is only written by one author.**

 **One author may write multiple books.**

> [!IMPORTANT]\
> What should be the schema?

### Step-by-Step
1. Identify entities:
	 - `Book`
	 - `Author`
2. Identify relationships:
     - One author can write many books (one-to-many)
	 - Each one book has one author (one-to-one)
	 - This is one-to-many, so no relationship table is required
3. Identify attributes:
	 - Book: `isbn`, `title`, `year`, `publisher_name`, `subject`, `author_id`
    	 - `isbn`: identifies book rows
    	 - add `author_id`: link a book to a specific author
	 - Author: `author_id`, `first_name`, `last_name`, `country`, `genre`
    	 - `author_id`: identifies author rows
4. Choose Primary Keys
	- `Bookt(isbn, ...)`: PK is `isbn`
	- `Author(author_id, ...)`: PK is `author_id`
5. Add Foreign Keys
      - `Book.author_id` -> `Author.author_id`
	 

### Final Schema

#### Entity Set Tables
- `Author(author_id<pk>, first_name, last_name, country, genre)`
- `Book(isbn<pk>, title, year, publisher_name, subject)`

#### Relationship Set Tables
- `Writes(isbn<pk, fk>, author_id<fk>)`
