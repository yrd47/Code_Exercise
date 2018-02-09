package chapter1_1;

public class Exercise11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Boolean[][] array = {{true, false, false, true},
				{false, true, false, true},
				{true, true, true, true}};
		Exercise11.printArray(array);
	}
	
	//打印一个二维布尔数组 *表示真，空格表示假，打印出行号和列号
	 public static void printArray(Boolean[][] array) {
		 for (int i = 0; i < array.length; i++) {
			 for (int j = 0; j < array[i].length; j ++) {
				 if (array[i][j]) {
					 System.out.println(i + "," + j + ":" +"*");
				 } else {
					 System.out.println(i + "," +j + ":" + " ");
				 }
			 }
			 System.out.print("\n");
		 }
	 }

}
