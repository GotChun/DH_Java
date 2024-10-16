package C29;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

class Sample{
	String name;
	int age;
	String addr;
	@Override
	public String toString() {
		return "Sample [name=" + name + ", age=" + age + ", addr=" + addr + "]";
	}


}
public class C01Basic {

	public static void main(String[] args) throws Exception {

//		System.out.println(Sample.class);

		Class<?> clazz = Class.forName("java.lang.String");		


		//모든 field 확인
//		Field[] fields = clazz.getDeclaredFields();	//
//		for(Field field : fields) {			//클래스 필드의 모든 멤버 확인
//			System.out.println(field);
//		}

		//모든 생성자 확인
//		Constructor[] constructor =clazz.getDeclaredConstructors();
//		for(Constructor con : constructor){
//		System.out.println(con);			//생성자들 출력
//		}

		//모든 메서드 확인
		Method[] methods = clazz.getDeclaredMethods();
		for(Method met : methods) {		//향상된 for 문
			System.out.println(met);
		}



	}
}
