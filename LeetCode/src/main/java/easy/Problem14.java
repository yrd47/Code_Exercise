package easy;

/**
 * Created by yrd on 2018/2/7.
 */
public class Problem14 {

    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        String shortest = strs[0];
        for (String s : strs) {
            if (s.length() < shortest.length()) {
                shortest = s;
            }
        }

        boolean allMatch;
        for (int index = shortest.length(); index >=1; index--) {
            allMatch = true;
            String result = shortest.substring(0, index);
            for (String s : strs) {
                if (!s.startsWith(result)) {
                    allMatch = false;
                    break;
                }
            }
            if (allMatch) {
                return result;
            }
        }
        return "";
    }

    public static void main(String[] args) {
        String[] strings = new String[] {"a", "as", "ac"};
        System.out.printf(longestCommonPrefix(strings));
    }
}
