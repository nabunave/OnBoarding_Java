package day_0;
import java.util.Scanner;

public class higherNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = scanner.nextInt();
        if (num1 > num2) {
            System.out.println(num1 + " is the highest number.");
        } else {
            System.out.println(num2 + " is the highest number.");
        }
    }

    public class evenOrOdd {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a number: ");
            int num = scanner.nextInt();
            if (num % 2 == 0) {
                System.out.println(num + " is an even number.");
            } else {
                System.out.println(num + " is an odd number.");
            }
        }
    }   
}
