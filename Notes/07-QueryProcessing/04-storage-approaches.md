# Storage Approaches

<p align="center">
  <img src="https://github.com/thespcrewroy/CSCI-4370/blob/main/Notes/assets/storageapproaches.png" alt="Storage Approaches" />
</p>

> There are two main table storage approaches: row store and column store.

## Row Store
- Row store is optimized for OLTP (Online Transaction Processing).
- Row store use cases include order processing and banking transactions.
- In row store, each block stores complete rows.
  
## Column Store
- Column store is optimized for OLAP (Online Analytical Processing).
- Column store use cases include sales trend analysis and BI dashboards.
- In column store, each block stores values from a single column.