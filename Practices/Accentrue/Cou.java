package Accentrue;

import java.util.Scanner;

 class Cou {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Maximum number of currency notes
        System.out.println("Enter the Currency: ");
        int N = scanner.nextInt();

        // Input: Amount to withdraw in multiples of 100
        int withdrawalAmount = scanner.nextInt();

        // Input: Available currency notes of ₹100, ₹200, ₹500, ₹1000
        int notes100 = scanner.nextInt();
        int notes200 = scanner.nextInt();
        int notes500 = scanner.nextInt();
        int notes1000 = scanner.nextInt();

        // Calculate the maximum number of currency notes possible
        int maxNotes = calculateMaxNotes(N, withdrawalAmount, notes100, notes200, notes500, notes1000);

        // Output the result
        System.out.println(maxNotes);

        scanner.close();
    }

    private static int calculateMaxNotes(int N, int withdrawalAmount, int notes100, int notes200, int notes500, int notes1000) {
        // Convert the withdrawal amount into the number of currency notes
        int note100Count = withdrawalAmount / 100;

        // Adjust note100Count to be within the limit N
        if (note100Count > N) {
            note100Count = N;
        }

        // Check if the ATM has enough notes for the withdrawal
        if (note100Count <= notes100 && (note100Count * 100) <= withdrawalAmount
                && ((withdrawalAmount - (note100Count * 100)) % 200 == 0)
                && ((withdrawalAmount - (note100Count * 100)) / 200) <= notes200
                && ((withdrawalAmount - (note100Count * 100)) / 200) <= N) {
            // Calculate the remaining amount and number of ₹200 notes
            int remainingAmount = withdrawalAmount - (note100Count * 100);
            int note200Count = remainingAmount / 200;

            // Adjust note200Count to be within the limit N
            if (note200Count > N) {
                note200Count = N;
            }

            // Check if the ATM has enough notes for the ₹200 denomination
            if (note200Count <= notes200 && (note200Count * 200) == remainingAmount) {
                // Calculate the maximum number of currency notes possible
                return note100Count + note200Count;
            }
        }

        // If the transaction is not possible, return 0
        return 0;
    }
}

