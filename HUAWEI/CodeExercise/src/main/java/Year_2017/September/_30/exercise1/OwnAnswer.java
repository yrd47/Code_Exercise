package Year_2017.September._30.exercise1;

import java.util.Scanner;

/**
 * 011-数字颠倒
 * 题目描述：输入一个整数，将这个整数以字符串的形式逆序输出，程序不考虑负数，若数字含有0，则逆序形式也含有0
 * 输入描述：输入一个int整数
 * 输出描述:将这个整数以字符串形式逆序输出
 * 输入例子：1516000
 * 输出例子：0006151
 *
 * Created by yrd on 2017/9/30.
 */
public class OwnAnswer {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int input = scanner.nextInt();
            reverseInt(input);
        }
    }

    public static void reverseInt(int input) {
        while (input > 0) {
            int i = input % 10;
            input = input / 10;
            System.out.print(i);
        }
    }
}
