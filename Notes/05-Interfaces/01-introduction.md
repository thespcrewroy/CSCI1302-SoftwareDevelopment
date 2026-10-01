# Introduction

To demonstrate the benefits of interfaces, we will use a short `UGABookstore` class with methods allowing customers to purchase items in different ways (with Visa or PayPal). The code below shows how you might write the code to process payments with Visa and PayPal.

> [!NOTE]\
> <b>You can safely assume that the UGABookstore class has access to the Visa and Paypal classes.</b>

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

<p align="center">
  <img src="https://raw.githubusercontent.com/andreasbm/readme/master/assets/lines/solar.png" width="2000" />
</p>

We might say that all three services mentioned earlier (Visa, PayPal, and Affirm) must be able to process payments and print receipts. Those are the two critical actions that all payment processors must be able to perform. We might also say that each service charges a 1.5% transaction fee to process a payment. In this case, we could define the interface in Java as follows:


<p align="center">
  <img src="https://github.com/thespcrewroy/CSCI1302-SoftwareDevelopment/blob/main/Notes/assets/5-2.png" />
</p>

```java
public interface PaymentProcessor {

    /** The fee for processing a transaction. */
    public static final double FEE_PERCENTAGE = 1.5;

    /**
     * Processes a payment for the specified {@code amount}. The details
     * of how the payment is processed depends on the implementing class.
     *
     * @param amount the amount to process.
     * @return if payment is successful
     */
    public abstract boolean processPayment(double amount);

    /**
     * Prints a receipt to the specified {@code customer} for the
     * specified {@code amount}.
     *
     * @param customer the name of the customer who made the payment.
     * @param amount the amount of the payment.
     */
    public abstract void printReceipt(String customer, double amount);

} // PaymentProcessor
```
> An example interface with two abstract methods and a constant

```java
public class Visa implements PaymentProcessor {

    public boolean processPayment(double amount) {
        System.out.println("Processing Visa Card Payment of $" + amount);
        return true;
    } // processPayment

    public void printReceipt(String customer, double amount) {
        System.out.println(customer + " has completed a Visa purchase in the amount of $" + amount);
    } // printReceipt

} // Visa
```
>  Sample implementation for the `Visa` implementing class

```java
public class PayPal implements PaymentProcessor {

    public boolean processPayment(double amount) {
        System.out.println("Processing PayPal Payment of $" + amount);
        return true;
    } // processPayment

    public void printReceipt(String customer, double amount) {
        System.out.println(customer + " has completed a PayPal purchase in the amount of $" + amount);
    } // printReceipt

} // PayPal
```
> Sample implementation for the `PayPal` implementing class
