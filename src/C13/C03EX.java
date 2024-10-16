package C13;

class Employee{
	String name;
	private int age;
	private String addr;

	Employee(String name,int age,String addr){
		this.name = name;
		this.age = age;
		this.addr = addr;
	}


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


}
class Parttimer extends Employee{
	private int hour_pay;

	Parttimer(String name,int age,String addr,int hour_pay){
		super(name,age,addr);
		this.hour_pay = hour_pay;

	}

	public void setHour_Pay(int hour_pay) {
		this.hour_pay = hour_pay;
	}



	public void showInfo() {
		System.out.printf("파트타이머 이름 : %s 나이 : %d 주소 : %s 시급 : %d\n",name,getAge(),getAddr(),hour_pay);
	}



}

class Regular extends Employee{
	int salary;
	

	Regular(String name, int age, String addr,int salary) {
		super(name, age, addr);
		this.salary = salary;
		// TODO Auto-generated constructor stub
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public void showInfo() {
		System.out.printf("직원 이름 : %s 나이 : %d 주소 : %s 시급 : %d\n",name,getAge(),getAddr(),salary);
	}


}

public class C03EX {
	public static void main(String[] args) {

		Regular 직원 = new Regular("박대해",22,"대구",500000);
		Parttimer 알바 = new Parttimer("아르바",55,"창녕",9900);
//		직원.setSalary(300000);
		System.out.println(직원.age);
		System.out.println(직원.getAge());
		알바.showInfo();
		직원.showInfo();


	}
}
