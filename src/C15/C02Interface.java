package C15;

interface Tire{
	void run();
}
class 한국타이어 implements Tire{
	public void run() {
		System.out.println("한국타이어가 굴러갑니다");
	}
}
class 금호타이어 implements Tire{
	public void run() {
		System.out.println("금호타이어 굴러감");
	}
}
class Car{
	Tire FL;		//여기서 FL은 객체명인가 참조변수인가?
	Tire FR;
	Tire BL;
	Tire BR;
	Car(){
		FL = new 한국타이어();		//FL 이라는 Tire 타입의 참조변수를 가진 한국타이어 객체를 만듬.
		FR = new 한국타이어();		//생성자임 이건.	Car타입 객체를 생성하면 한국타이어 객체도 알아서 4개 생성되는거임.
		BL = new 한국타이어();
		BR = new 한국타이어(); 		//업캐스팅
	}
	void start() {
		FL.run();
		FR.run();
		BL.run();
		BR.run();
	}
}

public class C02Interface {
	
	public static void main(String[] args) {
		Car car = new Car();
		car.start();			//아, 여기까지는 한국타이어 객체라서 한국타이어가 굴러감으로 나오는데
		car.FL = new 금호타이어();
		car.BR = new 금호타이어();   //똑같이 BR 이라는 Tire 타입의 참조변수를 가진 금호타이어 객체를 만듬. 근데 main 메서드랑 Car 클래스에서 만드는 거랑은 무슨 차이가 있나??
		System.out.println();
		car.start();			//여기부터는 FL 과 BR이 금호타이어 객체로 만들어지기 때문에 금호타이어가 굴러감으로 나온다.
		System.out.println(car.FL instanceof Tire);
		System.gc();
	}
}
