/*
 * PTra18_04.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice18;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import practice18.entity.Player;

public class PTra18_04 {

	/*
	 * PTra19_02で作成したPlayerクラスを使用します
	 */

	public static void main(String[] args) {

		/*
		 * ①
		 * ★ file/BestElevenCandidate.csvの内容を取得し、１行毎にPlayerインスタンスに情報を格納してください
		 * ★ ArrayListを作成して、Playerインスタンスを格納してください
		 */
		ArrayList<Player> array = new ArrayList<>();
		try(Scanner scanner = new Scanner(new File("file/BestElevenCandidate.csv"))) {
			while (scanner.hasNext()) {
				String line = scanner.nextLine();
				String[] playerInfo = line.split(",");

				Player p = new Player();
				p.setPosition(playerInfo[0]);
				p.setName(playerInfo[1]);
				p.setCountry(playerInfo[2]);
				p.setTeam(playerInfo[3]);

				// ★ 1行ごとにArrayListに格納してください
				array.add(p);

			}
		} catch (FileNotFoundException e) {
			System.out.println("ファイルが見つかりません");
		}
		// ★ ①のArrayListの中からGK1名、DF4名、MF4名, FW2名をランダムで出力してください
		// 0番から4番までのランダム数値を発生させて表示
		Random random = new Random();

		int r1 = random.nextInt(5);
		System.out.println(array.get(r1));

		for (int i = 0; i < 4;i++) {
			// 5番から24番目までのランダム
			int r2 = random.nextInt(20)+5;
			System.out.println(array.get(r2));
		}
		for (int i = 0; i < 4;i++) {
			// 25番目から39番
			int r3 = random.nextInt(15)+25;
			System.out.println(array.get(r3));
		}
		for (int i = 0; i < 2;i++) {
			// 40番から54
			int r4 = random.nextInt(15)+40;
			System.out.println(array.get(r4));
		}

		/* めも
		 * GK、DF、MF, FW の全体の数があらかじめ把握しきれない時死にそう?
		 *ランダム数値の条件を設定するときに何番目から何番目か簡単にわからないはず
		 *ファイルをみて辿るのも大変そう
		 *配列をGK、DF、MF, FWの4つ分用意して、df.size()とかで調べてやればいける？
		 */
	}
}
