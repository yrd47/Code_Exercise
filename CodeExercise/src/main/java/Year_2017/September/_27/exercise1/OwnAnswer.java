package Year_2017.September._27.exercise1;

import java.util.Scanner;

/**
 * 005-进制转换
 * 题目描述：写出一个程序，接受一个十六进制的数值字符串，输出该数值的十进制字符串
 * 输入描述：输入一个十六进制的数值字符串
 * 输出描述：输出该数值的十进制字符串
 * 输入例子：0xA
 * 输出例子：10
 *
 * Created by yrd on 2017/9/27.
 */
public class OwnAnswer {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            String input = scanner.nextLine();
            if (input.startsWith("0x")) {
                System.out.println(input);
                Conversion(input);
            } else {
                System.out.println("Error input");
            }
        }
    }

    public static void Conversion(String input) {
        int result = 0;
        int length = input.length();
        for (int i = length - 1; i > 1; i--) {
            int difference = getDifference(input.charAt(i));
            result += difference * Math.pow(16, (length - i - 1));
        }
        System.out.println(result);
    }

    public static int getDifference(char input) {
        if (input >= '0' && input <= '9') {
            return input - '0';
        } else if (input >= 'A' && input <= 'F') {
            return input - 'A' + 10;
        }
        return 0;
    }
}
