package C14;

abstract class Shape{
	 abstract void 넓이();
}
class Rectangle extends Shape{
	int width;
	int height;

	Rectangle(int width,int height){
		this.width = width;
		this.height = height;
	}

	void 넓이() {
		System.out.printf("넓이 : %d * %d=%d\n",width,height,width*height);
	}

}
class Triangle extends Shape{
	int height;
	int bottomLine;

	Triangle(int height,int bottomLine){
		this.height = height;
		this.bottomLine = bottomLine;
	}
	void 넓이() {
		System.out.printf("넓이 : %d * %d /2 = %d\n",height,bottomLine,(height*bottomLine)/2);
	}
}
class Circle extends Shape{
	int radius;
	static final double PI=3.14;

	Circle(int radius){
		this.radius = radius;
	}
	void 넓이() {
		System.out.printf("원 넓이 : %d * %d *%.2f = %.2f\n",radius,radius,PI,(radius*radius)*PI);
	}
}
public class C03Ex {
	public static void 전체넓이확인(Shape shape) 	//Shape 타입의 객체를 매개변수로 받음
	{
		//넓이 출력
		shape.넓이();	//그런 다음에 shape 타입인 객체의 넓이 메서드를 실행함. 이때 상속받은 각 객체의 오버라이딩된 메서드를 실행함.

	}

	public static void main(String[] args) {

		전체넓이확인(new Rectangle(45,45)); 	//shape 타입을 업캐스팅 시키고 객체 생성하는거임 !
		전체넓이확인(new Triangle(100,20));
		전체넓이확인(new Circle(5));
	}
}