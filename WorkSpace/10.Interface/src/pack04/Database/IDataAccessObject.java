package pack04.Database;

public interface IDataAccessObject {
//DAO : 데이터 베이스에 접근 , CRUD (create read update delete)
	public void select();
	public void insert();
	public void update();
	public void delete();
	
}
