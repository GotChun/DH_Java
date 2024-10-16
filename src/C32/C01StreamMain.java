package C32;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Person{
	String name;
	Integer age;		//객체 형태로써 메소드를 사용하기 위해 int 가 아니고 Integer 선언
	public Person(String name, Integer age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}



}
public class C01StreamMain {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1,2,3,4,5);
		System.out.println(list);
		//filter
		List<Integer> list2 = list.stream()			//조건을 추출하여 새로운 리스트를 생성함
								.filter(n->n%2==0)	//조건
								.collect(Collectors.toList());	//다시 리스트형으로 반환
		System.out.println(list2);

		List<Integer> list3 = list.stream()
								.filter(n -> n%2 ==1)
								.map(n->{return n*n;})		//중괄호와 return 제거할 수 있다.(근데 안할거임 ㅋ)
								.collect(Collectors.toList());
		System.out.println(list3);


		List<Person> list4 = Arrays.asList(		//Person 타입의 리스트 생성

					new Person("박효신발장수",46),
					new Person("박대해홍홍",22),
					new Person("이이잉",11)

				);
		System.out.println(list4);
		System.out.println();

		List<Integer> list5 = list4.stream()
								.map(ob->ob.getAge())	//map 이 무슨 함수더라
								.sorted((a,b)->b-a)
								.collect(Collectors.toList());
		System.out.println("list 5 : " +list5);
		System.out.println();

		List<Integer> list6 = list4.stream()
									.map(Person::getName)	 //Person 클래스의 이름가져옴
									.map(String::length)	//길이 파악
									.sorted((a,b)->a-b)		//정렬
									.collect(Collectors.toList());		//리스트화
		System.out.println("list 6 : " + list6);

		List<String> names = Arrays.asList("대해","칼리스타","이상혁","안나라수나마라");
		List<Integer> ages = Arrays.asList(10,20,30,40,50);
		System.out.println();

//		'map은 Stream의 요소들을 내가 사용할 형태로 바꾸거나, 사용할 요소를 뽑아내는 것'라고 생각했습니다.
		List<Person> list7 = names.stream()
//								.map(Person::new)  //person 객체를 만듬
								.map(el->{
									return new Person(el,ages.get(names.indexOf(el)));	//names 의 인덱스를 가져온후 ages 에 해당하는 값을 리턴
								}).collect(Collectors.toList()
								);
		// 그러니까 names 와 ages 를 합쳐서 새로운 리스트를 만드는거임 이거는  ㅇㅋ?
		System.out.println("list7" +list7);
		//나는 너의 ~ 오늘을 자처했고 ~












	}
}
