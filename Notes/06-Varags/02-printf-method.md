# The Printf Method

```java
public PrintStream printf(String format, Object... args)
```

In Java, `System.out` refers to an object that implements `PrintStream` methods, including `print(Object)`, `println(Object)`, and `printf(String, Object…)`. The `printf` method is particularly interesting because it includes a varargs parameter in its parameter list. `printf` lets us print a formatted string to output using the format string and other arguments that are supplied when printf is called.

```java
public static void printSalary(Person person) {
    String name = person.getName();
    double salary = person.getSalary();
    System.out.printf("The salary for %s is $%.2f.\n", name, salary);
} // printSalary
```
Each `%` character in a format string denotes a format specifier for an argument in the array referred to by args. In the example above, `%s` is the format specifier for name, and `%.2f` is the format specifier for salary. Since the `args` parameter is a varargs parameter, the corresponding arguments do need to be manually placed into an array before calling printf. Although `Object... args` technically denotes that zero or more Object references can be supplied, printf considers it an error when `args.length` does not equal the number of format specifiers in the `String format` part.

| Specifier |                                       Description                                             |
| --------- | --------------------------------------------------------------------------------------------- |
|    %s     | arg is formatted using arg.toString().                                                        |
|    %d     | arg is a int and formatted as an integer.                                                     |
|    %f     | arg is a float or double and formatted to include one or more places after the decimal point. |
|    %.2f   | arg is a float or double and formatted as include exactly two places after the decimal point. |
