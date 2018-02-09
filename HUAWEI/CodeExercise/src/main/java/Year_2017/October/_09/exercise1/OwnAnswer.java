package Year_2017.October._09.exercise1;

import java.util.Scanner;

/**
 * 013-句子逆序
 * 题目描述：将一个英文语句以单词为单位逆序排放。例如"I am a boy"，逆序排放后为"boy a am I"
 *          所有单词之间用一个空格隔开，语句中除了英文字母外，不包含其他字符
 * 输入描述：将一个英文语句以单词为单位逆序排放
 * 输出描述：得到逆序的句子
 * 输入例子：I am a boy
 * 输出例子：boy a am I
 * 思路：先将整个句子全部反转（此时单词也是反转的），再按空格分隔，将每个单词反转回来
 * Created by yrd on 2017/10/11.
 */
public class OwnAnswer {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String input = scanner.nextLine();
            System.out.println(inverseInput(input));
        }
        scanner.close();
    }

    public static String inverseInput(String input) {
        char[] inputs = input.toCharArray();

        //翻转整个句子
        reverse(inputs, 0, inputs.length - 1);

        for (int i = 0, j = 0; i < inputs.length; i = j + 1) {
            //找从i位置开始后的第一个非空白字符
            while (i < inputs.length && inputs[i] == ' ') {
                i++;
            }
            j = i + 1;
            while (j < inputs.length && inputs[j] != ' ') {
                j++;
            }
            reverse(inputs, i, j - 1);
        }
        return new String(inputs);
    }

    public static void reverse(char[] input, int start, int end) {
        char tmp;
        while (start < end) {
            tmp = input[start];
            input[start] = input[end];
            input[end] = tmp;
            start++;
            end--;
        }
    }
}
