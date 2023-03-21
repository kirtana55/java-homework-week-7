package javahomeworkweek7;
/**
 * WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Gross
 * salary
 *  HRA = basic salary 10%
 *  DA = Basic salary 8%
 *  TA = Basic salary 9%
 *  PF= Basic salary 20%
 *  Gross salary = basic salary + HRA + TA + DA –PF
 */

import java.util.Scanner;

public class Programme5 {

        public static void main(String[] args) {                        //main method
            Scanner s = new Scanner(System.in);
//            Scanner s = new Scanner(System.in);                         //scanner declaration
            System.out.println("Enter Employee Id : ");                 //input data type
            int id = s.nextInt();
            System.out.println("Enter Employee name : ");
            String name = s.next();
            System.out.println("Enter the Basic Salary : ");
            double bs = s.nextDouble();                                 //double data type- primitive numeric floating data type
            System.out.println("-----------------------------");
            System.out.println("|       Salary Slip         |");
            System.out.println("|___________________________|");
            System.out.println("|Employee Id     : " + id + "     |");
            System.out.println("|Employee Name   : " + name + "      |");
            System.out.println("|___________________________|");
            System.out.println("|Basic Salary    : " + bs + "  |");
            double hra = 10 / 100.0 * bs;
            System.out.println("|HRA 10%         : " + hra + "   |");
           // System.out.printf("%.2f", hra);
            double ta = 8 / 100.0 * bs;
            System.out.println("|TA 8%           : " + ta + "   |");
            double da = 9 / 100.0 * bs;
            System.out.println("|DA 9%           : " + da + "   |");
            double pf = 20 / 100.0 * bs;
            System.out.println("|PF -20%         : " + pf + "   |");
            System.out.println("|___________________________|");
            double gs = bs + hra + ta + da - pf;
            System.out.println("| Gross Salary   :" + gs + "   |");
            System.out.println("|===========================|");
            s.close();                                              //closing scanner
        }
    }