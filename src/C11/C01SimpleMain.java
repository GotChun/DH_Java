package C11;

class C02Simple {
	int n1; // 객체 생성 후에 만들어짐
	static int n2; // 객체 생성 전에 만들어짐

	void func1() {

		n1 = 10;
		n2 = 20;
	}

	static void func2() { // 객체 생성 이전
//		n2=10;			//n1은 객체가 생기고 나서 만들어지는데 , 객체가 생성될지 안될지 모르기 때문에 접근이 안됨
//		n1=10;			// static 은 이미 만들어져있는 변수이기 때문에 접근이 가능함.
	}
}

public class C01SimpleMain {
	public static void main(String[] args) {

	}
}
