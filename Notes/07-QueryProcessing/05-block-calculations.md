# Block Calculations


## Blocking Factor

- Assume each row in a table has fixed size.
- Assume there is no storage overhead.
- Assume one row can fit inside a block.


<p align="center">
  <img src="https://github.com/thespcrewroy/CSCI-4370/blob/main/Notes/assets/bfactorformula.png" alt="Blocking Factor Formula" />
</p>

- **F<sub>r</sub>:** the blocking factor of relation (r).
- **B:** is the block size.
- **R:** is the row (record) size.

## Number of Blocks

<p align="center">
  <img src="https://github.com/thespcrewroy/CSCI-4370/blob/main/Notes/assets/nobformula.png" alt="Number of Blocks Formula" />
</p>

- **N<sub>b</sub>:** the number of blocks used by the relation (r).
- **N<sub>r</sub>:** the number of rows in the relation (r).
- **F<sub>r</sub>:** the blocking factor of relation (r).