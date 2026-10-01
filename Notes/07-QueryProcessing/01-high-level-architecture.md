# High Level Architecture

<p align="center">
  <img src="https://github.com/thespcrewroy/CSCI-4370/blob/main/Notes/assets/queryprocessinghigh.png" alt="Query Processing Example" />
</p>

> Query → Parse → Optimize → Execute → Get Result

## Query
User writes a SQL query (e.g., SELECT * FROM students).

## Parser and Translator
* Checks syntax to make sure if the query is written correctly.
* Converts SQL into an internal format (ex. relational algebra).

## Relational Algebra Expression
* Logical representation of the query.
* Dilutes the query into its step by step operations.

## Optimizer
* Finds the most efficient way to run the query.
* Uses statistics about data (table size, index offsets, etc.).

## Execution Plan
Final step-by-step instructions for executing the query.

## Evaluation Engine
* Actually runs the execution plan.
* Reads/Writes data to the database.

## Data
Data is stored in database tables.

## Query Output
Final result of the operation returned to the user.