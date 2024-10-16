package C31;

import java.util.ArrayList;
import java.util.List;

class Person{
	private String name ;
	private int age ;
	//생성자
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	//게터 세터
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
	// 투 스트링
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

}

public class C01Lamda {

	public static void main(String[] args) {
		//람다란 ? 익명함수 뭘 하기위한 ? 함수형연산을 하기위한


		//람다 스트림
		List<Person> list = new ArrayList();
		list.add(new Person("길동",45));
		list.add(new Person("대해",256));
		list.add(new Person("동길",13));

		//나이순 정렬 람다식으로 표현하기
		list.sort((a,b)->{return a.getAge()-b.getAge();});	// 오름차순 a-b
															// 내림차순 b-a


		for(Person person : list) {
			System.out.println(person);
		}


	}
}
