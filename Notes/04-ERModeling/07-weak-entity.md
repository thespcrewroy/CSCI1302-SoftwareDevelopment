# Weak Entity

## What Is a Weak Entity?

A weak entity is an entity type that:
- Cannot be uniquely identified by its own attributes alone
- Depends on a strong entity for identification

In short, a weak entity cannot meaningfully exist by itself.

## Strong vs Weak Entity

| Type | Description |
|---|---|
| Strong entity | Has its own primary key |
| Weak entity | Needs another entity key plus its own partial key |

## Common Examples

| Strong Entity | Weak Entity | Why Weak? |
|---|---|---|
| Building | Room | Room number is unique only within a building |
| Classroom | Chair | Chair id is local to a classroom |
| Course | Section | Section depends on a specific course |
| Book | Copy | A copy exists only for a book |

## Core Concepts of Weak Entities

### 1. Identifying Relationship
- Connects the weak entity to its strong entity owner
- Drawn as a double diamond in ER diagrams

### 2. Partial Key (Discriminator)
- Attribute(s) of the weak entity that are not globally unique
- Become unique only when combined with the strong entity primary key

### 3. Full Key (Combined Key)
- Is the full weak entity key
- Strong entity primary key + weak entity partial key

## Main Example: Course and Section

<p align="center">
  <img src="https://github.com/thespcrewroy/CSCI-4370/blob/main/Notes/assets/weakentityexample.png" alt="Weak Entity Example" width="800" />
</p>


Strong entity: `Course`
- `course_id` (PK), `title`, `credits`

Weak entity: `Section`
- `sec_id` (partial key), `semester` (partial key), `year` (partial key)

Identifying relationship: `sec_course`
- `course_id` (PK, FK), `sec_id` (PK, FK), `semester` (PK, FK), `year` (PK, FK)

Unique identification:
- `sec_id` alone is ambiguous
- `(course_id, sec_id, semester, year)` is unique

## ER Notation Clues

- Weak entity: double rectangle
- Identifying relationship: double diamond
- Partial key attributes: dashed underline

## Participation Rule

- Weak entities have total participation in their identifying relationship.
- Every weak entity instance must be related to a strong entity instance
- A weak entity cannot exist without a corresponding strong entity

## Key Properties

| Property | Weak Entity |
|---|---|
| Has standalone primary key | No |
| Depends on strong entity | Yes |
| Participation in identifying relationship | Total |
| Identification method | Combined key |
