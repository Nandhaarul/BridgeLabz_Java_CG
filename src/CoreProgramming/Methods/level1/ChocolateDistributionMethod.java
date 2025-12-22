package CoreProgramming.Methods.level1;

import java.util.Scanner;

public class ChocolateDistributionMethod {

    public static int[] findRemainderAndQuotient(int chocolates, int children) {
        return new int[]{chocolates / children, chocolates % children};
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of chocolates:");
        int chocolates = sc.nextInt();

        System.out.println("Enter number of children:");
        int children = sc.nextInt();

        if (children <= 0) {
            System.out.println("Number of children must be greater than zero.");
        } else {
            int[] result = findRemainderAndQuotient(chocolates, children);
            System.out.println(
                    "Each child gets " + result[0] +
                            " chocolates, Remaining = " + result[1]
            );
        }

        sc.close();
    }
}
