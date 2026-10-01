# Introduction

To demonstrate the benefits of interfaces, we will use a short `UGABookstore` class with methods allowing customers to purchase items in different ways (with Visa or PayPal). The code below shows how you might write the code to process payments with Visa and PayPal.

> [!NOTE]\
> <b>You can safely assume that the UGABookstore class has access to the Visa and Paypal classes.</b>

```java
public class UGABookstore {

   public boolean purchase(Visa visa, String customerName, double amount) {
       visa.processPayment(amount);
       visa.printReceipt(customerName, amount);
   } // purchase

   public boolean purchase(PayPal paypal, String customerName, double amount) {
       paypal.processPayment(amount);
       paypal.printReceipt(customerName, amount);
   } // purchase

   public static void main(String[] args) {
      // This method is the main entry point of the application and
      // contains calls to the purchase method. Specific code is omitted.

   } // main
} // UGABookstore
```