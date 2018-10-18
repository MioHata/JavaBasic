package practice10;
/*
 * PTra10_06.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra10_06 {

	/*
	 * PTra10_05で作成したCarクラスを使用します
	 */

	public static void main(String[] args) {

		/*
		 * carインスタンスを3件作成し、それぞれの色、ガソリンを入力して決定してください
		 * 各carインスタンスのrunメソッドを実行して、それぞれ「目的地にまでn時間かかりました。残りのガソリンは、xリットルです」を出力してください。
		 */

		Car[] car = new Car[3];

		String[] color = {"blue","red","yellow"};
		int[] gasoline = {40,60,50};

		for (int i = 0;i <car.length;i++) {
			car[i] = new Car();
			car[i].color = color[i];
			car[i].gasoline = gasoline[i];
		}

		final int distance = 300;

		for (int i = 0; i < car.length;i++) {

			int runDistance = 0;
			int count = 0;

			while(true) {

				runDistance += car[i].run();
				count++;

				// ガソリンがない
				if (runDistance == -1) {
					System.out.println("目的地に到着できませんでした");
					break;
				} else if (runDistance > distance) {
					System.out.println("目的地までに"+count+"時間かかりました。残りのガソリンは"+car[i].gasoline+"リットルです");
					break;
				}
			}
		}
	}
}
