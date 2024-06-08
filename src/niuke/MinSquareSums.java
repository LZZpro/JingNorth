package niuke;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * @Author：Linzz
 * @Describe:
 * @Date：2024/5/16 9:31
 */
public class MinSquareSums {

    public static int minSquareSums(int m) {
        int[] dp = new int[m + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j * j * j * j <= i; j++) {
                dp[i] = Math.min(dp[i], dp[i - j * j * j * j] + 1);
            }
        }

        return dp[m];
    }

    public static void main(String[] args) {
//        LinkedList<Object> objects = new LinkedList<>();
//        objects.contains()

        int m1 = 34;
        int n1 = minSquareSums(m1);
        System.out.println(m1 + " = " + getEquation(m1,n1));

        int m2 = 123;
        int n2 = minSquareSums(m2);
        System.out.println(m2 + " = " + getEquation(m2,n2));
    }

    public static String getEquation(int m,int n) {
        StringBuilder equation = new StringBuilder();
        int current = m;
        int j = (int) Math.floor(Math.sqrt(m));

        while (current > 0 && j > 0) {
            while (j * j * j * j > current) {
                j--;
            }
            equation.append(j).append("^4");
            current -= j * j * j * j;
            if (current > 0) {
                equation.append(" + ");
            }
        }

        return equation.toString() + " 则n="+ n;
    }
}
