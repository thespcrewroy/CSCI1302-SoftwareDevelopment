# Introduction

To demonstrate the benefits of interfaces, we will use a short `UGABookstore` class with methods allowing customers to purchase items in different ways (with Visa or PayPal). The code below shows how you might write the code to process payments with Visa and PayPal.

> [!NOTE]\
> <b>You can safely assume that the UGABookstore class has access to the Visa and Paypal classes.</b>

<p align="center">
  <img src="https://raw.githubusercontent.com/andreasbm/readme/master/assets/lines/solar.png" width="2000" />
</p>

<p align="center">
  <img src="https://github.com/thespcrewroy/CSCI1302-SoftwareDevelopment/blob/main/Notes/assets/5-1.png" />
</p>

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

Both `purchase` methods represent method overloading. The only difference between them is the first parameter.

<p align="center">
  <img src="https://raw.githubusercontent.com/andreasbm/readme/master/assets/lines/solar.png" width="2000" />
</p>

<details>
<summary><b>How would the code above change if we wanted to support payments from other payment processors without using the <code>PaymentProcessor</code> interface? For example, the other payment processor could be <code>Affirm</code>.</b></summary>

<br>

We would need to add another purchase method that takes in a reference to an `Affirm` object.
  
</details>

<details>
<summary><b>What if there were 20 additional payment processors?</b></summary>

<br>

We would need 20 additional purchase methods. Uh oh…

</details>


