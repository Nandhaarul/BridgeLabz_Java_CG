package CoreProgramming.ProgrammingElements.level1;

import java.util.Scanner;

public class ques12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base in inches: ");
        double base = sc.nextDouble();
        System.out.print("Enter height in inches: ");
        double height = sc.nextDouble();
        double areaInSqInches = 0.5 * base * height;
        double areaInSqCm = areaInSqInches * 6.4516;
        System.out.println("Area of the triangle:");
        System.out.println("In square inches: " + areaInSqInches);
        System.out.println("In square centimeters: " + areaInSqCm);

        sc.close();
    }
}
