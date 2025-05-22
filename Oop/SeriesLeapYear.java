
//practice problem 2.0

import java.util.Scanner;

public class SeriesLeapYear {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = scan.nextInt();

        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println("Leap Year");
        } else {
            System.out.println("Not Leap Year");
        }

        int evenSum = 0;
        int oddSum = 0;

        System.out.println("Even Series using for loop:");
        for (int i = 2; i <= 20; i += 2) {
            System.out.print(i + " ");
            evenSum += i;
        }
        System.out.println();

        System.out.println("Odd Series using while loop:");
        int j = 1;
        while (j <= 19) {
            System.out.print(j + " ");
            oddSum += j;
            j += 2;
        }
        System.out.println();

        System.out.println("Even Series using do-while loop:");
        int k = 2;
        while (k <= 20) {
            System.out.print(k + " ");
            k += 2;
        }
        System.out.println();

        System.out.println("Odd Series using do-while loop:");
        int m = 1;
        do {
            System.out.print(m + " ");
            m += 2;
        } while (m <= 19);
        System.out.println();

        System.out.println("Sum of even series: " + evenSum);
        System.out.println("Sum of odd series: " + oddSum);
    }
}
