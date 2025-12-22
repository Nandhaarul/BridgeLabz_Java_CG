package CoreProgramming.ProgrammingElements.level1;

import java.util.Scanner;
class ques8{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double km;
        System.out.println("Enter the distance in Km:");
        km = input.nextDouble();
        double miles = km/1.6;
        System.out.println("The total miles is "+miles+" Mile for the given "+km+" km");
        input.close();
    }
}