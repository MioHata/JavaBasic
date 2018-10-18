/*
 * Student.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice12.common;

/**
 * 受講生の情報を格納します
 * @author Rhizome
 *
 */
public class Student {
	/** 受講生ID */
	private int studentId;

	/** 受講生氏名 */
	private String studentName;

	/** 会社名 */
	private String companyName;

	/** 教室名 */
	private String className;

	/** メールアドレス */
	private String mail;

	/** パスワード */
	private String password;

	/*
	 * ゲッター
	 */
	public int getStudentId() {
		return studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public String getCompanyName() {
		return companyName;
	}
	public String getClassName() {
		return className;
	}
	public String getMail() {
		return mail;
	}
	public String getPassword() {
		return password;
	}
	/*
	 * セッター
	 */
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public void setStudentName(String studentName) {
		this.studentName= studentName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public void setMail(String mail) {
		this.mail = mail;

	}
	public void setPassword(String password) {
		this.password = password;
	}
}
