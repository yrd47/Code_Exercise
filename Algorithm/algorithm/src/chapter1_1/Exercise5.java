package chapter1_1;

public class Exercise5 {
	
	public static void main(String[] args) {
		double x = 0.01;
		double y = 0.999;
		System.out.println(x > 0 && x < 1 && y > 0 && y < 1);
		if (x > 0 && x < 1 && y > 0 && y < 1){
			System.out.println(true);
		} else {
			System.out.println(false);
		}	
	}
}
