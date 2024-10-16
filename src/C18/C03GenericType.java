package C18;

class Person{

	String name;
	String age;
	public Person(String name, String age) {
		this.name=name;
		this.age=age;
	}
}
class Man extends Person{

	public Man(String name, String age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Man [name=" + name + ", age=" + age + "]";
	}
	

}
class Woman extends Person{

	public Woman(String name, String age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Woman [name=" + name + ", age=" + age + "]";
	}
	

}
class Couple<X,Y>{
	private X member1;
	private Y member2;

	public Couple(X member1, Y member2) {
		super();
		this.member1 = member1;
		this.member2 = member2;
	}
	@Override
	public String toString() {
		return "Couple [member1=" + member1 + ", member2=" + member2 + "]";
	}



}
public class C03GenericType {

	public static void main(String[] args) {

		Couple<Man,Woman> couple1 = new Couple(new Man("철수","20"),new Woman("영희","20"));
		System.out.println(couple1);
	}
}
