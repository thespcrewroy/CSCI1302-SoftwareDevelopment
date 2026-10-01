# Architectures

## Two-Tier Architecture

<p align="center">
  <img src="https://github.com/thespcrewroy/CSCI-4370/blob/main/Notes/assets/twotier1.png" alt="Two Tiered Arch"/ width="500">
</p>

* The client runs the user interface and application logic
* The server runs the DBMS
* The client connects directly to the database over the network
* Example
  * Desktop app connectinf directly to MySQL
  * SQL queries sent straight from client to database
* Pros
  * Eimple
  * Easy to implement
* Cons
  * Hard to scale
  * Business logic has to be duplicated accross clients
  * Direct database exposure is a security risk


## Three-Tier Architecture
<p align="center">
  <img src="https://github.com/thespcrewroy/CSCI-4370/blob/main/Notes/assets/threetier.png" alt="Instructor Table" width="500"/>
</p>

* The client serves the UI only (presentation layer)
* The application server handles business logic, validation, OAuth, and APIs
* The database server stores data and executes queries