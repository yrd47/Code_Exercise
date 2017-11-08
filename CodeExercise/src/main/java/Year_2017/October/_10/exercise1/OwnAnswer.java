package Year_2017.October._10.exercise1;

import java.util.Scanner;

/**
 * 015-求int型数据在内存中存储时1的个数
 * 题目描述：输入一个int型数据，计算出该int型数据在内存中存储时1的个数
 * 输入描述：输入一个整数（int型）
 * 输出描述：这个数转换成2进制后，输出1的个数
 * 输入例子：5
 * 输出例子：2
 *
 * Created by yrd on 2017/10/11.
 */
public class OwnAnswer {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int input = scanner.nextInt();
            System.out.println(binary(input));
        }
    }

    public static int binary(int input) {
        if (input == 0) {
            int count = 0;
            while (input / 2 != 0) {
                if (input % 2 == 1) {
                    count++;
                }
                input = input / 2 ;
            }
            return ++count;
        }
        return 0;
    }
}
