package Cafe;

public class MenuDTO {
	
	private String name;
	
	private int money, refund, price;
	
	
			
	public MenuDTO(String name, int price) {
		super();
		this.name = name;
//		this.num = num; 인덱스 넘버로 처리
		this.price = price;
	}

	public MenuDTO() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public int getRefund() {
		return refund;
	}
	public void setRefund(int refund) {
		this.refund = refund;
	}
//	public int getNum() {
//		return num;
//	}
//	public void setNum(int num) {
//		this.num = num;
//	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
}
