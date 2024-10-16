package C16;

import java.util.Objects;

class C03Simple{
	private int id;
	C03Simple(int id){
		this.id = id;
	}
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof C03Simple) {
			C03Simple down = (C03Simple)obj;
			this.id=down.id;
		}
		return false;
	}
	
	
}
public class C03ObjectHashCode {
	
	public static void main(String[] args) {
		C03Simple ob1 = new C03Simple(1);
		System.out.println(ob1);	//toString	,,hashCode 값을 integer 로 변환하는거임
		System.out.printf("%x\n",ob1.hashCode());
		
		C03Simple ob2 = new C03Simple(2);
		System.out.println(ob2);	//toString	,,hashCode 값을 integer 로 변환하는거임
		System.out.printf("%x\n",ob2.hashCode());
		
		C03Simple ob3 = new C03Simple(3);
		System.out.println(ob3);	//toString	,,hashCode 값을 integer 로 변환하는거임
		System.out.printf("%x\n",ob3.hashCode());
		
		System.out.printf("%x\n",System.identityHashCode(ob1));
		System.out.printf("%x\n",System.identityHashCode(ob2));
		System.out.printf("%x\n",System.identityHashCode(ob3));
//		System.out.println(System.identityHashCode(ob2));
//		System.out.println(System.identityHashCode(ob3));
	}
}
