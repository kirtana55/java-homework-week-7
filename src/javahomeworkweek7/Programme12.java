package javahomeworkweek7;
/**
 * Write a program that tells us input value is number or an alphabet or symbol.
 */
import java.util.Scanner;
public class Programme12 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter any character : ");
        char ch = s.next().charAt(0);
        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            System.out.println(ch + " is A ALPHABET. ");
        } else if (ch >= '0' && ch <= '9') {
            System.out.println(ch + " is A DIGIT. ");
        } else {
            System.out.println(ch + " is a SPECIAL CHARACTER.");
        }
        s.close();
    }
}