# Relational Database

## Core Concept

- A **relational database** is made up of **multiple related tables**.
- Tables are connected through **shared attributes**.
- These shared attributes are usually implemented with:
	- A **primary key (PK)** in one table
	- A **foreign key (FK)** in another table

## Example Relationship
<p align="center">
  <img src="https://github.com/thespcrewroy/CSCI-4370/blob/main/Notes/assets/relationaldatabaseexample.png" alt="Database Example" width="800" />
</p>

- Shared attribute: `dept_name`
- Typical design:
	- `department.dept_name`: Primary Key
	- `instructor.dept_name`: Foreign Key referencing `department.dept_name`
- This relationship links each instructor to a valid department.

## Why Table Relationships Matter
- Reduce duplicate data
- Keep data consistent across tables
- Support powerful queries using joins
- Preserve integrity through key constraints

## Activity: Common Database Operations
```
Product(ProductID<pk>, ProductName, Price, Stock)
ProductDetails(ProductID<pk, fk>, Description)
ProductColors(ProductID<pk, fk>, Color<pk>)
```

#### Table 1: Product
| ProductID | ProductName                          | Price  | Stock |
|-----------|--------------------------------------|--------|-------|
| P001      | FitTrack Smart Fitness Watch         | 199.99 | 150   |
| P002      | EcoKitchen Bamboo Cooking Utensil Set| 24.99  | 200   |
| P003      | SoundWave Portable Bluetooth Speaker | 89.99  | 75    |
| P004      | HealthyPaws Organic Dog Food         | 49.99  | 100   |
| P005      | Lumina LED Desk Lamp                 | 35.99  | 120   |

#### Table 2: ProductDetails (Optional)
| ProductID | Description                                                                |
|-----------|----------------------------------------------------------------------------|
| P001      | Water-resistant watch with heart rate monitoring and GPS                   |
| P002      | Set of six eco-friendly bamboo cooking tools                               |
| P003      | Compact waterproof speaker with high-quality sound                         |
| P004      | Grain-free, all-natural dog food (20lb bag)                                |
| P005      | Adjustable brightness desk lamp for office work                            |

#### Table 3: ProductColors
| ProductID |    Color     |
|-----------|--------------|
| P003      | Black        |
| P003      | Blue         |
| P003      | Red          |
| P005      | White        |
| P005      | Black        |

> [!IMPORTANT]\
> **Talk to your neighbor:** What do you expect a **Relational Database Management System (RDBMS)** will allow a user to do with the data you modeled using the relational model?

- Insert new products
- Query products (example: show all products under $50)
- Update prices or stock
- Delete discontinued products
- Filter by attributes (example: show all black items)
- Join tables (example: products + colors)
- Enforce constraints (example: no negative stock, unique `product_id`, etc.)
- Maintain overall data integrity

## Quick Takeaway
- A relational database is not one big table, it is a set of connected tables.
- Primary and foreign keys define those connections.
- CRUD operations, constraints, and joins are the core of practical database use.
