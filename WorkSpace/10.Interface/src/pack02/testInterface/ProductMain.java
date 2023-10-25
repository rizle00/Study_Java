package pack02.testInterface;

public class ProductMain {
public static void main(String[] args) {
//	ProductDTO dto = new ProductDTO();
	ProductDTO dto;
	dto = new ProductDTO();
	ProductDAO dao = new ProductDAO();
	
//	ProductDTO [] dtos = dao.innitDtos();
//	dao.disply(dtos);
	
	dao.disply(dao.innitDtos());
	//return 타입이 주어진 메소드는 해당하는 타입의 객체(변수)라고 보면 편함
}
}
