package Problem03;

/**
 * Created by yrd on 2018/2/25.
 * <p>
 * 剑指Offer 面试题2
 * 二维数组中的查找
 */
public class Problem03 {

    /**
     * 在一个二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
     * 请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
     * <p>
     * 首先选取数组中右上角的数字。如果该数字等于要查找的数字，查找过程结束；
     * 如果该数字大于要查找的数字，剔除这个数字所在的列；如果该数字小于要查找的数字，剔除这个数字所在的行
     *
     * @param matrix 待查找的数组
     * @param number 要查找的数
     * @return 查找结果，true找到，false没有找到
     */
    public static boolean find(int[][] matrix, int number) {
        //输入条件判断
        if (matrix == null || matrix.length < 1 || matrix[0].length < 1) {
            return false;
        }

        int rows = matrix.length;       //数组的行数
        int cols = matrix[0].length;    //数组的列数
        int row = 0;                    //起始行号
        int col = cols - 1;             //起始列号
        while (row < rows && col >= 0) {
            if (matrix[row][col] == number) {
                return true;
            } else if (matrix[row][col] < number) {
                row++;      //当前数较小，行数加一，向下移动
            } else {
                col--;      //当前数较大，列数减一，向左移动
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 8, 9},
                {2, 4, 9, 12},
                {4, 7, 10, 13},
                {6, 8, 11, 15}
        };
        System.out.println(find(matrix, 7));    // 要查找的数在数组中
        System.out.println(find(matrix, 5));    // 要查找的数不在数组中
        System.out.println(find(matrix, 1));    // 要查找的数是数组中最小的数字
        System.out.println(find(matrix, 15));   // 要查找的数是数组中最大的数字
        System.out.println(find(matrix, 0));    // 要查找的数比数组中最小的数字还小
        System.out.println(find(matrix, 16));   // 要查找的数比数组中最大的数字还大
        System.out.println(find(null, 16));     // 健壮性测试，输入空指针
    }
}
