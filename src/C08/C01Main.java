package C08;


public class C01Main {
	String name;
	int age;
	float height;
	double weight;
	
	public static void main(String[] args) {
		
		C01Person hong = new C01Person();
		hong.name="홍길동";
		hong.age=44;
		hong.height=176.7f;
		hong.weight=89.6;
		System.out.printf("%s %d %f %f\n",hong.name,hong.age,hong.height,hong.weight);
	}

}