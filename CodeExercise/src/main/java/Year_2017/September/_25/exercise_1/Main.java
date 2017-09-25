package Year_2017.September._25.exercise_1;

import java.util.Scanner;

/**
 * Created by yrd on 2017/9/25.
 */
public class Main {

    /**
     * 题目描述：计算字符串最后一个单词的长度，单词以空格隔开
     * 输入描述：一行字符串
     * 输出描述：整数N，最后一个单词的长度
     * 输入例子：hello world
     * 输出例子：5
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //是否还有其他行，一次可以检测多行
        while (scanner.hasNext()) {
            String input = scanner.nextLine();
            System.out.println(findLastWordLength(input));
        }
        scanner.close();
    }

    public static int findLastWordLength(String input) {
        //最后一个字母的位置
        int last = input.length() - 1;
        //找最后一个字母出现的位置
        while (last >= 0 && input.charAt(last) == ' ') {
            last--;
        }
        //找最后一个字母之前的第一个空白字符
        int pos = last - 1;
        while (pos >= 0 && input.charAt(pos) != ' ') {
            pos--;
        }
        return last - pos;
    }
}
