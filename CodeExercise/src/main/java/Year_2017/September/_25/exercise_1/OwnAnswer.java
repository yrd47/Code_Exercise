package Year_2017.September._25.exercise_1;

import java.util.Scanner;

/**
 * Created by yrd on 2017/11/7.
 */
public class OwnAnswer {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String input = scanner.nextLine();
            System.out.println(lastWord(input));
        }
    }

    public static int lastWord(String input) {
        if (input.length() != 0) {
            int last = input.length() - 1;
            char[] inputs = input.toCharArray();
            while (last >= 0 && inputs[last] == ' ') {
                last--;
            }
            int begin = last - 1;
            while (begin >= 0 && inputs[begin] != ' ') {
                begin--;
            }
            return last - begin;
        }
        return 0;
    }
}
