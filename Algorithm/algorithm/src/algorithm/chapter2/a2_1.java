package algorithm.chapter2;

public class a2_1{
	
	/**
	 * 选择排序
	 * 交换次数固定为N，数据移动最少
	 *  
	 * @param a
	 */
	public static void sort(Comparable[] a) {
		int N = a.length;
		for (int i = 0; i < a.length; i++) {
			//将a[i]与a[i+1, ... , N]中最小的元素交换
			int min = i;		//最小元素的索引
			for (int j =i + 1; j < N; j++) {
				if (less(a[j], a[min])) {
					min = j;
				}
			}
			excch(a, i, min);
		}
	}
	
	private static boolean less(Comparable v, Comparable w) {
		return v.compareTo(w) < 0;
	}
	
	private static void excch(Comparable[] a, int i, int j) {
		Comparable tComparable = a[i];
		a[i] = a[j];
		a[j] = tComparable;
	}

}
