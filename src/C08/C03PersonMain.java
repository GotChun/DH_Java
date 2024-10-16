package C08;

class C03Person{
	String name;
	int age;
	float height;
	double weight;
	//기능
	//말하다(메소드)
	void walk() {
		System.out.println(this.name+"이 뚜벅뚜벅 걷습니다");
	}
	@Override
	public String toString() {
		return "C03Person [name=" + name + ", age=" + age + ", height=" + height + ", weight=" + weight + "]";
	}

}

public class C03PersonMain {


		public static void main(String[] args) {
			C03Person park = new C03Person();
			park.name="홍길동";
			park.age=44;
			park.height=176.7f;
			park.weight=89.6;
			park.walk();
			System.out.println(park);
		}
}
