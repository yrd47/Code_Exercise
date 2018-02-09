package chapter1_1;

import java.awt.List;
import java.util.ArrayList;

public class Exercise19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int n = 0; n < 100; n++) {
			System.out.println("N: " + n + " :  "+ FByList(n));
		}
	}
	
	public static long F(int N) {
		if ( N == 0) return 0;
		if ( N == 1) return 1;
		return F(N - 1) + F(N - 2);
	}
	
	public static int FByList(int N) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		if (N == 0) {
			return 0;
		} else if (N == 1) {
			return 1;
		} else {
			list.add(0);
			list.add(1);
			for (int n = 2; n <= N; n++){
				list.add(list.get(n-1) + list.get(n - 2));
			}
			return list.get(N);
		}
	}

}
