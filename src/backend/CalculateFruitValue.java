package backend;

/**
 * @Author：Linzz
 * @Describe:
 * @Date：2024/5/8 11:27
 */
public class CalculateFruitValue {


    public double getSum(int a, int b) {
        return a * PriceConstant.APPLE_PRICE
                + b * PriceConstant.STRAWBERRY_PRICE;
    }

    public double getSum(int a, int b, int c) {
        return a * PriceConstant.APPLE_PRICE
                + b * PriceConstant.STRAWBERRY_PRICE
                + c * PriceConstant.MANGO_PRICE;
    }

    public double disCountFruit(int a, int b, int c) {
        return a * PriceConstant.APPLE_PRICE
                + b * PriceConstant.STRAWBERRY_PRICE * 0.8
                + c * PriceConstant.MANGO_PRICE;
    }

    public double Full100Minus10(int a, int b, int c) {
        double sum = disCountFruit(a, b,c);
        return sum > 100 ? sum - 10 : sum;
    }




}
