package day_0;
import java.util.Scanner;

public class compareString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();
        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine();
        if (str1.compareToIgnoreCase(str2) > 0) {
            System.out.println(str1 + " is greater than " + str2);
        } else if (str1.compareToIgnoreCase(str2) < 0) {
            System.out.println(str1 + " is less than " + str2);
        } else {
            System.out.println(str1 + " is equal to " + str2);
        }
    }
}

