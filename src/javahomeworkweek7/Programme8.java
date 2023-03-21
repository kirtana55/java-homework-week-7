package javahomeworkweek7;

import java.util.Scanner;

/**
 * Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
 * any other alphabet should be invalid entry
 */
public class Programme8 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter any alphabet from \"A\" to \"F\"");
        String city = scn.next();
        scn.close();

        if (city.equals("A")) {
            System.out.println("City is Ahmedabad");
        } else if (city.equals("B")) {
            System.out.println("City is Baroda");
        } else if (city.equals("C")) {
            System.out.println("City is Chotila");
        } else if (city.equals("D")) {
            System.out.println("City is Dwarka");
        } else if (city.equals("E")) {
            System.out.println("City is Elora");
        } else if (city.equals("F")) {
            System.out.println("City is Faridabad");
        } else {
            System.out.println("Invalid input");
        }
    }
}

