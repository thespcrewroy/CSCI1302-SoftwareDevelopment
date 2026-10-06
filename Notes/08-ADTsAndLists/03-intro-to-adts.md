# Introduction to ADTs

```java
void vendItem(double payment, int item) throws UnavailableItemException, InsufficientPaymentException
```

Users should be able to call the method `vendItem`, specifying a payment amount and item number. If valid input is supplied, then the vending machine should vend the item to the user. If the item is unavailable, then the method throws an UnavailableItemException which causes the vending machine's display to update accordingly.
Likewise, if an insufficient amount for the specified item is supplied, then the method throws an InsufficientPaymentException which also causes the vending machine's display to update accordingly.

In this analogy, we have a `VendingMachine` ADT with one operation called `vendItem`. Not only should any vending machine implementation have a `vendItem` operation, but it should operate, from the user's perspective, as described in the ADT description above.
