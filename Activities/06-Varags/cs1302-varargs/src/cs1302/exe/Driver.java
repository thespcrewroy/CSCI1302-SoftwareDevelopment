package cs1302.exe;

import cs1302.util.Helper;

/**
 * Simple driver program to play with {@link cs1302.util.Helper}.
 */
public class Driver {

    public static void main(String[] args) {

        int smallest1 = Helper.min(5, 1, -1, 3);
        int smallest2 = Helper.min(4, 3, 1);
        int smallest3 = Helper.min(42, 1024);

        System.out.println("smallest1 is " + smallest1);
        System.out.println("smallest2 is " + smallest2);
        System.out.println("smallest3 is " + smallest3);

    } // main

} // Driver
