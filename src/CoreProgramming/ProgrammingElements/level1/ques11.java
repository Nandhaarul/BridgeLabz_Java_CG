package CoreProgramming.ProgrammingElements.level1;

import java.util.Scanner;
class ques11{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num1;
        System.out.println("Enter the first number:");
        num1 = input.nextInt();
        int num2;
        System.out.println("Enter the second number:");
        num2 = input.nextInt();
        int add = num1+num2;
        int sub = num1-num2;
        int mul = num1*num2;
        int div = num1/num2;
        System.out.println("The addition,subtraction, multiplication and division value of 2 numbers "+num1+" and "+num2+ " is "+add+", "+sub+", "+mul+", "+div);
        input.close();
    }
}