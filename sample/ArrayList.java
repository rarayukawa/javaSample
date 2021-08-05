package sample;

public class ArrayList {
	public static void main(String[] args) {
		int[][] array = {
				{10, 20, 30, 40, 50},
				{60, 70, 80, 90, 99},
				{11, 12, 13, 14, 15},
				{21, 22, 23, 24, 25},
				{10, 20, 30, 40, 50}
				};
		array[2][1] = 21; 
		for(int i = 0; i < array.length - 1; i++) {
			for(int j = i + 1; j < array.length; j++) {
				ArrayList arrayList = new ArrayList(array[i]);
				ArrayList arrayList2 = new ArrayList(array[j]);
				if (array[i][0] + array[i][1] + array[i][2] + array[i][3] + array[i][4] > array[j][0] + array[j][1] + array[j][2] + array[j][3] + array[j][4]) {
					int[] swap = array[i];
					array[i] = array[j];
					array[j] = swap;
				}
			}
		}
		for(int k = 0; k < array.length; k++) {
			System.out.println(String.format("(%3d)[%d][%d][%d][%d][%d]", (array[k][0] + array[k][1] + array[k][2] + array[k][3] + array[k][4]), array[k][0], array[k][1], array[k][2], array[k][3], array[k][4]));
		}
	}
	private int arraySum(int[] array) {
		
		int arraySum = array[i][0] + array[i][1] + array[i][2] + array[i][3] + array[i][4];
		
	}
}
