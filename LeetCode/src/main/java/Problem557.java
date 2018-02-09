/**
 * Created by yrd on 2017/7/6.
 */
public class Problem557 {

    public static String reverseWords(String s) {
        String result = "";
        String[] list = s.split(" ");
        String[] newList = new String[list.length];
        for(int i = 0; i < list.length; i++){
            String newString = reverse(list[i]);
            newList[i] = newString;
        }
        result = newList[0];
        for (int i = 1; i < newList.length - 1; i++){
            result = result + " ";
            result = result + " " + newList[i];
        }
        result = result + " " + (newList[newList.length - 1]);
        return result.toString();
    }

    public static String reverse(String s) {
        char[] list = s.toCharArray();
        char[] result = new char[list.length];
        for(int i=0 ; i < list.length; i++) {
            result[list.length - i -1 ] = list[i];
        }
        return new String(result);
    }

    public static void main(String[] args) {
        System.out.println(reverseWords("Let's take"));
    }

}
