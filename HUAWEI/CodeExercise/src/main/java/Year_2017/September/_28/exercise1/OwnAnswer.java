package Year_2017.September._28.exercise1;

import java.util.Scanner;

/**
 * 007-取近似值
 * 题目描述：写出一个程序，接受一个浮点数值，输出该数值的近似整数值。如果小数点后数值大于等于5,向上取整；小于5，则向下取整。
 * 输入描述：输入一个浮点数值
 * 输出描述：输出该数的近似整数值
 * 输入例子：6.3
 * 输出例子：6
 *
 * Created by yrd on 2017/9/28.
 */
public class OwnAnswer {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            float input = scanner.nextFloat();
            String string = String.valueOf(input);
            int index = string.indexOf(".");
            if ((string.charAt(index + 1) - '5') >= 0) {
                System.out.println(Integer.valueOf(string.substring(0,index)) + 1);
            } else {
                System.out.println(Integer.valueOf(string.substring(0,index)));
            }
        }
    }
}
