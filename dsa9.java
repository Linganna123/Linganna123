import java.util.Scanner;
public class dsa9 {
    public static void main(String[] args) {
        final int LIMIT = 5;
        int counter = 1;
        double number;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number: ");
        number = s.nextDouble();
        double smallest = number;
        while (counter <= LIMIT - 1) {
            System.out.print("Enter the number: ");
            number = s.nextDouble();
            if (smallest > number) {
                smallest = number;
            }
            counter++;
        }
        System.out.println("The smallest number is " + smallest);
    }
