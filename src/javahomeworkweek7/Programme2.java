package javahomeworkweek7;

import java.util.Scanner;

/**
 * Write a java program to input any year like (ex.2007) and find out if it is leap year or
 * not?
 */
public class Programme2 {
    public static void main(String[] args) {     //main method
        Scanner s = new Scanner(System.in);     //Scanner declaration
        System.out.println("Enter any year");
        int year = s.nextInt();
        s.close();     //Scanner close

        if (year % 4 == 0) {      // if-else condition
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
}
