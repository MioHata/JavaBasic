package practice13.common;

public class Employee extends Person{

	/*
	 * ★ common.Personクラスを継承して、common.Employeeクラスを作成してください
	 *
	 * フィールド
	 * 		departmentNm（部署名）		:	String
	 * 		departmentCnt（部署人数）	:	int
	 * メソッド
	 * 		各フィールドのアクセサ
	 */

	// フィールド
	private String departmentNm;
	private int departmentCnt;

	public void setDepartmentNm(String departmentNm) {
		this.departmentNm = departmentNm;
	}
	public void setDepartmentCnt(int departmentCnt) {
		this.departmentCnt = departmentCnt;
	}

	public String getDepartmentNm() {
		return departmentNm;
	}
	public int getDepartmentCnt() {
		return departmentCnt;
	}
}
