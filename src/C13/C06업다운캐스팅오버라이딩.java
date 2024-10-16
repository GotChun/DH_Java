package C13;

class Parent{
	void func1() {
		System.out.println("부모가 펑1 콜 !");
	}
}

class Son extends Parent{
	void func1() {
		System.out.println("자식이 펑1 콜 !");
	}
	void func2() {
		System.out.println("자식이 펑2 콜 !(확장됨)");
	}
}
public class C06업다운캐스팅오버라이딩 {
	
	public static void main(String[] args) {
		Parent son = new Son();		//업캐스팅
		son.func1();			//오버라이딩된 상태로 메소드가 사용됨!
//		son.func2();  	//업캐스팅된 상태이기 때문에 사용이 안됨 !
		Son down = (Son)son;		//다운캐스팅
		son.func1();
		down.func2();
//		son.func2();	son은 down이랑 같긴한데 down이 캐스팅된거지 son이 같이 다운캐스팅이 된건 아님 !
		Son ob2 = new Son();
		ob2.func2();
		Parent ob3 = new Parent();
		ob3.func1();
		
//		Parent ob3 = new Son(); // 중요 ~!!!!!!!!!!!!!!
		
		//Upcasting
		//상위클래스형 참조변수 = 하위클래스형 객체
		// 자동형변환
		// 상속관계의 모든 클래스의 객체를 연결할 수 있다. !!
		
		//업캐스팅된 상태에서는 확장된(추가된) 멤버변수 접근가능 ? x -> 다운캐스팅으로 해결
		//업캐스팅된 상태에서는 확장된(추가된) 멤버함수 접근가능 ? x -> 다운캐스팅으로 해결
		//업캐스팅된 상태에서는 재정의된 함수에 접근가능? o
	}
}
