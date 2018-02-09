package easy;

/**
 * Created by yrd on 2018/2/7.
 */
public class Problem9 {

    public boolean isPalindrome(int x) {
        if (x < 0 ) {
            return false;
        }
        int origin = x;
        long result = 0;
        while (origin != 0) {
            result = 10 * result + origin % 10;
            origin /= 10;
        }
        return x == result;
    }
}
