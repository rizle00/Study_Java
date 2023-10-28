package pack04.Database;

public class Main {
public static void main(String[] args) {
	 IDataAccessObject dao = new OracleDAO();
	 // 부모 인터페이스 = 자식 클래스 생성자
	 dao.select();
	 dao.insert();
	 dao.update();
	 dao.delete();
}
}
