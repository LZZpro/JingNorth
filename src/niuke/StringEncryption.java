package niuke;

import java.util.Scanner;

/**
 * @Author：Linzz
 * @Describe:
 * @Date：2024/5/15 17:41
 */
public class StringEncryption {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 输入字符串和偏移量m
        System.out.print("请输入一个长度小于1000的字符串：");
        String inputString = scanner.nextLine();
        System.out.print("请输入偏移量m（0 <= m < 字符串长度）：");
        int m = scanner.nextInt();

        // 执行加密处理并输出结果
        String encryptedString = encryptString(inputString, m);
        System.out.println("加密后的字符串为：" + encryptedString);

        scanner.close();
    }

    // 加密处理方法
    public static String encryptString(String inputString, int m) {
        StringBuilder encryptedString = new StringBuilder();

        // 遍历字符串
        int count = 1;
        for (int i = 0; i < inputString.length(); i++) {
            char currentChar = inputString.charAt(i);

            // 如果是最后一个字符或者当前字符与下一个字符不相同
            if (i == inputString.length() - 1 || inputString.charAt(i + 1) != currentChar) {
                // 对每个字符向后偏移m位
                char encryptedChar = (char) ((currentChar - 'a' + m) % 26 + 'a');
                // 如果偏移后的字符超过了字母表的最后一个字母'z'，则循环回到字母表的开头
                if (encryptedChar > 'z') {
                    encryptedChar = (char) ('a' + (encryptedChar - 'z' - 1));
                }
                // 记录重复的字符和数量
                encryptedString.append(encryptedChar);
                if (count > 1) {
                    encryptedString.append(count);
                }
                count = 1; // 重置计数器
            } else {
                // 统计重复字符的数量
                count++;
            }
        }

        return encryptedString.toString();
    }
}
