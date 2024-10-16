package C18;

class Animal{}

class Tiger extends Animal{
	String name;
	Tiger(String name){
		super();
		this.name = name;
	}
	@Override
	public String toString() {
		return "Tiger [name=" + name + "]";
	}
	
}

class Panda extends Animal{
	String name;
	Panda(String name){
		super();
		this.name = name;
		
	}
	//생성자
	//toString()
	@Override
	public String toString() {
		return "Panda [name=" + name + "]";
	}
}

class Cat extends Animal{
	String name;

	
	public Cat(String name) {
		super();
		this.name = name;
	}


	@Override
	public String toString() {
		return "Cat [name=" + name + "]";
	}
	
	
}

public class C04GenericMain {
	
//	public static <T extends Animal> void PrintInfo(T[] arr) {
//		for(T el : arr)
//			System.out.println(el);
//	}
	public static void PrintInfo(Object[] arr) {
		for(Object el : arr)
			System.out.println(el);
		System.out.println();
	}
	public static void main(String[] args) {
		
		Tiger[] arr1 = {new Tiger("시베리아"),new Tiger("백두산"),new Tiger("뱅갈")};
		PrintInfo(arr1);
		Panda[] arr2 = {new Panda("푸바오"),new Panda("강바오"),new Panda("중국")};
		PrintInfo(arr2);
		Object[] arr3 = {new Tiger("줄무늬"),new Panda("블랙화이트"),new Cat("삼색이")};
		PrintInfo(arr3);
	}
}
