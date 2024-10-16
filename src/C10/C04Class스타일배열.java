package C10;
	
	class C04Person{
		String name;
		int age;
		
		public C04Person() {
			
		}
		public C04Person(String name,int age) {
			super();
			this.name=name;
			this.age = age;
		}
		@Override
		public String toString() {
			return "C04Person [name=" + name + ", age=" + age + "]";
		}
	}
public class C04Class스타일배열 {
	
	public static void main(String[] args) {
//		Chirstiano Ronaldo
//		Lonel Messi
//		Zlatan Imbrahimovic
//		Eden Hazard
//		Lomelu Lukaku
		C04Person list[] = new C04Person[3];
		list[0] = new C04Person();
		list[0].name="홍길동";
		list[0].age=55;
		list[1] = new C04Person();		
		list[1].name="김영희";		//참조변수가 null 값으로 지정되어있기 때문에 객체생성을 해줘야 한다.
		list[1].age=35;				//내가 이해하기 편하게 적자면 여기있는 참조변수들이 들어갈 객체를 생성을 해주지 않아서 주소값이 없기 때문에 변수를 넣을 수가 없던것.
		list[2] = new C04Person();
		list[2].name="김범수";		
		list[2].age=40;
		
		for(C04Person obj : list) {
			System.out.println(obj);
		}
		list[0] = new C04Person();
		
		
		
		
		
	}
}
