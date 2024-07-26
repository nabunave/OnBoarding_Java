package day_0;

public class oddSum {
    public static int oddSumNumbers(int[] numbers) {
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
        int sum = oddSumNumbers(numbers);
        System.out.println("The sum of odd numbers in the array is: " + sum);
    }
}
