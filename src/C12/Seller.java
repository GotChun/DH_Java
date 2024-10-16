package C12;

public class Seller {
	
	
	public Seller(int money, int count, int price) {
		super();
		this.money = money;
		this.count = count;
		this.price = price;
	}
	

	@Override
	public String toString() {
		return "Seller [money=" + money + ", count=" + count + ", price=" + price + "]";
	}


	private int money;
	private int count;
	private int price;
	
	public int receive(int money) {			//판매 메소드  손님에게서 돈을 받음
		this.money +=money;			//멤버변수 money 증가시킴 this.money 와 매개변수 money는 엄연히 다름 ! 
		int returnCount = money/price;  	//받은금액/사과가격 = 반환사과개수
		
		this.count -=returnCount;	//사과개수 - 반환사과개수
		return returnCount;			//줘야 하는 사과개수 return
	}
	
	
	
	
}
