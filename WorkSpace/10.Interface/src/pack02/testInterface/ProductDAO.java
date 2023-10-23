package pack02.testInterface;

public class ProductDAO implements ProductInterface{

	
	// 상품 정보 5건을 담아  return하는 메소드 완성하기
	@Override
	public ProductDTO[] innitDtos() {
		ProductDTO[] dtos = new ProductDTO[5];
		dtos[0] = new ProductDTO(1, 100, "name1");
		dtos[1] = new ProductDTO(2, 200, "name2");
		dtos[2] = new ProductDTO(3, 300, "name3");
		dtos[3] = new ProductDTO(4, 400, "name4");
		dtos[4] = new ProductDTO(5, 500, "name5");
		
		
		
		return dtos;
	}

		//
	@Override
	public void disply(ProductDTO[] dtos) {
		System.out.println(COMPANY_NAME);
		for(int i = 0; i<dtos.length; i++) {
			System.out.println(dtos[i].getNum()+"."+dtos[i].getPrice()+"."+dtos[i].getName());
		}
		
	}
	
	

}
