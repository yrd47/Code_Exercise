package chapter1_1;

public class Exercise7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exercise7.e1();
		Exercise7.e2();
		Exercise7.e3();
	}
	
	public static void e1() {
		double t = 9.0;
		while (Math.abs(t - 9.0 / t) > 0.001)
			t = (9.0 / t + t) / 2.0;
		System.out.printf("%.5f\n",t);
	}
	
	public static void e2() {
		int sum  = 0;
		for (int i = 1; i < 1000; i++) {
			for (int j = 0; j < 1000; j++){
				sum++;
			}
		}
		System.out.println(sum);
	}
	
	public static void e3() {
		int sum = 0;
		for (int i = 1; i < 1000; i *= 2){
			for (int j = 0; j < 1000; j++){
				sum++;
			}
		}
		System.out.println(sum);
	}

}
