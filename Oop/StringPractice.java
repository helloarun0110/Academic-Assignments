//practice problem 4.1 


import java.util.Scanner;

public class StringPractice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scan.nextLine();

        String reversed = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }

        System.out.println("Reversed: " + reversed);

        if (input.equalsIgnoreCase(reversed)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }

        System.out.print("Enter a character to count: ");
        char target = scan.next().charAt(0);

        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == target) {
                count++;
            }
        }

        System.out.println("Occurrence of '" + target + "': " + count);
    }
}

