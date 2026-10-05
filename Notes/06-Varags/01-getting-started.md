# Getting Started with Varags

```java
public static int min(int[] numbers)
```
> Helper.java

```java
int smallest1 = Helper.min(new int[] { 5, 1, -1, 3 });
int smallest2 = Helper.min(new int[] { 4, 3, 1 });
int smallest3 = Helper.min(new int[] { 42, 1024 });
```
> Driver.java

The code snippet above is a little tedious because it requires the creation and use of an array. The following will not work as-is, but it would be nice if we would could just supply the numbers as individual arguments instead of using an array directly.

<br>

```java
public static int min(int... numbers)
```
> Helper.java

```java
int smallest1 = Helper.min(5, 1, -1, 3);
int smallest2 = Helper.min(4, 3, 1);
int smallest3 = Helper.min(42, 1024);
```
> Driver.java

From a caller's perspective, the change from `int[]` to `int...` indicates that zero or more int arguments can be supplied when calling the method. Inside the method, there is no change. The parameter is still treated as if it were an array variable to an `int[]`.

<br>

<p align="center">
  <img src="https://raw.githubusercontent.com/andreasbm/readme/master/assets/lines/solar.png" width="2000" />
</p>

Rules
* A method can only have up to one varargs parameter
* A method that has a varags parameter must be the last parameter declared in its parameter list

```java
public static int sum(int num, int... nums) {
    ...
} // sum
```
> This method compiles and accepts one or more int arguments.

<br>

```java
public static int sum(int... nums, int nums) {
    ...
} // sum
```
> This will not compile. The varargs parameter must be last.

<br>

```java
public static int sum(int... nums1, int... nums2) {
    ...
} // sum
```
> This will not compile. At most one varargs parameter is allowed.

<br>

These rules enable us to require a minimum number of arguments when the method is called without writing any code to explicitly check the array length. Of course, that can still be done. The rules also prevent us from writing potentially ambiguous code involving varargs.