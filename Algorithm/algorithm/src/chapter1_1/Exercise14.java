package chapter1_1;

public class Exercise14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(lg(128));
	}
	
	//返回不大于log2底N的最大整数
	public static int lg(int n) {
		int result = 0;
		while (n > 1) {
			if (n / 2 >= 1){
				result += 1;
				n /= 2;
			}
		}
		return result;
	}
}
