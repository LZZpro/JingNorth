package backend;

import java.util.Scanner;

/**
 * @Author：Linzz
 * @Describe: 第四题， 优惠价格应该是和第三题叠加
 * @Date：2024/5/8 12:23
 */
public class client4 {
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
            sum = calculate.Full100Minus10(a,b,c);
            System.out.println("all cost:"+sum);
        }
    }
}
