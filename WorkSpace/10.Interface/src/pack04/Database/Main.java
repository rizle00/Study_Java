package pack04.Database;

public class Main {
public static void main(String[] args) {
	 IDataAccessObject dao = new OracleDAO();
	 
	 dao.select();
	 dao.insert();
	 dao.update();
	 dao.delete();
}
}
