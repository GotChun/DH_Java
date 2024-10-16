package C29;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

class Simple {
	String name;
	int age;
	String addr;

	Simple() {
	};

	Simple(String name) {
		this.name = name;}

	Simple(String name, int age) {
		this.name = name;
		this.age = age;
	}; // 메소드 오버로딩

	Simple(String name, int age, String addr) {
		this.name = name;
		this.age = age;
		this.addr = addr;
	}

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
		return "Simple [name=" + name + ", age=" + age + ", addr=" + addr + "]";
	}

}

public class C02Basic {
	public static void main(String[] args) throws ClassNotFoundException, Exception, SecurityException {

		System.out.println(Simple.class);
		Class<?> clazz = Class.forName(String.valueOf(Simple.class).split(" ")[1]);
		Method method = clazz.getDeclaredMethod("getAge", null);
		Object result = method.invoke(new Simple(), null);
		System.out.println(result);

		// 생성자		리플렉트로 생성자 사용하기
//		Constructor<?> constructor =clazz.getConstructor(String.class); // 인자 1개 받는 생성자
//		System.out.println(constructor);
		Object obj = constructor.newInstance("홍길동");
		System.out.println(obj);

		//리플렉트로 필드에 값넣기
		Field field = clazz.getDeclaredField("addr");
		field.set(ob, "대구");
		System.out.println(ob);


	}

}