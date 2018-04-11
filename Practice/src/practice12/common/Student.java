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

	public int getstudentId() {
		return this.studentId;
	}
	public void setstudentId(int ID) {
		this.studentId = ID;
	}
	
	
	
	/** 受講生氏名 */
	private String studentName;

	public String getstudentName() {
		return this.studentName;
	}
	public void setstudentName(String name) {
		this.studentName = name;
	}
	
	
	
	/** 会社名 */
	private String companyName;

	public String getcompanyName() {
		return this.companyName;
	}
	public void setcompanyName(String com) {
		this.companyName = com;
	}
	
	
	
	/** 教室名 */
	private String className;

	public String getclassName(){
		return this.className;
	}
	public void setclassName(String c) {
		this.className = c;
	}
	
	
	
	/** メールアドレス */
	private String mail;

	public String getmail() {
		return this.mail;
	}
	public void setmail(String mail) {
		this.mail = mail;
	}
	
	
	
	/** パスワード */
	private String password;
	
	public String getpassword() {
		return this.password;
	}
	
	public void setpassword(String p) {
		this.password =p;
	}
}
