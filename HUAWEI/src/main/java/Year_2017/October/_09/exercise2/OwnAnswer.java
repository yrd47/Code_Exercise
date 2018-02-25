package Year_2017.October._09.exercise2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * 014-字串的连接最长路径查找
 * 题目描述：给定n个字符串，请对n个字符串按照字典序排列
 * 输入描述：输入第一行为一个正整数n(1≤n≤1000),下面n行为n个字符串(字符串长度≤100),字符串中只含有大小写字母。
 * 输出描述：数据输出n行，输出结果为按照字典序排列的字符串。
 * 输入例子：2
 *          boat
 *          boot
 * 输出例子：boat
 *          boot
 * Created by yrd on 2017/10/11.
 */
public class OwnAnswer {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int count = Integer.parseInt(scanner.nextLine());
            List<String> list = new ArrayList<String>(count);
            while ((count--) > 0) {
                list.add(scanner.nextLine());
            }

            Collections.sort(list);

            for (String s : list) {
                System.out.println(s);
            }
        }

    }
}
