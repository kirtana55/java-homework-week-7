package javahomeworkweek7;

import java.util.Scanner;

/**
 * Write a java program that tells us that Input number is odd or even?
 * HINT: use ternary operator (? :)
 */
public class Programme1 {
    public static void main(String[] args) {     // main method
        Scanner s = new Scanner(System.in);   // scanner declaration
        System.out.println("Input number");
        int number = s.nextInt();
        s.close();

        //ternary operator to check number
        String result = number % 2 == 0 ? "This number is even" : "This number odd";
        System.out.println(result);

    }
}
