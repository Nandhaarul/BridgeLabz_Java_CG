package CoreProgramming.ControlFlows.level1;

import java.util.Scanner;

class ques14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("Enter a positive number");
            return;
        }

        long fact = 1;
        int i = 1;
        while (i <= n) {
            fact *= i;
            i++;
        }

        System.out.println("Factorial = " + fact);
    }
}
