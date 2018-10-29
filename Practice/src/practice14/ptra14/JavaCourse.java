package practice14.ptra14;

import practice14.common.Course;

/*
 * ★ common.Courseを実装した、JavaCourseクラスを作成してください
 *
 * コース名称
 * 		「【Eラーニング】Java」
 * 単元
 * 		式と演算
 * 		制御構文
 * 		メソッド
 * 		配列
 * 		オブジェクト指向
 * 		継承
 * 		高度な継承
 */

public class JavaCourse implements Course{

	String course;
	String[] courseUnit = new String[7];

	@Override
	public String getCourseName() {
		// TODO 自動生成されたメソッド・スタブ
		course = "eラーニング】Java";
		return course;
	}

	@Override
	public String[] getCourseUnit() {
		// TODO 自動生成されたメソッド・スタブ
		courseUnit[0] = "式と演算";
		courseUnit[1] = "制御構文";
		courseUnit[2] = "メソッド";
		courseUnit[3] = "配列";
		courseUnit[4] = "オブジェクト指向";
		courseUnit[5] = "継承";
		courseUnit[6] = "高度な継承";


		return courseUnit;
	}


}
