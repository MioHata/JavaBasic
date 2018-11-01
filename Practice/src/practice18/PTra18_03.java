/*
 * PTra18_03.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice18;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import practice18.entity.Player;

public class PTra18_03 {

	/*
	 * PTra19_02で作成したPlayerクラスを使用します
	 */

	public static void main(String[] args) {

		/*
		 * ①
		 * ★ file/BestElevenCandidate.csvの内容を取得し、１行毎にPlayerインスタンスに情報を格納してください
		 * ★ ArrayListを作成して、Playerインスタンスを格納してください
		 */
		// ここにPlayerインスタンスを格納する
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

		// ★ ①のArrayListの中から"レアル・マドリード", "バルセロナ"の選手を除外してください
		ArrayList<Player> newArray = new ArrayList<>();
		// arrayのサイズ分調べる
		for (int i = 0;i <array.size();i++) {
			if (!(array.get(i).getTeam().equals("レアル・マドリード"))
					&& !( array.get(i).getTeam().equals("バルセロナ"))) {
				newArray.add(array.get(i));
			}
		}
		// ★ 削除後のArrayListの中身を全件出力してください
		for(Player player : newArray){
			System.out.println(player);
		}
	}
}
