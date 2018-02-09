package Year_2017.September._29.exercise1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 009-提取不重复的整数
 * 题目描述：输入一个int型整数，按照从右向左的阅读顺序，返回一个不含重复数字的新的整数。
 * 输入描述：输入一个int型整数
 * 输出描述：按照从右向左的阅读顺序，返回一个不含重复数字的新的整数
 * 输入例子：9876673
 * 输出例子：37689
 *
 * Created by yrd on 2017/9/29.
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
        char[] inputs = String.valueOf(input).toCharArray();
        List<Character> list = new ArrayList<Character>();
        for (int i = inputs.length - 1; i >= 0; i--) {
            if (list.indexOf(inputs[i]) == -1) {
                list.add(inputs[i]);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
        }
        System.out.println();
    }
}
