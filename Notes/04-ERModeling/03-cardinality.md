# Cardinality


## One to One

<p align="center">
  <img src="https://github.com/thespcrewroy/CSCI-4370/blob/main/Notes/assets/onetooneexample.png" alt="One to One Example" width="800" />
</p>

An arrow head means 'at most one' of this entity for one entity from the other side

## Activity; Examples
> [!IMPORTANT]\
> Talk with your neighbor and give examples of your ideas of one to one relationships. Recognize the entity sets involved and their attributes. Draw the ER diagram with cardinality constraints.

Q) **A citizen has a passport**

```
+------------------+        HAS        +-------------------+
|     CITIZEN      |-------------------|     PASSPORT      |
|------------------|     (1 : 1)       |-------------------|
| citizen_id<pk>   |                   | passport_no<pk>   |
| name             |                   | issue_date        |
| dob              |                   | expiry_date       |
| address          |                   |                   |
+------------------+                   +-------------------+
```


Q) **Person has a driver's license**

```
+------------------+        HAS        +----------------------+
|      PERSON      |-------------------|   DRIVER_LICENSE     |
|------------------|     (1 : 1)       |----------------------|
| person_id<pk>    |                   | license_no<pk>       |
| name             |                   | issue_date           |
| dob              |                   | expiry_date          |
+------------------+                   +----------------------+
```

Q) **A customer receipt is generated per order**

```
+------------------+     GENERATES     +------------------+
|      ORDER       |-------------------|     RECEIPT      |
|------------------|     (1 : 1)       |------------------|
| order_id<pk>     |                   | receipt_id<pk>   |
| date             |                   | date             |
| amount           |                   | payment_method   |
+------------------+                   +------------------+
```

> [!IMPORTANT]\
> Are these relationships absolutely one-to-one in all possible contexts?

No. The ideal case is one-to-one, yet the reality depends on the context.

* A citizen has a passport (could become one-to-many)
    * A U.S. citizen can have a dual-citizenship with Italy, and therefore an Italian passport too
    * Italian passport no. 534,643 must only be tied to citizen no. 5,391,345
* A customer receipt is generated per order (could become many-to-many)
    * One order generates multiple receipts (split payments)
    * One receipt tackles multiple orders (batch billing)


## One to Many

<p align="center">
  <img src="https://github.com/thespcrewroy/CSCI-4370/blob/main/Notes/assets/onetomanyexample.png" alt="One to ManyExample" width="800" />
</p>

* An arrow head means 'at most one' of this entity for one entity from the other side
* In 1:N relationships, the foreign key goes on the “many” side:
    * Product.category_id → Category.category_id (FK)
    * Employee.dept_id → Department.dept_id (FK)
    * Tweet.user_id → User.user_id (FK)

## Activity: Examples
> [!IMPORTANT]\
> Talk with your neighbor and give examples of your ideas of one to many relationships. Recognize the entity sets involved and their attributes. Draw the ER diagram with cardinality constraints.

Q) **Products are associated with a category. Assume, each product has a unique category.**

```
+------------------+      BELONGS_TO      +------------------+
|     CATEGORY     |----------------------|     PRODUCT      |
|------------------|      (1 : N)         |------------------|
| category_id<pk>  |                      | product_id<pk>   |
| name             |                      | name             |
+------------------+                      | price            |
                                          +------------------+
```


Q) **Employees work at departments. Assume an employee only works for a single department.**

```
+------------------+      WORKS_IN       +------------------+
|    DEPARTMENT    |---------------------|     EMPLOYEE     |
|------------------|      (1 : N)        |------------------|
| dept_id<pk>      |                     | emp_id<pk>       |
| dept_name        |                     | name             |
+------------------+                     | salary           |
                                         +------------------+
```                                        


Q) **A twitter user posts tweets.**

```
+------------------+        POSTS        +------------------+
|       USER       |---------------------|      TWEET       |
|------------------|      (1 : N)        |------------------|
| user_id<pk>>     |                     | tweet_id<pk>     |
| username         |                     | content          |
+------------------+                     | timestamp        |
                                         +------------------+
```

## Many to One

<p align="center">
  <img src="https://github.com/thespcrewroy/CSCI-4370/blob/main/Notes/assets/manytooneexample.png" alt="Many to One Example" width="800" />
</p>

* An arrow head means 'at most one' of this entity for one entity from the other side
* In N:1 relationships, the foreign key goes on the “many” side:
    * Product.category_id → Category.category_id (FK)
    * Employee.dept_id → Department.dept_id (FK)
    * Tweet.user_id → User.user_id (FK)

## Many to Many

<p align="center">
  <img src="https://github.com/thespcrewroy/CSCI-4370/blob/main/Notes/assets/manytomanyexample.png" alt="Many to Many Example" width="800" />
</p>

* Note that there are no arrow heads

## Activity: Examples

> [!IMPORTANT]\
> Talk with your neighbor and give examples of your ideas of many to many relationships. Recognize the entity sets involved and their attributes. Draw the ER diagram with cardinality constraints.

Q) **Customer buys products**

```
+------------------+        BUYS        +------------------+
|     CUSTOMER     |--------------------|     PRODUCT      |
|------------------|      (M : N)       |------------------|
| customer_id<pk>  |                    | product_id<pk>   |
| name             |                    | name             |
+------------------+                    | price            |
                                        +------------------+
```
Q) **Hashtags and posts**

```
+------------------+      TAGGED_IN     +------------------+
|     HASHTAG      |--------------------|       POST       |
|------------------|      (M : N)       |------------------|
| tag_id<pk>       |                    | post_id<pk>      |
| tag_name         |                    | content          |
+------------------+                    +------------------+
```

Q) **Employees and projects**

```
+------------------+      WORKS_ON      +------------------+
|     EMPLOYEE     |--------------------|     PROJECT      |
|------------------|      (M : N)       |------------------|
| empl_id<pk>      |                    | project_id<pk>   |
| name             |                    | project_name     |
+------------------+                    +------------------+
```

Q) **Actors and movies**

```
+------------------+      ACTS_IN       +------------------+
|      ACTOR       |--------------------|      MOVIE       |
|------------------|      (M : N)       |------------------|
| actor_id<pk>     |                    | movie_id<pk>     |
| name             |                    | title            |
+------------------+                    +------------------+
```

Q) **Books and authors (in a different more realistic context)**

```
+------------------+       WRITES       +------------------+
|      AUTHOR      |--------------------|       BOOK       |
|------------------|      (M : N)       |------------------|
| author_id<pk>    |                    | isbn<pk>         |
| name             |                    | title            |
+------------------+                    +------------------+
```
