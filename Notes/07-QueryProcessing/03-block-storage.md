# Block Storage

<p align="center">
  <img src="https://github.com/thespcrewroy/CSCI-4370/blob/main/Notes/assets/blockstorage.png" alt="Block Storage Example" />
</p>

* Data is stored in fixed-size blocks (Block 0, Block 1, Block 2…)
* Data is read/written at a minimum block-by-block
* Blocks have a block number to identify them
* A block is typically 4 KiB (4096 bytes)
* The file system of the operating system interacts with the blocks


## Time Calculations

<p align="center">
  <img src="https://github.com/thespcrewroy/CSCI-4370/blob/main/Notes/assets/seektimes.png" alt="Block Storage Example" />
</p>

> Times are rough estimates

* **Seek Time (Random Access Time):** time to locate the data block
* **Transfer Time:** time to read/write the data once found
* Block storages have a larger seek time
* There is an  initial delay and then a relatively smaller block transfer time
* Sequential reads/writes are faster than random reads/writes

## Hard Disk Drive (HDD)
* Mechanical (moving parts: disk and head)
* Jumps around, resulting in slow random access time
* Like reading a book physically, having to turn pages to get to the desired page
* Slower seek time (~4 ms)
* Slower overall performance
* Sequential is much faster than random access

## Solid State Drive (SDD)
* No moving parts
* Like CTRL+F digital search
* Very fast seek (~0.1 ms)
* F*aster data transfer
* Much faster than HDD for random access
* Both sequential and random access is fast