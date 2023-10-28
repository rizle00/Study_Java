package pack02.testInterface;

public interface ProductInterface {
	//클래스의 규칙
	//실제 기능 구현은 클래스 (implement) : crtl + shift + x, y -> 대소문자 전환
	public String COMPANY_NAME = "인터페이스 회사";
	//초기 데이터 5건을 리턴받는 메소드
	public ProductDTO[] innitDtos();
	// 배열을 입력받아 내부의 내용을 출력하는 메소드
	public void disply(ProductDTO[] dtos);
}
