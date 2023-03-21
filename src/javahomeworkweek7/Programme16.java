package javahomeworkweek7;

import java.util.Scanner;

/**
 * Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or "Zero"
 */
public class Programme16 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = s.nextInt();
        if (num > 0) {
            System.out.println(num + " is POSITIVE NUMBER. ");
        } else if (num < 0) {
            System.out.println(num + " is NEGATIVE NUMBER. ");
        } else {
            System.out.println(num + " is a ZERO. ");
        }
        s.close();
    }
}