package CoreProgramming.ControlFlows.level1;

import java.util.Scanner;

class ques12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Not a natural number");
            return;
        }

        int sumLoop = 0;
        int i = 1;
        while (i <= n) {
            sumLoop += i;
            i++;
        }

        int sumFormula = n * (n + 1) / 2;

        System.out.println("Sum using loop = " + sumLoop);
        System.out.println("Sum using formula = " + sumFormula);
    }
}
