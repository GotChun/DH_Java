package C12;

public class 편의점 {
	int colaCount;
	int colaPrice;
	int money;


	public 편의점(int colaCount, int colaPrice, int money) {
		super();
		this.colaCount = colaCount;
		this.colaPrice = colaPrice;
		this.money = money;
	}


	public int sellCola(int money) {
		int TakeColaCount=money/this.colaPrice;
		this.colaCount-=TakeColaCount;
		this.money +=money;

		return TakeColaCount;

	}


	@Override
	public String toString() {
		return "편의점 [colaCount=" + colaCount + ", colaPrice=" + colaPrice + ", money=" + money + "]";
	}
	

}
