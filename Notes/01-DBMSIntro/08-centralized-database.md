# Centralized Database

<p align="center">
  <img src="https://github.com/thespcrewroy/CSCI-4370/blob/main/Notes/assets/centraldb.png" alt="Centralized Database Example" width="500"/>
</p>

1. Application program object code runs
2. DDL statements are interpreted
3. Compiler and linker links the DML queries to the app code
4. Query processor parses and optimizes the DDL and DML queries
5. Query evaluation engine executes the plan
   1. It calls the buffer manager to load pages
   2. It calls the file manager to locate records
6. Storage manager retreives data from the disk
   1. Data is validated through the auth and integrity manager
7. Trasaction manger ensures safety
8. Results are returned

This is called a *centralized shared-memory* database because it is one server, one memory space, all components share memroy, and multiple cores execute in parellel. The complete opposite to *distributed* systems, where data is moreso spread accross multiple machines.