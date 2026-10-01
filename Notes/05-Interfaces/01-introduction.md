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
We would need to add another purchase method that takes in a reference to an <code>Affirm</code> object.
  
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

<p align="center">
  <img src="https://raw.githubusercontent.com/andreasbm/readme/master/assets/lines/solar.png" width="2000" />
</p>

Take a moment to revisit the code from earlier. Think about how the PaymentProcessor interface might help us improve this code.

<p align="center">
  <img src="https://github.com/thespcrewroy/CSCI1302-SoftwareDevelopment/blob/main/Notes/assets/5-3.png" />
</p>

```java
public class UGABookstore {

    public static boolean purchase(PaymentProcessor payment, String customerName, double amount) {
        payment.processPayment(amount);
        payment.printReceipt(customerName, amount);
        return true;
    } // purchase

    public static void main(String[] args) {
        PaymentProcessor p1 = new Visa();
        purchase(p1, "Alice", 120.00);

        PaymentProcessor p2 = new PayPal();
        purchase(p2, "Bob", 45.50);
    } // main

} // UGABookstore
```

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

<details>
<summary><b>How many classes/interfaces does <code>UGABookstore</code> depend on in each UML diagram?</b></summary>
<br>
The "Before" UML diagram shows that UGABookstore depends on both <code>Visa</code> and <code>PayPal</code>. The "After" UML diagram shows that it only depends on <code>PaymentProcessor</code>.
  
</details>

<details>
<summary><b>Which diagram has fewer <code>dependsOn</code> annotations?</b></summary>

<br>

"After" has fewer.

</details>

<details>
<summary><b>Do you think it's good or bad for our <code>UGABookstore</code> class to have to have fewer dependencies?</b></summary>

<br>

It is better to have fewer. If we add more payment processors that implement the interface, the <code>UGABookstore</code> class will not have to change because it won't depend on those new classes. Thanks to the interface, <code>UGABookstore</code> only depends on the interface for processing payments.

</details>
