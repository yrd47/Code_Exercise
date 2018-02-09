package chapter1_1;

public class Exercise15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {-11,2,3,4,5};
		int M = 3;
		int[] result = histogram(a, M);
		for (int i : result) {
			System.out.println(i);
		}
	}
	
	//返回的数组的第i个元素的值为整数i在参数数组中出现的次数。
	//若a[]中的值均在0到M-1之间，返回的数组中所有元素之和应该和a.length相等
	public static int[] histogram(int[] a, int M) {
		int[] result = new int[M];
		for (int i = 0; i < a.length; i++) {
			if ((a[i] >= 0) && (a[i] < M)) {
				result[a[i]]++;
			}
		}
		return result;
	}

}
