package chapter1_1;

public class Exercise9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exercise9.toBinary(2);
		Exercise9.toBinary(20);
	}
	
	//将一个正整数N用二进制表示并转换为一个string类型的值
	public static void toBinary(int x) {
		String string = "";
		for (int i = x; i > 0; i /= 2) {
			string = (i % 2) + string; 
		}
		System.out.println(string);
	}

}
