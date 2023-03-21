package javahomeworkweek7;

import java.util.Scanner;

/**
 * Write a java program to input any number and find out if it’s odd or even
 */
public class Programme6 {
    public static void main(String[] args) { // main method
        Scanner s = new Scanner(System.in); // scanner declaration
        System.out.println("Enter a number : ");
        int number = s.nextInt();
        s.close();
        //if-else condition
        if (number % 2 == 0) {
            System.out.println(number + " is even ");
        } else {
            System.out.println(number + " is odd ");
        }
    }
}
