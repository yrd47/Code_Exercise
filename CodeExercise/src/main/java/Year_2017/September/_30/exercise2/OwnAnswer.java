package Year_2017.September._30.exercise2;

import java.util.Scanner;

/**
 * 012-字符串反转
 * 题目描述：写出一个程序，接收一个字符串，然后输出该字符串反转后的字符串
 * 输入描述：输入N个字符串
 * 输出描述：输出该字符串反转后的字符串
 * 输入例子：abcd
 * 输出例子：dcba
 *
 * Created by yrd on 2017/9/30.
 */
public class OwnAnswer {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            String input = scanner.nextLine();
            reverseString(input);
        }
    }

    public static void reverseString(String input) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = input.length() - 1; i >=0; i--) {
            stringBuilder.append(input.charAt(i));
        }
        System.out.println(stringBuilder.toString());
    }
}
