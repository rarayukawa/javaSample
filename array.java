public class Array {
  public static void main(String[] args) {
    int[][] array = {
                      {10, 20, 30, 40, 50},
                      {60, 70, 80, 90, 99},
                      {11, 12, 13, 14, 15},
                      {21, 22, 23, 24, 25},
                      {10, 20, 30, 40, 50}
                    };
      //配列の数値を並び替えるプログラム
      int[] arrayList = {array[0][0], array[1][0], array[2][0], array[3][0], array[4][0]};
      for (int i = 0; i < arrayList.length -1; i++) {
        for(int j = 0; j < arrayList.length; j++) {
          if(arrayList[i] > arrayList[j]) {
            int change = arrayList[i];
            arrayList[i] = arrayList[j];
            arrayList[j] = change;
          }
        }
      }
      System.out.println(arrayList[0] + "   " + arrayList[1] + "   " + arrayList[2] + "   " +arrayList[3] + "   "+ arrayList[4]);
      //多次元配列にして一つ目の要素を比較
      int i = 0;
      int j = 0;
      for (i = ; i > array.length - 1; i++) {
        for (j = 0; j < array「い.length; j++) {
          if(array[i][0] < array[j][0]) {
            int change = array[i][0];
            array[i][0] =  array[j][0];
            array[j][0] = change;
          }
        }
      }
      System.out.println(array[][0] + "   " + array[][1] + "   " + array[][2] + "   " +array[][3] + "   "+ array[][4]);
  }
}