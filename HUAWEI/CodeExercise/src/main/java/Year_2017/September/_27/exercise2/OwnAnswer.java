package Year_2017.September._27.exercise2;

import java.util.Scanner;

/**
 * 006-质数因子
 * 题目描述：输入一个正整数，按照从小到大的顺序输出它的所有质数因子（如180的质数因子为2 2 3 3 5）
 * 输入描述：输入一个long型整数
 * 输出描述：按照从小到大的顺序输出它的所有质数的因子，以空格隔开
 * 输入例子：180
 * 输出例子：2 2 3 3 5
 *
 * Created by yrd on 2017/9/27.
 */
public class OwnAnswer {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            long input = scanner.nextLong();
            System.out.println(getResult(input));
        }

    }


    public static String getResult(long ulDataInput) {
        StringBuilder builder = new StringBuilder();
        int i = 2;
        while (ulDataInput > 1) {
            if (ulDataInput % i == 0) {
                builder.append(i + " ");
                ulDataInput /= i;
            } else {
                i++;
            }
        }
        return builder.toString();
    }
}
