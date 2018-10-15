package practice07;
/*
 * PTra07_07.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra07_06 {
	public static void main(String[] args) {

		// ★ ※2次元配列を用いています
		int[][] array = {
				{500,40,6},
				{70,8,90,1000}
		};

		// ★ 配列arrayに格納されている全ての数字の平均を出力してください
		int sum = 0;
		int count = 0;
		for (int i = 0;i < array.length;i++) {
			
			for (int j = 0; j < array[i].length; j++) {
				sum += array[i][j];
				count++;
			}
		}
		System.out.println(sum/count);
		
		
//		double sum = array[0][0]+array[0][1]+array[0][2]+array[1][0]+array[1][1]+array[1][2];
//		
//		System.out.println(sum / array[0].length+array[1].length);

	}
}
