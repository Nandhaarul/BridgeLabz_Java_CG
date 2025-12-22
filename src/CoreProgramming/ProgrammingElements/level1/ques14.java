package CoreProgramming.ProgrammingElements.level1;

import java.util.Scanner;

public class ques14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double distanceInFeet = sc.nextDouble();
        double distanceInYards = distanceInFeet / 3;
        double distanceInMiles = distanceInYards / 1760;
        System.out.println("Distance in yards is " + distanceInYards + " and distance in miles is " + distanceInMiles);
        sc.close();
    }
}
