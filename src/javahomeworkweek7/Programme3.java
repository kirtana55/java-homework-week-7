/**
 * Write a java program to input student Name, roll No, and three subjects Math, Science and
 * English marks (marks is between 0 to 100 and if it is out of range print error message “Invalid
 * Input, Marks should between 0 to 100”) and find out total, percentage and result.
 * If he is pass or fail on basis of percentage (pass>=35) and also give them grade if %> = 80 A+,
 * %> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format
 */

package javahomeworkweek7;

import java.util.Scanner;
public class Programme3 {
    public static void main(String[] args) {  //main method
        Scanner s = new Scanner(System.in); // Scanner declaration
        System.out.println("Enter Name        :             ");
        String n = s.nextLine();
        System.out.println("Enter Roll No     :");
        String r = s.next();
        System.out.println("Enter Maths Marks:");
        int m = s.nextInt();
        if (m > 100) {
            System.out.println("Invalid Input, Marks should between 0 to 100");
            System.exit(0);
        }
        System.out.println("Enter Science Marks:");
        int sc = s.nextInt();
        if (sc > 100) {
            System.out.println("Invalid Input, Marks should between 0 to 100");
            System.exit(0);
        }
        System.out.println("Enter English Marks:");
        int e = s.nextInt();
        if (e > 100) {
            System.out.println("Invalid Input, Marks should between 0 to 100");
            System.exit(0);
        }
        s.close();     //Scanner close

        System.out.println(" ____________________________________");
        System.out.println("|                                    |");
        System.out.println("|             Mark Sheet             |");
        System.out.println("|____________________________________|");
        System.out.println("|    Name          :" + n + "             |");
        System.out.println("|   Roll No        :" + r + "               |");
        System.out.println("|____________________________________|");
        System.out.println("|   Subjects       :         Marks   |");
        System.out.println("|____________________________________|");
        System.out.println("|    Maths         :" + m + "               |");
        System.out.println("|    Science       :" + sc + "               |");
        System.out.println("|    English       :" + e + "               |");
        System.out.println("|____________________________________|");
        int total = (m + sc + e);
        System.out.println("|    Total         :      " + total + "        |");
        System.out.println("|____________________________________|");
        float p = total * 100 / 300;
        System.out.println("|    Percentage    :      " + p + "       |");
        String ru = "";
        if (p >= 35)
            ru = "pass";
        else if (p <= 35)
            ru = "Fail";
        System.out.println("|    Result        :      " + ru + "       |");
        String g = "";
        if (p >= 80)    //if-else condition
            g = "A+";
        else if (p < 80 && p >= 60)
            g = "A";
        else if (p < 60 && p >= 50)
            g = "B";
        else if (p < 50 && p >= 35)
            g = "C";
        else if (p <= 35)
            g = "D";
        System.out.println("|    Grade         :      " + g + "         |");
        System.out.println("|____________________________________|");

    }
}