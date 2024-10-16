package C12;

public class Buyer {
	
	Buyer(int money,int count){
		this.money = money;
		this.count = count;
	}
	
	
	@Override
	public String toString() {
		return "Buyer [money=" + money + ", count=" + count + "]";
	}


	private int money;
	private int count;
	
	
	public void payment(Seller seller,int money) {
		
		this.money -=money;			//보유금액 - 차감금액
		int receiveApp = seller.receive(money);	//seller 클래스의 receive 메소드를 불러와서 내 매개변수 money를 사용
		this.count+=receiveApp;		//멤버변수 개수count 에 개수차감 
		
		
	}
}
