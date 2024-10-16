package C09;
class Engine{
	private void 흡입() {System.out.println("외부로부터 공기를 빨아들임");}
	private void 압축() {System.out.println("가둔 공기를 압축시킴");}
	private void 폭발() {System.out.println("일정 수준압축되면 폭발");}
	private void 배기() {System.out.println("가스를 외부로 보낸다");}
	public void EngineStart() {
		흡입();
		압축();
		폭발();
		배기();

	}
}

class Car{
	Engine engine;	//class도 자료형이기 때문에 Engine engine 이라는 방식이 가능한거임
	Car(){
		engine = new Engine();
	}
	void run() {
		engine.EngineStart();		//이런 경우에는 상속을 받았다고 하는게 맞는건가? 아니면 그냥 메소드를 불러온것 뿐인것인가
	}
}

public class C02캡슐화 {

	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.run();
	}
}
