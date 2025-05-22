//practice problem 3.0 


import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        
        double[] numbers = new double[5];
        double total = 0;

        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scan.nextDouble();
            total += numbers[i];
        }

        double avg = total / numbers.length;
        System.out.println("Average: " + avg);

       
        System.out.print("Enter grade point: ");
        double grade = scan.nextDouble();
        System.out.print("Completed semester? (true/false): ");
        boolean done = scan.nextBoolean();

        if (done) {
            if (grade >= 3.5) {
                System.out.println("Medal awarded");
            } else {
                System.out.println("No medal");
            }
        } else {
            System.out.println("No medal");
        }

        
        System.out.print("Enter sales percent: ");
        int sales = scan.nextInt();
        System.out.print("Enter attendance percent: ");
        int attendance = scan.nextInt();

        int bonus;

        if (sales >= 95 && attendance == 100) {
            bonus = 60;
        } else if (sales >= 95 && attendance >= 90) {
            bonus = 40;
        } else if (sales >= 80 && attendance == 100) {
            bonus = 40;
        } else if (sales >= 80 && attendance >= 90) {
            bonus = 20;
        } else {
            bonus = 5;
        }

        System.out.println("Bonus: " + bonus + "%");
    }
}
