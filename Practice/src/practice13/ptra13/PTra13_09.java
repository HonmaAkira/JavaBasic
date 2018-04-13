/*
 * PTra13_09.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice13.ptra13;
import practice13.common.Employee;
public class PTra13_09 {

	/*
	 * ★ PTra13_08で作成したEmployeeクラスを使用します
	 */

	/** 名前データ（定数） */
	public static final String[] NAMEDATA = {"山田", "佐藤", "小林"};

	/** メールデータ（定数） */
	public static final String[] MAILDATA = {"yamada@hoge.com","satou@hoge.com","kobayashi@hoge.com"};

	/** パスワードデータ（定数） */
	public static final String[] PASSDATA = {"rezo0001","rezo0002","rezo0003"};

	/** 部署データ（定数） */
	public static final String[][] QUATERDATA = {
														{"総務部","業務部","システム部"},
														{"5","10","35"},
													};

	/**
	 * エントリーポイント
	 * @param args
	 */
	public static void main(String[] args) {

		// ★ 定数で定義されている各データを使用して、Employeeインスタンスを３つ作成してください
		Employee[] employee = new Employee[3];

		Employee employee1 = new Employee();
		Employee employee2 = new Employee();
		Employee employee3 = new Employee();

		employee[0] = employee1;
		employee[1] = employee2;
		employee[2] = employee3;
		//上のデータを配列から取り出す

		for(int i =0;i <employee.length;i++) {
			employee[i].userNm = NAMEDATA[i];
			employee[i].mail = MAILDATA[i];
			employee[i].password = PASSDATA[i];
			employee[i].setDepartmentNm(QUATERDATA[0][i]);
			int num = Integer.parseInt(QUATERDATA[1][i]);
			employee[i].setDepartmantCnt(num);
		}
		//Employeeクラスのフィールドに順番に値を代入する


		//値が代入されたemployeeインスタンスを表示する。
		for(int i =0; i < employee.length;i++) {
			System.out.println(employee[i].getUserNm());
			System.out.println(employee[i].getMail());
			System.out.println(employee[i].getPassword());
			System.out.println(employee[i].getDepartmentNm());
			System.out.println(employee[i].getDepartmantCnt());
		}
	}
}
