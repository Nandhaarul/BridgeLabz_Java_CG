package CoreProgramming.ControlFlows.level1;

import java.util.Scanner;

class ques13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Not a natural number");
            return;
        }

        int sumLoop = 0;
        for (int i = 1; i <= n; i++) {
            sumLoop += i;
        }

        int sumFormula = n * (n + 1) / 2;

        System.out.println("Sum using loop = " + sumLoop);
        System.out.println("Sum using formula = " + sumFormula);
    }
}
