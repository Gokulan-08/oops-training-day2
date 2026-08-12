import java.util.Scanner;

class PlusOne {

    public static int[] plusOne(int[] digits) {

        for (int i = digits.length - 1; i >= 0; i--) {

            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }

            digits[i] = 0;
        }

        int[] newDigits = new int[digits.length + 1];
        newDigits[0] = 1;

        return newDigits;
    }

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter number of digits: ");
            int n = sc.nextInt();

            int[] digits = new int[n];

            System.out.println("Enter the digits:");

            for (int i = 0; i < n; i++) {
                digits[i] = sc.nextInt();
            }

            int[] result = plusOne(digits);

            System.out.print("Result: ");

            for (int digit : result) {
                System.out.print(digit + " ");
            }
        }
    }
}