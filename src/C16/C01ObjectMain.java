package C16;

class A{
	int x=10;
	int y=20;
	@Override
	public String toString() {
		return "X = "+x + " Y="+y;
	}
	
	
}

public class C01ObjectMain {
	
		
	public static void main(String[] args) {
		Object ob1 = new Object();	//자바에서 자동으로 지원하는 클래스라서 따로 정의안해도 객체생성 가능
		System.out.println(ob1);
		System.out.println(ob1.toString());
		System.out.println(ob1.hashCode());
		
		A ob2 = new A();	//object 와 기본적인 상속관계
		System.out.println(ob2);
		ob2.toString();
		System.out.println(ob2.toString());
		System.out.println(ob2.hashCode());
		
	}
}
