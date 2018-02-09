package easy;

/**
 * Created by yrd on 2018/2/6.
 */
public class Problem7 {

    /**
     * Given a 32-bit signed integer,reverse digits of an integer
     */

    /**
     * 通过余数求商法操作
     * @param x
     * @return
     */
    public int reverse(int x) {
        long tmp = x;
        //防止结果溢出
        long result = 0;
        while (tmp != 0) {
            result = result * 10 + tmp % 10;
            tmp /= 10;
        }

        if (result < Integer.MIN_VALUE || result > Integer.MAX_VALUE) {
            result = 0;
        }
        return (int)result;
    }


    public int reverse2(int x) {
        if (x == 0) {
            return 0;
        }
        if (x > 0) {
            String s = Integer.toString(x);
            if (Double.parseDouble(reverseString(s)) > Integer.MAX_VALUE) {
                return 0;
            }
            return Integer.parseInt(reverseString(s));
        }
        if (x < 0) {
            String s =Integer.toString(x);
            String result = reverseString(s.substring(1));
            if (Double.parseDouble("-" + result) < Integer.MIN_VALUE) {
                return 0;
            }
            return Integer.parseInt("-" + result);
        }
        return 0;
    }

    private String reverseString(String s) {
        char[] c = s.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        int index =c.length - 1;
        while ((index >= 0) && (c[index] == '0')) {
            index--;
        }
        for (int i = index; i >= 0; i--) {
            stringBuilder.append(c[i]);
        }
        return stringBuilder.toString();
    }
}
