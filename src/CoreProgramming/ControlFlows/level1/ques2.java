package CoreProgramming.ControlFlows.level1;

import java.util.Scanner;

class ques2{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the 3 numbers:");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        if(num1<num2 && num1<num3){
            System.out.println("The first number is the smallest number");
        }
        else{
            System.out.println("The first number is not the smallest number");
        }
        input.close();
    }
}