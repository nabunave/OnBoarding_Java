package day_0;
import java.util.Scanner;

public class bowling {
    private static int maximumCapacity = 500;
    private static int actualCapacity = maximumCapacity;
    private static int normalPrice = 1500;
    private static int vipPprice = 2000;
    private static double raisedMoney = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option;
        do {
            showMenu();
            option = scanner.nextInt();
            scanner.nextLine();
            switch (option) {
                case 1:
                    dataEntry(scanner);
                    break;
                case 2:
                    availableCapacity();
                    break;
                case 3:
                    raisedMoney();
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        } while (option != 0);
    }

    private static void showMenu() {
        System.out.println("1. Data Entry");
        System.out.println("2. Available Capacity");
        System.out.println("3. Raised Money");
        System.out.println("0. Exit");
        System.out.print("Enter your choice: ");
    }

    public static void dataEntry(Scanner scanner) {
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter your identification number: ");
        String dni = scanner.nextLine();

        System.out.print("Do you have a vip pass? (yes/no)");
        char vip = scanner.nextLine().charAt(0);

        System.out.print("Do you have discount? (yes/no)");
        char discount = scanner.nextLine().charAt(0);

        if (age < 21) {
            System.out.println("You are not allowed to play");
            return;
        }

        if (actualCapacity <= 0) {
            System.out.println("The capacity is full");
            return;
        }

        double price = normalPrice;
        if (vip == 'y' || vip == 'Y') {
            System.out.println("You have a vip pass, you can enter");
            price = 0.0;
        } else if (discount == 'y' || discount == 'Y') {
            System.out.println("You have discount, you pay the half price");
            price = price / 2;
        }


        if (price > 0) {
            System.out.println("Do you want to buy a normal or vip pass? (n/v)");
            char option = scanner.nextLine().charAt(0);
            if (option == 'v' || option == 'V') {
                price = vipPprice;
            }
        }

        actualCapacity--;
        raisedMoney += price;
        System.out.println("Welcome " + name + ", your ticket has been purchased");
    }

    public static void availableCapacity() {
        System.out.println("Actual capacity: " + actualCapacity);
    }

    public static void raisedMoney() {
        System.out.println("Raised money: " + raisedMoney);
    }
}
