package C11;

class Company{

	int n1;
	int n2;
	
	private static Company instance;	//	
	private Company() {		//생성자의 사용을 막아버림 = 객체 생성을 못하게함
	}
	public static Company getInstance() {	//유효성 검사
		if(instance==null)					//인스턴스가 null이라면
			instance = new Company();		//company 객체를 생성해준다?
		return instance;					//주소값을 리턴해줌		,,instance 가 null이 아니라면 바로 instance 주소값을 리턴
	}
	
	@Override
	public String toString() {
		return "Company [n1=" + n1 + ", n2=" + n2 + "]";
	}
	
	
}

public class C03SingletonPattern {
	public static void main(String[] args) {
		Company com1 = Company.getInstance();
		Company com2 = Company.getInstance();		//두 객체 다 주소값이 같음
		com1.n1=100; com2.n2=200;		//같은 주소값을 공유하기 때문에 두 n1 n2 다 100 200이 나옴. 
		System.out.println("com1: " + com1);
		System.out.println("com2: " + com2);
	}
}
