package backend;

import java.util.Scanner;

/**
 * @Author：Linzz
 * @Describe: 第三题
 * @Date：2024/5/8 12:17
 */
public class client3 {
    public static void main(String[] args) {
        CalculateFruitValue calculate = new CalculateFruitValue();
        double sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Enter the weight of apple(1/2 kilogram): ");
        System.out.println("2. Enter the weight of strawberry(1/2 kilogram): ");
        System.out.println("3. Enter the weight of mongo(1/2 kilogram): ");
        while (sc.hasNextInt()){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            sum = calculate.disCountFruit(a,b,c);
            System.out.println("all cost:"+sum);
        }
    }
}
