package C16;
class C02Simple{
	int n;
	C02Simple(int n){
		this.n=n;
	}
	@Override
	public boolean equals(Object obj) {	//equals 재정의
		if(obj instanceof C02Simple) {
			C02Simple down = (C02Simple)obj;	//다운캐스팅
			return this.n == down.n;		//n을 다운캐스팅
			
		}
		return false;
	}
	
}

class B{
	
}
public class C02ObjectEqualsMain {




	public static void main(String[] args) {
		
		C02Simple ob1 = new C02Simple(10); 
		C02Simple ob2 = new C02Simple(20);	//새 객체기 때문에 주소값은 서로 다름
		C02Simple ob3 = new C02Simple(10);
		
//		B ob4 = new B();
		
		System.out.println(ob1.equals(ob2));	//false 
		System.out.println(ob1.equals(ob3));	//true 		//주소값이 같아지기 때문에 true가 나옴
	}

}
