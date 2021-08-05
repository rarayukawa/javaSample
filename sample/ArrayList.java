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
				ArrayList arrayList = new ArrayList();
				int arraySum = arrayList.arraySum(array[i]);
				ArrayList nextArrayList = new ArrayList();
				int nextArraySum = nextArrayList.arraySum(array[j]);
				if (arraySum > nextArraySum) {
					int[] swap = array[i];
					array[i] = array[j];
					array[j] = swap;
				}
			}
		}
		for(int k = 0; k < array.length; k++) {
			ArrayList subList = new ArrayList();
			int subTotal = subList.arraySum(array[k]);
			System.out.println(String.format("(%3d)[%d][%d][%d][%d][%d]", subTotal, array[k][0], array[k][1], array[k][2], array[k][3], array[k][4]));
		}
	}
	private int arraySum(int[] array) {
		int arraySum = 0;
		for (int i = 0; i < array.length; i++) {
			arraySum += array[i];
		}
		return arraySum;
	}
}
