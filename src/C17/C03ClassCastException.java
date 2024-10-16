package C17;

class Animal{}
class Dog extends Animal{}
class Cat extends Animal{}

public class C03ClassCastException {
	
	public static void changeDog(Animal animal) {
		try {
			Dog down = (Dog)animal;
			System.out.println("DownCasting success..");
		}catch(ClassCastException e) {
			e.printStackTrace();
		}
	
	}
	
	public static void main(String[] args) {
		
		Animal poppi = new Dog();
		Animal tori = new Cat();

		changeDog(tori);	//cat 객체를 애니멀로 업캐스팅 해놓고 갑자기 dog 객체로 다운캐스팅하려고함. //Error !
		changeDog(poppi);
		
	}
}
