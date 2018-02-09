package chapter1_1;

public class BinaySearch {
	
	//list为有序的int数组
	public static int sort(int target, int[] list) {
		int left = 0;
		int right = list.length - 1;
		while (left <= right) {
			int mid = left + (right - left) / 2;
			if (target < list[mid]) {
				right = mid -1 ;
			} else if (target > list[mid]) {
				left = mid + 1;
			} else {
				return mid;
			}
		}
		return -1;
	}
	
	//递归实现
	public static int sortByRecursive(int target, int[] list, int left, int right) {
		if (left > right) {
			return -1;
		}
		int mid = left + (right - left) / 2;
		if (target < list[mid]) {
			return sortByRecursive(target, list, left, mid - 1);
		} else if (target > list[mid]) {
			return sortByRecursive(target, list, mid + 1, right);
		} else {
			return mid;
		}
	}
	
	public static void main(String[] args) {
		int target = 9;
		int[] list = {1,2,3,4,5,6,7};
		int result = BinaySearch.sort(target, list);
		int left = 0;
		int right = list.length -1;
		int resultByRecursive = BinaySearch.sortByRecursive(target, list, left, right);
		System.out.println(result);
		System.out.println(resultByRecursive);
	}
}
