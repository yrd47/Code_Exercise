package chapter1_1;

public class Exercise13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] array = {{1,2,3,4}, {1,2,3,4}, {1,2,3,4}};
		Exercise13.printArray(array);
		int[][] arrayAfterReverse = Exercise13.reverseAarray(array);
		Exercise13.printArray(arrayAfterReverse);
	}

	//转置二维数组
	public static int[][] reverseAarray(int[][] array){
		int row = array.length;
		int column = array[0].length;
		int[][] arrayAfterReverse = new int[column][row];
		for (int i = 0; i < column; i++) {
			for (int j = 0; j < row; j++){
				arrayAfterReverse[i][j] = array[j][i];
			}
		}
		return arrayAfterReverse;
	}
	
	public static void printArray(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println("");
		}
	}
}
