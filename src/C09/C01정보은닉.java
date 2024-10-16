package C09;


class c01Person{
	private String name;
	private int age;   //
	private String addr;

public c01Person(String name, int age, String addr) {

		this.name = name;
		this.age = age;
		this.addr = addr;
	}
//	public int getAge() {
//		return this.age;
//	}
//	public String getAddr() {
//		return this.addr;
//	}
//	public void setAge(int age) {
//		this.age = age;
//	}
//	public void setAddr(String addr) {
//		this.addr = addr;
//	}
//	public String getName() {
//		return this.name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
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
		@Override
		public String toString() {
			return "c01Person [name=" + name + ", age=" + age + ", addr=" + addr + "]";
		}
}
public class C01정보은닉 {


	
	public static void main(String[] args) {
		c01Person hong = new c01Person("홍길동" , 50 , "대구");	//멤버변수가 모두 private 라면 여기서 지정해주는 매개변수값들은 어떻게 되는건가 ?
//		System.out.println(hong.addr);
//		System.out.println(hong.age);		//age 가 private 로 설정되어서 찾을수 없다고 뜬다.
//		hong.getClass(hong.addr);
//		int age = hong.getAge();
//		hong.setAge(55);
//		System.out.println(hong.getAge());
		hong.toString();
		hong.getAge();
		System.out.println(hong.getAddr());
		//접근 한정자
		//외부로 노출되면 안되는 데이터 (
		
	}
}
