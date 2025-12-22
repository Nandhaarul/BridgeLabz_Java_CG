package CoreProgramming.ControlFlows.level1;

import java.util.Scanner;

class ques1{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = input.nextInt();
        if(num % 5 == 0){
            System.out.println("The number is divisible by 5");
        }
        else{
            System.out.println("The number is not divisible by 5");
        }
        input.close();
    }
}