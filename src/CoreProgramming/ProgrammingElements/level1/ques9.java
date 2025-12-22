package CoreProgramming.ProgrammingElements.level1;

import java.util.Scanner;

class ques9{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        float heightCm;
        System.out.println("Enter your height in CM:");
        heightCm = input.nextFloat();
        float inch = heightCm / 2.54f;
        float foot = inch / 12f;
        System.out.println("Your hieght in cm is "+heightCm+" while in feet is "+foot+" and inches is "+inch);
        input.close();
    }
}