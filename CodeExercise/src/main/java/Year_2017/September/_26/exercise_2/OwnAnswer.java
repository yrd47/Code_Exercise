package Year_2017.September._26.exercise_2;

import java.util.Scanner;

/**
 * 连续输入字符串，请按长度为8拆分每个字符串后输出到新的字符串数组
 * 长度不是8整数倍的字符串请在后面补0，空字符串不处理
 *
 * 输入描述：连续输入字符串（输入两次，每个字符串长度小于100）
 * 输出描述：输出到长度为8的新字符串数组
 * 输入例子：abc
 *          123456789
 * 输出例子：abc00000
 *          12345678
 *          90000000
 *
 * Created by yrd on 2017/9/26.
 */
public class OwnAnswer {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String string1 = scanner.nextLine();
            String string2 = scanner.nextLine();
            spiltString(string1);
            spiltString(string2);
            }
    }

    public static void spiltString(String input) {
        char[] chars = input.toCharArray();
        if (chars.length == 0)
            return;
        int time = chars.length / 8;
        int left = chars.length % 8;
        for (int i = 0; i < time; i++) {
            char[] array = new char[8];
            for (int j = 0; j < 8; j++)
                array[j] = chars[i * 8 + j];
            System.out.println(String.copyValueOf(array));
        }
        char[] array = new char[8];
        for (int j = 0; j < 8; j++) {
            if (j < left) {
                array[j] = chars[time * 8 + j];
            } else {
                array[j] = '0';
            }
        }
        System.out.println(String.valueOf(array));
    }
}
