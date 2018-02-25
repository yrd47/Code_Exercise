package Year_2017.September._26.exercise_1;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 * 明明想在学校中请一些同学一起做一项问卷调查，为了实验的客观性，他先用计算机生成了N个1到1000之间的随机整数（N≤100），
 然后再把这些数从小到大排序，按照排好的顺序去找同学做调查。请你协助明明完成“去重”与“排序”的工作。 注：测试用例保证输入参数的正确性，答题者无需验证
 * Input Param
 *  n 输入的随机数的个数
 *  inputArray n个随机整数组成的数组
 *
 * Created by yrd on 2017/9/26.
 */
public class Answer {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //treeset存储时已经排好序
        Set<Integer> set = new TreeSet<Integer>();
        while (scanner.hasNext()) {
            set.clear();
            int num = scanner.nextInt();
            while ((--num) >= 0) {
                set.add(scanner.nextInt());
            }
            for (Integer i : set) {
                System.out.println(i);
            }
        }

    }
}
