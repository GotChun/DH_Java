package CH13EX;

abstract class Employee{	//추상클래스이기 때문에 객체를 생성할 수 없음
	public String name;		//추상클래스에는 추상메서드 외에 다른 메서드가 존재해도 상관없나 ?
	private int age;
	private String addr;

	//추상메서드
	abstract int payment();


	//getter and setter
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public Employee(String name, int age, String addr) {
		super();
		this.name = name;
		this.age = age;
		this.addr = addr;
	}
}
class Parttimer extends Employee{
	private int hour_pay;
	private int time;

	@Override
	int payment() {

		return hour_pay*time;
	}

	public void setHourPay(int hourPay) {
		this.hour_pay = hourPay;
	}

	public Parttimer(String name, int age, String addr, int hour_pay) {
		super(name, age, addr);
		this.hour_pay = hour_pay;
	}

	@Override
	public String toString() {
		return "Parttimer [hour_pay=" + hour_pay + ", name=" + name + " age="+getAge() + " addr= " +getAddr() +"]";
	}


}
class Regular extends Employee{
	private int salary;

	@Override
	int payment() {
		return salary/12;
	}

	public Regular(String name, int age, String addr, int salary) {
		super(name, age, addr);
		this.salary = salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Regular [salary=" + salary + ", name=" + name + " age="+getAge() + " addr= " +getAddr() +"]";
	}

}


public class C02Ex {

	public static void main(String[] args) {
		Parttimer emp1 = new Parttimer("홍길동",25,"대구",20000);
		Regular emp2 = new Regular("서길동",45,"울산",50000000);
		System.out.println(emp1);
		System.out.println(emp2);

	}

}