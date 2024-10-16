package C08;

class C02Person{
	String name;
	int age;
	float height;
	double weight;
}

public class C02PersonMain {

	public static void main(String[] args) {

		C02Person hong = new C02Person();
		hong.name="홍길동";
		hong.age=44;
		hong.height=176.7f;
		hong.weight=89.6;
		System.out.printf("%s %d %f %f\n",hong.name,hong.age,hong.height,hong.weight);
	}

}
