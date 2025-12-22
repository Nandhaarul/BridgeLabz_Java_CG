package CoreProgramming.ControlFlows.level1;

import java.util.Scanner;

class ques4{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a natural number:");
        int num = input.nextInt();
        if(num<1){
            System.out.println("The given number is not an natural number:");
        }
        else{
            int sum = num*(num+1)/2;
            System.out.println("The given number is an natural number and the sum of the natural number is:"+sum);
        }
        input.close();
    }

}