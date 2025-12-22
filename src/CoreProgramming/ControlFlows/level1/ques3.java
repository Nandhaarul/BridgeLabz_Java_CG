package CoreProgramming.ControlFlows.level1;

import java.util.Scanner;

class ques3{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the 3 numbers:");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        if(num1>num2 && num1>num3){
            System.out.println("The first number is the largest number");
        }
        else if(num2>num1 && num2>num3){
            System.out.println("The second number is the largest number");
        }
        else{
            System.out.println("The third number is the largest number");
        }
        input.close();
    }
}