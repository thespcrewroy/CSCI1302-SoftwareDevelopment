# ASCII Representation for Relational Algebra

- Use the operation name in upper case in place of the Greek letter of each operator or non-ASCII symbol.
- We will write the content that we write in subscript within square brackets.
- We will use corresponding Java operators in predicates.

---

## SELECT

Physics <- &sigma; dept_name="Physics" (instructor)  
Music <- &sigma; dept_name="Music" (instructor)  

```text
Physics = SELECT[dept_name=="Physics"](instructor)
Music   = SELECT[dept_name=="Music"](instructor)
```

---

## UNION

Physics &cup; Music
```
Physics UNION Music
```

---

## PROJECT

&#928; <sub>ID, name, salary</sub> (instructor)

```text
PROJECT[ID, name, salary](instructor)
```

---

## THETA JOIN

Instructor &bowtie; <sub>Instructor.dept_name = Department.dept_name</sub> Department

```text
Instructor JOIN[Instructor.dept_name==Department.dept_name] Department
```

---

## DIFFERENCE

For set difference use the `-` character.  

---

## CARTESIAN PRODUCT

For cartesian product use `X` character.

---

## NATURAL JOIN

JOIN without a predicate in square brackets is considered as natural join.
