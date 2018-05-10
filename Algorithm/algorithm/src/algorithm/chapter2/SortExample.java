package algorithm.chapter2;

public class SortExample {
	
	public static void sort(Comparable[] a) {
		//见具体的每种排序算法
	}
	
	private static boolean less(Comparable v, Comparable w) {
		return v.compareTo(w) < 0;
	}
	
	private static void excch(Comparable[] a, int i, int j) {
		Comparable tComparable = a[i];
		a[i] = a[j];
		a[j] = tComparable;
	}
	
	private static void show(Comparable[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}
	
	private static boolean isSorted(Comparable[] a) {
		for (int i = 1; i < a.length; i++) {
			if (less(a[i], a[i - 1])) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		String[] a = {"", "", ""};
		sort(a);
		isSorted(a);
		show(a);
	}

}
