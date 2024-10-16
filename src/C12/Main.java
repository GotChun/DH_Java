package C12;

public class Main {
	
	public static void main(String[] args) {
		
		Buyer 길동 = new Buyer(10000,0);
		Buyer 철수 = new Buyer(20000,0);
		
		Seller 사과맨 = new Seller(100000,100,1000);		
		
		
		길동.payment(사과맨, 5000);
		철수.payment(사과맨, 30000); 	//payment 함수 사용
		System.out.println(길동);
		System.out.println(철수);
		System.out.println(사과맨);
		
	}
}
