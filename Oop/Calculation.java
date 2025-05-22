// practice problem 01
import java.util.Scanner;

public class Calculation {

    static double Area(double base, double height) {
        return 0.5 * base * height;
    }

    static double Volume(double radius) {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }

    static double CArea(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }

    static double cTof(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    static double ETArea(double side) {
        return (Math.sqrt(3) / 4) * Math.pow(side, 2);
    }

    static double TArea(double a, double b, double c) {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("provide the base and height of the triangle: ");
        double base = input.nextDouble();
        double height = input.nextDouble();
        System.out.println("calculated triangle area: " + Area(base, height));

        System.out.print("provide the radius of the ball: ");
        double radius = input.nextDouble();
        System.out.println("computed ball volume: " + Volume(radius));

        System.out.print("provide the radius of the circle: ");
        radius = input.nextDouble();
        System.out.println("computed circle area: " + CArea(radius));

        System.out.print("enter temperature in celsius: ");
        double celsius = input.nextDouble();
        System.out.println("equivalent fahrenheit temperature: " + cTof(celsius));

        System.out.print("provide the side length of the equilateral triangle: ");
        double side = input.nextDouble();
        System.out.println("equilateral triangle area: " + ETArea(side));

        System.out.print("provide the three sides of the triangle (a, b, c): ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        System.out.println("triangle area: " + TArea(a, b, c));
    }
}
