package C13;

	/*메서드 오버라이딩(함수 재정의)
	 * 상속관계를 전제로 상위클래스의 메서드를 하위클래스가 재정의(고쳐서사용) 하는 것을 허용한 문법
	 * 메서드의 헤더부분은 동일하게 두고 본체({})의 로직을 다양하게 둠으로써(다형성) 같은 함수를
	 * 상위클래스로부터 물려받더라도 각 하위클래스마다 다양한 형태의 결과물을 만들어낼 수 있다.
	 * 
	 * 오버로딩 : 헤더
	 * 		  : 개발자의 편의성에 중점(함수 이름 단일화)
	 * 		  : 상속을 전제로 하지 않음
	 * 오버라이딩
	 * 		: 본체(Body)
	 * 		: 다형성 ,상속을 전제로함  , 면접질문 중에 하나가 나올수도 있다는 ??
	 */
class Animal{
	void sound() {
		System.out.println("소리를 낸다");
	}
}

class Dog extends Animal{
	void sound() {
		System.out.println("왈 왈");
	}
}

class Cat extends Animal{
	void sound() {
		System.out.println("야옹 ~");
	}
}
public class C04Overriding {
	
	public static void main(String[] args) {
		Animal animal = new Animal();
		Dog dog = new Dog();
		Cat cat = new Cat();
		dog.sound();
		cat.sound();
		animal.sound();
		
		System.out.println();
		animal = dog;
		animal.sound();
		animal = cat;
		animal.sound();
		
		System.out.println(animal instanceof Cat);  //현재 업캐스팅을 통해 animal 객체는 cat 타입이기 때문에.
	}
}
