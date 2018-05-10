package sorttrain.swap;

/**
 * Created by yrd on 2018/2/24.
 */
public class QuickSortTrain1 {

    public static void quickSort1(int[] a, int left, int right) {
        if (left < right) {
            int pivot = a[left];
            int lo = left;
            int hi = right;
            while (lo < hi ) {
                while (lo < hi && a[hi] >= pivot) {
                    hi--;
                }
                a[lo] = a[hi];
                while (lo < hi && a[lo] <= pivot) {
                    lo++;
                }
                a[hi] = a[lo];
            }
            a[lo] = pivot;
            quickSort1(a, left, lo - 1);
            quickSort1(a, lo + 1, right);
        }
    }

    public static void quickSort2(int[] a, int left, int right) {
    	if (left < right) {
    		int privot = a[left];
    		int lo = left;
    		int hi = right;
    		while (lo < hi) {
    			while (lo < hi && a[hi] >= privot) {
        			hi--;
        		}
        		a[lo] = a[hi];
        		while (lo < hi && a[lo] <= privot) {
        			lo++;
        		}
        		a[hi] = a[lo];
    		}
    		a[lo] = privot;
        	quickSort2(a, left, lo - 1);
        	quickSort2(a, lo + 1, right);
    	}
    }
    
    public static void quickSort3(int[] a, int left, int right) {
    	if (left < right) {
			int middle = getMiddle(a, left, right);
			quickSort3(a, left, middle - 1);
			quickSort3(a, middle + 1, right);
		}
    }
    
    public static int getMiddle(int[] a, int left, int right) {
    	int provit = a[left];
    	while(left < right) {
    		while(left < right && a[right] >= provit) {
    			right--;
    		}
    		a[left] = a[right];
    		while(left < right && a[left] <= provit) {
    			left++;
    		}
    		a[right] = a[left];
    	}
    	a[left] = provit;
    	return left;
    }
    
    public static void main(String[] args) {
        int[] a = new int[]{9,8,1,3,2,5,6,7,4};
        quickSort3(a, 0, a.length - 1);
        for (int i : a) {
            System.out.println(i);
        }
    }

}
