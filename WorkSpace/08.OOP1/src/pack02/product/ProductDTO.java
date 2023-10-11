package pack02.product;
//DTO : 객체의 속성 ( 데이터 베이스에 있는 데이터 타입에 맞춰서 데이터를 "운반")
//Data Transfer Object
//Value Object : Web 표준 -> 생성자 별도x, 필드에 접근자를 막아놓은 형태
public class ProductDTO {
	private int num; //상품번호
	private int price; //0 -> 6900 
	private String name;
	
	public ProductDTO(int num, int price, String name) {
		this.num = num;
		this.price = price;
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		if(num<0) {
			name = " 잘못 된 입력입니다";
		} else {
		this.num = num;
		}
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		if(price<0) {
			name = " 잘못 된 입력입니다";}
		else {
			this.price = price;
		}
	}
	
	// alt + shift +s 또는
	// 마우스 우클릭 -> source -> getter & setter -> 생성자 메소드
	
	
	
	//public 외부에서 접근이 가능해야 하는 메소드
	//getter & setter
	//private 가 class 내부에서는 접근 가능하다는 것을 이용.
	// get <- 외부로부터 접근이 안되는 필드의 변수값을 return
	// set <- 필드의 변수값을 바꾸기 위한 (set) 메소드
	
}
