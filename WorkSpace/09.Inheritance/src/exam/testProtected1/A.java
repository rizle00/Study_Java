package exam.testProtected1;

public class A {
	public int public_field1;
	int default_feild2;
	private int private_feild3;
	protected int protected_feild4;
	public A() {
		//생성을 막음
		System.out.println("생성자 메소드를  public -> protected");
	}
	// 
	
}
