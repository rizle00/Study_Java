package pack04.Database;

public class OracleDAO implements IDataAccessObject {
	
	String dbName = "OracleDB";
	@Override
	public void select() {
		System.out.println(dbName+"조회함");
	}

	@Override
	public void insert() {
		System.out.println(dbName+"추가함");
	}

	@Override
	public void update() {
		System.out.println(dbName+"수정함");
	}

	@Override
	public void delete() {
		System.out.println(dbName+"삭제함");
	}

}
