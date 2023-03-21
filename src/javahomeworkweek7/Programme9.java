package javahomeworkweek7;
/**
 * Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
 * any other alphabet should be invalid entry
 * Using switch statement
 */

import java.util.Scanner;

public class Programme9 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);                  //Scanner ddeclaration
        System.out.println("Enter any alphabet from A to F");  //For user to read
        String letter = scn.next();                            //User input data type
   /*
   letter.toUpperCase(Locale.forLanguageTag(letter));
   System.out.println(letter);
   */
        scn.close();                            //Scanner closing
        switch (letter.toUpperCase()) {         //Switch statement converting in upper if input in lowercase
            case "A":
                System.out.println("Your city name is Ahmedabad");
                break;
            case "B":
                System.out.println("Your city name is Baroda");
                break;
            case "C":
                System.out.println("Your city name is Chotila");
                break;
            case "D":
                System.out.println("Your city name is Dwarka");
                break;
            case "E":
                System.out.println("Your city is Elora");
                break;
            case "F":
                System.out.println("Your city is Faridabad");
                break;
            default:             //For all other inputs
                System.out.println("Invalid input");
        }
    }
}
