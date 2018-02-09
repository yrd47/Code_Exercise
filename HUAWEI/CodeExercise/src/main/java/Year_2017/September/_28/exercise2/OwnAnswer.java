package Year_2017.September._28.exercise2;

import java.util.HashMap;
import java.util.Scanner;

/**
 * 008-合并表记录
 * 题目描述：数据表记录包含表索引和数值，请对表索引相同的记录进行合并，即将相同索引的数值进行求和运算，输出按照key值升序进行输出。
 * 输入描述：先输入键值对的个数，然后输入成对的index和value值，以空格隔开
 * 输出描述：输出合并后的键值对（多行）
 * 输入例子：4
 *          0 1
 *          0 2
 *          1 2
 *          3 4
 * 输出例子：0 3
 *          1 2
 *          3 4
 *
 * Created by yrd on 2017/9/28.
 */
public class OwnAnswer {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        while (scanner.hasNext()){
            map.clear();
            //直接用nextInt会有空行
            int count = Integer.parseInt(scanner.nextLine());
            while ((--count) >= 0) {
                String s = scanner.nextLine();
                //正则匹配1或多个空格
                String[] inputs = s.split("\\s+");
                if (map.containsKey(Integer.parseInt(inputs[0]))) {
                    map.put(Integer.parseInt(inputs[0]), map.get(Integer.parseInt(inputs[0]))
                            + Integer.parseInt(inputs[1]));
                } else {
                    map.put(Integer.parseInt(inputs[0]),Integer.parseInt(inputs[1]));
                }
            }
            PrintTable(map);
        }
    }

    public static void PrintTable(HashMap<Integer, Integer> map) {
        StringBuilder builder = new StringBuilder();
        for (Integer key : map.keySet()) {
            builder.append(key)
                    .append(" ")
                    .append(map.get(key))
                    .append("\n");
        }
        System.out.println(builder.toString());
    }
}
