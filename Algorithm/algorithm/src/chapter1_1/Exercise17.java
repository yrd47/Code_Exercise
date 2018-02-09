package chapter1_1;

public class Exercise17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(exR2(2));
	}
	
	public static String exR2(int n) {
		if (n <= 0) return "";
		String string = exR2(n -3) + n + exR2(n - 2) + n;
//		if (n <= 0) return "";
		return string;
	}

}
