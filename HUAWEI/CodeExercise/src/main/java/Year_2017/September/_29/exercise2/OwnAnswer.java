package Year_2017.September._29.exercise2;

import java.util.Scanner;

/**
 * 010-字符个数统计
 * 题目描述；编写一个函数，计算字符串中含有的不同字符的个数。字符在ACSII码范围内(0~127)。不在范围内的不作统计。
 * 输入描述：输入N个字符，字符在ANSII码范围内（0-127）
 * 输出描述：输出字符的个数
 * 输入例子：zbc
 * 输出描述：3
 *
 * Created by yrd on 2017/9/29.
 */
public class OwnAnswer {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String input = scanner.nextLine();
            System.out.println(charCount(input));
        }
    }

    public static  int charCount(String input) {
        int[] list = new int[128];
        char[] inputs = input.toCharArray();
        for (char c : inputs) {
            list[c]++;
        }
        int count = 0;
        for (int i : list) {
            if (i != 0 )
                count++;
        }
        return count;
    }
}
