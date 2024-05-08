package backend;

import java.util.Scanner;

/**
 * @Author：Linzz
 * @Describe: 第一道题目
 * @Date：2024/5/8 11:43
 */
public class Client1 {

    public static void main(String[] args) {

        CalculateFruitValue calculate = new CalculateFruitValue();
        double sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Enter the weight of apple(1/2 kilogram): ");
        System.out.println("2. Enter the weight of strawberry(1/2 kilogram): ");
        while (sc.hasNextInt()){
            int a = sc.nextInt();
            int b = sc.nextInt();
            sum = calculate.getSum(a,b);
            System.out.println("all cost:"+sum);
        }

    }
}
