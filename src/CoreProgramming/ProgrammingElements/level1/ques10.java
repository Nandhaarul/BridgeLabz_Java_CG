package CoreProgramming.ProgrammingElements.level1;

import java.util.Scanner;

class ques10{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int fee;
        System.out.println("Enter the fees:");
        fee = input.nextInt();
        int discount;
        System.out.println("Enter the discount percentage:");
        discount = input.nextInt();
        int newfee = (fee / 100) * discount;
        int discountamt = fee - newfee;
        System.out.println("The discount amount is INR " + newfee + " and final discounted  fee is is INR " + discountamt);
        input.close();
    }
}