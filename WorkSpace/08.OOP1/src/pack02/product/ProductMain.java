package pack02.product;

public class ProductMain {
	public static void main(String[] args) {
		ProductDAO dao = new ProductDAO();
		ProductDTO [] dtos = dao.selectRead();
		//dtos = dao.delete(dtos);
		//dao.display(dtos);
		//dao.delete(dtos);
		//ProductDTO를 하나 객체로 만들고 필드(변수,?) 전체에 값 할당 후 출력
		// Array(배열) -> 데이터타임[] 해당하는 타입을 담고 있는 배열 ->크기
//		ProductDTO[] dtos =  new ProductDTO[5];
//		ProductDTO dto1 = new ProductDTO(1, 6900, "스카프");
//		ProductDTO dto2 = new ProductDTO(2, 4900, "스카프1");
//		ProductDTO dto3 = new ProductDTO(3, 5900, "스카프2");
		dao.find();
//		dtos[0] = new ProductDTO(1, 6900, "스카프");
//		dtos[1] = new ProductDTO(2, 4900, "스카프1");
//		dtos[2] = new ProductDTO(3, 5900, "스카프2");
//		dtos[3] = new ProductDTO(4, 5900, "스카프2");
//		dtos[4] = new ProductDTO(5, 5900, "스카프2");
//		dto.setNum(1);
//		dto.name = "scarf";
//		dto.setPrice(3500);
//		System.out.println(dto.name + dto.getPrice()+"원");
		//dto.price =-3500;
		//System.out.println(dto.num +"." + dto.name + " : "+dto.price+ "원");
		
//		dao.display(dto1);
//		dao.display(dto2);
//		dao.display(dto3);
//		dao.display(dtos);
		// dto => dto1, dto2, dto3 
		
	}
}
