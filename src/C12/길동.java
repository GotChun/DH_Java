package C12;

public class 길동 {
	int money;
	int colacnt;
	public 길동(int money, int colacnt) {
		super();
		this.money = money;
		this.colacnt = colacnt;
	}
	
	public void getCola(편의점 seller,int money) {
		int colaCount=seller.sellCola(money);
		this.colacnt += colaCount;
		this.money-=money;
		
	}

	@Override
	public String toString() {
		return "길동 [money=" + money + ", colacnt=" + colacnt + "]";
	}
	
}
