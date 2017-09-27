package Year_2017.September._25.exercise_2;

import java.util.Scanner;

/**
 * Created by yrd on 2017/9/25.
 */
public class Answer {

    /**
     * 项目描述：写出一个程序，接受一个有字母和数字以及空格组成的字符串，和一个字符，然后输出输入字符串中含有该字符的个数。不区分大小写
     * 输入描述：输入一个有字母和数字以及空格组成的字符串，和一个字符。
     * 输出描述：输出输入字符串中含有该字符的个数。
     * 输入例子：ABCDEF
     *          A
     * 输出例子：1
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String input = scanner.nextLine();
            String ch = scanner.nextLine();
            System.out.println(countCharNumber(input, ch));
        }
        scanner.close();
    }

    public static int countCharNumber(String input, String chStr) {
        char ch = 0;
        for (int i = 0; i < chStr.length(); i++) {
            if (chStr.charAt(i) != ' ') {
                ch = chStr.charAt(i);
                break;
            }
        }
        ch = toUpperase(ch);
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if (toUpperase(input.charAt(i)) == ch)
                count++;
        }
        return count;
    }

    private static char toUpperase(char ch) {
        if (ch >= 'a' && ch <= 'z') {
            return (char) ('A' + (ch - 'a'));
        }
        return ch;
    }
}
