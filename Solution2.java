import java.util.Scanner;

public class Solution2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask for size of n
        System.out.print("Enter n (the total number in the sequence): ");
        int n = sc.nextInt();

        int[] arr = new int[n - 1];
        System.out.println("Enter " + (n - 1) + " numbers from 1 to " + n + " (one will be missing):");

        for (int i = 0; i < n - 1; i++) {
            arr[i] = sc.nextInt();
        }

        // Find missing number using formula
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;
        for (int num : arr) {
            actualSum += num;
        }

        int missing = expectedSum - actualSum;
        System.out.println("Missing number is: " + missing);

        sc.close();
    }
}
