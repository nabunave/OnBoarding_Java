package day_0;
import java.util.Scanner;

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

