package C14;

// 일반클래스 상속관계
class Super1{

}
class Sub extends Super1{
//	void Func() {
//		System.out.println("Son is 함수;;");
	}

// 추상클래스 상속관계
abstract class Super2{
abstract void Func();	//반드시 재정의해서 사용해야ㅏㅁ
}

class Sub2 extends Super2{	//
//	/void Func() {		//추상클래스에서 미리 함수 구조만 정의해둔다, 그냥 참조하기 위한 말
//		System.out.println("Son is 함수22222");
	}

public class C01AbstractMain {

	public static void main(String[] args) {
		Super1 ob1 = new Super1();
 		Sub1 ob2= new Sub1();  //상위클래스형 객체생성
		ob1.Func();				//하위클래스형 객체생성o
		Super ob3 = new2 ob2;

	//추상클래스 상속관계 확인
		Super2 ob4 = new Super2();
		Sub2 ob5 = new Sub2();
		Super2 ob6 = ob5;
		ob6.func();

















	}
}
