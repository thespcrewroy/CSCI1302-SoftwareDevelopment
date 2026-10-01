# Exercises

## Exercise 1: ER Diagram Interpretation

<p align="center">
  <img src="https://github.com/thespcrewroy/CSCI-4370/blob/main/Notes/assets/exercise1.png" alt="Exercise 1" width="800" />
</p>

> [!IMPORTANT]\
> **Talk with your neighbor:** List down each relationship set. Interpret the notations around each of them: cardinalities, participation, associated entities and their attributes, self-referencing, composite multivalues, relationship set attributes, and weak entities.

### (01) Entities and Attributes

```
department(dept_name<pk>, building, budget)
instructor(id<pk>, name, salary)
student(id<pk>, name, tot_cred)
course(course_id<pk>, title, credits)
section(sec_id<pk, fk>, semester<pk, fk>, year<pk, fk>)
classroom(building<pk>, room_number<pk>, capacity)
time_slot(time_slot_id<pk>)
```

### (02) Relationship Sets

```
course_dept (Course-Department)
inst_dept (Instructor-Department)
stud_dept (Student-Department)
advisor (Instructor-Student)
teaches (Instructor-Section)
takes (Student-Section)
sec_course (Section-Course) - Weak Relation
sec_time_slot (Section-Time_slot)
sec_class (Section-Classroom)
prereq (Course-Course) - Recursive Relation
```

### (04) Recursive Relationships
- `prereq` connects `course` to `course`
- One course may require other course(s) as a pre-requisite
- One course may be pre-requisites to other course(s)

### (05) Relationship Set Attributes
- `grade` is an attribute of the relationship set `takes`

### (07) Weak Entity
- `section` is weak (double rectangle).
- Identified through the `course` and `sec_course` which is its strong entity set and relationship set respectively
- Full standalong primary key: (course_id, section_id, semester, year)

## (08) Non-binary Relationships
* ❌ All relationships are binary

### (09) Complex Attributes
- `day`, `start_time`, and `end_time` determine the `time_slot_id` attribute (composite)

### (03) Cardinality, (06) Participation, and (08) Degree

1. course_dept (1:N)
- The computer science department teaches various courses covering different topics
- The computer forensics course is only taught by the computer science department
- Department participation is partial (a department can exist without having to teach a course, and just doing research)
- Course participation is total (any course cannot exist without its department funding it).
- Degree: 2

2. inst_dept (1:N)
- The computer science department employes many instructors (professors)
- One instructor (ex. Brad Barnes) is a computer science instructor that can only work for the computer science department
- Department participation is partial (a department can opt to not hire instructors and just employ researchers)
- Instructor participation is total (an instructor cannot be employed by the institution, and must be employed by a specific department)
- Degree: 2

3. stud_dept (1:N)
- The computer science department teaches many computer science students
- A computer science student can only study under the computer science department
- Department participation is partial (a department can opt to be a research deparmtent and just hire facult and reserachers)
- Student participation is total (a student cannot be a part of the univeristy without being tied to a department)
- Degree: 2

4. advisor (1:N)
- Roberto Perdisci advises 40 of his cyber security students in his office hours
- One cyber security student can only be advised by Roberto Perdisci
- Instructor participation is partial (instructors can opt not to advise students)
- Student participation is partial (some students can opt out of going to office hours)
- Degree: 2

5. teaches (M:N)
- Roberto Perdesci teaches the morning and evening sections
- The evening section is taught by Roberto Perdesci and Kyu Hyung Lee
- Instructor participation is partial (an instructor can opt to focus on researcher instead of teaching a section)
- Section participation is total (the morning section cannot be taught without an instructor teaching it of course)
- Degree: 2

6. takes (M:N)
- One student can attend the 1:00 PM section and 3:30 PM section 
- The 3:30 PM section is attended by many different students
- Student participation is partial (A student drop out of taking classes in a specific semester due to personal circumstances)
- Section participation is partial (A section of a course can exist for faculty, instructors, or other employees rather than students)
- Degree: 2

7. sec_course (1:N)
- The computer forensics course is taught in 7 sections accross 5 days of the week at many different times
- The 3PM computer forensics section can only teach the computer forensics course material
- Course participation is partial (a course may have a syllabus, but there is no one to teach a section of it)
- Section participation is total (a section is simply an extension of a course - weak entity)
- Degree: 2

8. sec_time_slot (1:N)
- The 3:30 PM time slot can host many sections: 3:30 PM Computer Forensics, 3:30 PM Biology, etc.
- The 3:30 PM computer forensics section can only be taught at the 3:30 PM time slot
- Time slot participation is partial (a time slot can have no courses/sections taught in it, such as the 6:00 PM time slot)
- Section participation is total (all sections must be taught at a specific time)
- Degree: 2

9. sec_class (1:N)
- Cedar Building B 404D hosts various sections throughout the day
- 3:30 PM Computer Forenics can only be taught at the Cedar Building B 404D classroom
- Classroom participation is partial (not every clasroom is used for teaching. Some are for labs, equipments, IT, admin, etc.)
- Section participation is total (all sections must be taught in-person inside a classroom)
- Degree: 2

10.  prereq (M:N)
- The Computer Forensics course requires Operating Systems and Computer Architecture as pre-requisites
- The Operating Systems Course is a pre-requisite for Computer Forensics and Computer Networks
- Course participation is partial (not all courses have pre-requisites, such as into to programming)
- Degree: 1


## Exercise 2: Drawing a Retail Store ER Diagram

<p align="center">
  <img src="https://github.com/thespcrewroy/CSCI-4370/blob/main/Notes/assets/relsetsactivity2.png" alt="ER Diagram Specifications" />
</p>

## (01) Entities and Attributes

```
Employees(emp_id<pk>, name)
InventoryWorker(emp_id<pk, fk>, uniform_color)
InventoryCategories(category_name, description)
CustomerFacingWorker(emp_id<pk, fk>, product_specialty)
```

## (02) Relationship Sets

```
emp_supervision (Employee-Employee) - Recursive
inv_assignment (InventoryWorker-InventoryCategory)
```

## (04) Recursive Relationships
* `emp_supervision` connects `Employee` to `Employee`
* Each employee is supervised by one other employee
* A supervisor can supervise multiple employees
* Self-supervision is allowed

## (05) Relationship Set Attributes
* `start_date` and `end_date` are attributes of the relationship set `inv_assignment`

## (07) Weak Entity
* ❌ No weak entities in this model

## (08) Non-binary Relationships
* ❌ All relationships are binary

## (09) Complex Attributes
* ❌ No composite or multivalued attributes

## (10) Extensions (Specialization / Generalization)
* `Employee` IS A `InventoryWorker` and `CustomerFacingWorker` (Disjoint + Total Participation)

## (03) Cardinality, (06) Participation, and (08) Degree

### 1. emp_supervision (1:N)

* One supervisor can supervise many employees
* Each employee has exactly one supervisor
* Supervisee participation is total (every employee must have a supervisor)
* Supervisor participation is partial (every employee does not have to supervise)
* Degree: 1 (recursive)

### 2. inv_assignment (M:N)
* One inventory worker can be assigned multiple categories
* One category can have multiple workers working on it
* InventoryWorker participation is total (each inventory worker must have a category assignment) 
* InventoryCategory participation is partial (a category may not have an inventory worker assigned to it)
* Degree: 2

<p align="center">
  <img src="https://github.com/thespcrewroy/CSCI-4370/blob/main/Notes/assets/erdiagramdesign.png" alt="ER Diagram Design" />
</p>