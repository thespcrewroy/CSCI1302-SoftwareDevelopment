# Relational Model

## Core Idea
<p align="center">
  <img src="https://github.com/thespcrewroy/CSCI-4370/blob/main/Notes/assets/relationalmodelexample.png" alt="Relation Example" width="800" />
</p>

- A relational model stores data in **tables** (relations).
- Each table has:
	- **Columns** (attributes)
	- **Rows** (tuples)
- The model includes both tables and their **constraints** that enforce data quality and consistency.
- **Schema**: The table definition including attribute names and their data types.

## Constraints in the Relational Model
- **Domain constraints**:
	- Each attribute value must come from a valid domain (data type and allowed values).
	- Example: `price` must be numeric and non-negative.
- **Key constraints**:
	- A key uniquely identifies each tuple.
	- No two rows can have the same key value.
- **Other relational constraints**:
	- Rules that preserve integrity across one or more tables.
	- Example ideas: uniqueness rules, required fields, and foreign key constraints.

## Activity Notes: Product Data Example
Our online store offers a diverse range of products including the **FitTrack Smart Fitness Watch**, an advanced water-resistant watch with heart rate monitoring and GPS, priced at **$199.99** with a stock of **150 units**.

We also feature the **EcoKitchen Bamboo Cooking Utensil Set**, a collection of six eco-friendly bamboo cooking tools, available for **$24.99** and currently holding a stock of **200 sets**.

For music enthusiasts, we have the **SoundWave Portable Bluetooth Speaker**, offering high-quality sound in a compact, waterproof design for **$89.99**, with **75 units** in stock in *black, blue, and red*.

Pet owners can purchase the **HealthyPaws Organic Dog Food**, a grain-free, all-natural dog food at **$49.99 per 20lb bag**, with **100 bags** in stock.

Lastly, our **Lumina LED Desk Lamp**, perfect for office work with adjustable brightness, is priced at **$35.99** and we have **120 units** available in *white and black*.

### Products Mentioned
| Product ID | Product Name                         | Description                                                   | Price (USD) | Stock | Variants / Details        |
|------------|--------------------------------------|---------------------------------------------------------------|-------------|-------|---------------------------|
| P001       | FitTrack Smart Fitness Watch         | Water-resistant smartwatch with heart rate monitoring and GPS | 199.99      | 150   | —                         |
| P002       | EcoKitchen Bamboo Cooking Utensil Set| Set of 6 eco-friendly bamboo cooking tools                    | 24.99       | 200   | —                         |
| P003       | SoundWave Portable Bluetooth Speaker | Compact, waterproof speaker with high-quality sound           | 89.99       | 75    | Colors: Black, Blue, Red  |
| P004       | HealthyPaws Organic Dog Food         | Grain-free, all-natural dog food (20lb bag)                   | 49.99       | 100   | —                         |
| P005       | Lumina LED Desk Lamp                 | Adjustable brightness desk lamp, ideal for office work        | 35.99       | 120   | Colors: White, Black      |

### Design Issue Identified
- `colors` is a **repeating multi-valued attribute** for some products.
- In a relational design, repeating values should be moved into a separate table.

### Better Relational Design

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

### Why This Decomposition Helps
- Removes repeating groups.
- Supports any number of colors per product.
- Improves consistency and query flexibility.
- Better aligns with normalization principles.
- PK and FK usage implies a product can appear multiple times, but the same product cannot have the same color twice.

## Quick Takeaway
- Relational databases are built from tables and constraints.
- Good schema design avoids multi-valued attributes inside a single row.
- When an attribute has multiple values in a single tuple, model it with a separate relation.
