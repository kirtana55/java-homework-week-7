package javahomeworkweek7;
/**
 * Write a Java program to sum values of an array
 */
public class Programme18 {
    public static void main(String[] args) {
        int[] numbers = new int[]{5, 15, 25, 35, 45, 55};
        int sum = 0;
        for (int i = 0; i < numbers.length; i++)
            sum = sum +numbers[i];
        System.out.println("Sum value of an array: " + sum);
    }
}
