package practice14.ptra14;

import practice14.common.Course;

public class DBCourse implements Course{

	/*
	 * ★ common.Courseを実装した、DBCourseクラスを作成してください
	 *
	 * コース名称
	 * 		「【Eラーニング】DB基礎」
	 * 単元
	 * 		DB基礎
	 * 		SQL基礎
	 * 		正規化
	 * 		SQL応用
	 */

	@Override
	public String getCourseName() {
		// TODO 自動生成されたメソッド・スタブ
		String cource = "【Eラーニング】DB基礎";
		return cource;
	}

	@Override
	public String[] getCourseUnit() {
		// TODO 自動生成されたメソッド・スタブ
		String[] courseUnit = {"DB基礎","SQL基礎","正規化","SQL応用"};

		return courseUnit;
	}


}
