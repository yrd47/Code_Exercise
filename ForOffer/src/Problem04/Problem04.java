package Problem04;

/**
 * Created by yrd on 2018/2/27.
 */
public class Problem04 {

    /**
     * @param string     要转换的字符数组
     * @param usedLength 字符数组中已经使用的长度
     * @return 转换后使用的字符长度，-1表示处理失败
     */
    public static int replaceBlank(char[] string, int usedLength) {
        if (string == null || string.length < usedLength) {
            return -1;
        }

        int blankCount = 0;
        for (char c : string) {
            if (c == ' ') {
                blankCount++;
            }
        }

        int targetLength = usedLength + blankCount * 2;
        int tmp = targetLength;

        //转换后的长度大于数组的最大长度，直接返回失败
        if (targetLength > string.length) {
            return -1;
        }
        if (blankCount == 0) {
            return usedLength;
        }

        usedLength--;
        targetLength--;

        while (usedLength >= 0 && usedLength < targetLength) {
            if (string[usedLength] == ' ') {
                string[targetLength--] = '0';
                string[targetLength--] = '2';
                string[targetLength--] = '%';
            } else {
                string[targetLength--] = string[usedLength];
            }
            usedLength--;
        }
        return tmp;
    }

    public static void main(String[] args) {
        char[] string = new char[50];
        string[0] = ' ';
        string[1] = 'e';
        string[2] = ' ';
        string[3] = ' ';
        string[4] = 'r';
        string[5] = 'e';
        string[6] = ' ';
        string[7] = ' ';
        string[8] = 'a';
        string[9] = ' ';
        string[10] = 'p';
        string[11] = ' ';

        int length = replaceBlank(string, 12);
        System.out.println(new String(string, 0, length));
    }
}
