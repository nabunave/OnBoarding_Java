package day_0;

public class oddAndPrime {

    public static int processNumber (int[] numbers) {
        int sumPrimes = 0;

        System.out.println("Even numbers:");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                System.out.println(numbers[i]);
            }
        }
        System.out.println("Odd numbers:");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                System.out.println(numbers[i]);
                sumPrimes += numbers[i];
            }
        }
        return sumPrimes;
    }

    public static int sumPrimes(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                sum += numbers[i];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = processNumber(numbers);
        int sumPrimes = sumPrimes(numbers);
        System.out.println("Sum of prime numbers: " + sumPrimes);
    }
}



