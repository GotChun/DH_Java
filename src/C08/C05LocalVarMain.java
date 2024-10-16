package C08;

//변수 종류

//멤버 변수 : 클래스 내의 멤버로 사용되는 변수(속성 저장)
//지역 변수 : {} 내에서 {}를 벗어난다면 공간 반환 , 변수명 중복시 좁운 지역의 변수가 적용
		// 매개변수 , 멤버변수 , 일반변수
//전역 변수 : static 변수

class C05Simple{
	int num=5;	//멤버변수
	void Func1() {
		System.out.println(num);
		int num=10;		//Func1 지역의 num
		System.out.println(num);
	}
	void Func2() {
		System.out.println();	//멤버변수 num
		if(true) {
			int num=20;			//if 지역내의 num
			System.out.println(num);
		}

		while(num<10) {		//멤버변수 num
			int num=20;		//지역변수 num
			num++;
		}
	}
}

public class C05LocalVarMain {

	public static void main(String[] args) {

	}
}
