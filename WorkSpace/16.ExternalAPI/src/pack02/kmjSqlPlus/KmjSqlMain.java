package pack02.kmjSqlPlus;

import java.util.Scanner;

public class KmjSqlMain {
	public static void main(String[] args) {
		KmjSqlDAO dao = new KmjSqlDAO();
		Scanner sc = new Scanner(System.in);
		dao.checkConnection("hanul", "0000");
//		dao.sendSql("select * from member");
		int checkCount =1;
		while(checkCount<=3) {
			System.out.println("사용자명 입력: ");
			String id = sc.nextLine();
			System.out.println("비밀번호 입력: ");
			String pw = sc.nextLine();
			checkCount++;
			if (dao.checkConnection(id, pw)){
				while(true) {
					System.out.println("SQL 입력");
					String sql = sc.nextLine();
					if(sql.equals("exit")) {
						break;
					}
					dao.sendSql(sql);
				}
			}
		}
	}
}
