package C09;

//this
//클래스 내에서 사용되는 예약어
// 생성되는 객체의 위치정보(메모리주소 - 해시코드값)을 확인하는데 사용

//this : 멤버변수와 지역변수 구별에 사용
// this : 다른생성자 호출 사용
class C04Simple{
	int x;
	int y;
	C04Simple(){
//		this.x = 0;
//		this.y = 0;
		this(0,0);
	}
	C04Simple(int x){
//		this.x = 0;
//		this.y = 0;
		this(x,0);
		System.out.println("힛미힛미업");
		
	}
	C04Simple(int x,int y){
		System.out.println("언제든 데이 앤 라이트");
//		this.x = 0;
//		this.y = 0;

	}
	C04Simple getThis() {
	return this;
	}
	
}
public class C04this {
	
	public static void main(String[] args) {
		C04Simple ob = new C04Simple();
		
		System.out.println(ob);
		
		
		
		
		
		
		
		
		
			
		
	}
	
}
