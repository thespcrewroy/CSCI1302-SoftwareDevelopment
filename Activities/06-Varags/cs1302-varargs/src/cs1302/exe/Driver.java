package cs1302.exe;

import cs1302.model.Person;
import cs1302.util.Helper;

/**
 * Simple driver program to play with {@link cs1302.util.Helper}.
 */
public class Driver {

    public static void main(String[] args) {

        // 1.
        System.out.println();
        int smallest1 = Helper.min(5, 1, -1, 3);
        int smallest2 = Helper.min(4, 3, 1);
        int smallest3 = Helper.min(42, 1024);

        System.out.println("smallest1 is " + smallest1);
        System.out.println("smallest2 is " + smallest2);
        System.out.println("smallest3 is " + smallest3);

        // 2.
        System.out.println();
        Person susan = new Person("Susan", 120000.0);
        Person bob = new Person("Bob", 115300.547682);
        printSalaries(susan, bob);

    } // main

    /**
     * Print the salaries of the specified {@code people}.
     *
     * @param people The people whose salaries are to be printed.
     */
    public static void printSalaries(Person... people) {
        for (Person person : people) {
            printSalary(person);
        } // for
    } // printSalaries

    /**
     * Print the salary of the specified {@code person}.
     *
     * @param person The person whose salary is to be printed.
     */
    public static void printSalary(Person person) {
        String name = person.getName();
        double salary = person.getSalary();
        System.out.printf("The salary for %s is $%.2f.\n", name, salary);
    } // printSalary
} // Driver
