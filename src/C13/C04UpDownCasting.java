package C13;

class Super{
	int n1;
}
class Sub extends Super{
	int n2;
}
public class C04UpDownCasting {

	public static void main(String[] args) {
		//NOcasting
		Super ob1 = new Super();
		ob1.n1=100;
		Sub ob2 = new Sub();
		ob2.n1=300;
		ob2.n2=200;
		System.out.println(ob2.n1);	//200번지의 n1
		System.out.println(ob1.n1);	//100번지의 n1

		Super ob3 = new Sub();  //상위클래스형 참조변수는 자기가 알고있는 범위까지만 접근 가능하기 때문에 ob3은 Sub의 멤버인 n2에는 접근할 수 없음.
		Super ob4 = ob2;	//	ob4는 super클래스를 참조해서 업캐스팅이 된 상태 , 그렇다고 같은 sub객체인 ob2가 업캐스팅이 된것은 아님 !
		ob4.n1 = 500;
		System.out.println(ob4.n1);
		System.out.println(ob2.n1); //같은 500이네
		//


		//DownCasting : (하위클래스형 참조변수 = 상위클래스형 객체),강제형변환
		//업캐스팅을 전제로 확장된(추가된) 멤버에 접근하기 위해 사용
//		Sub ob5 = new Super(); //이렇게 하면 Super클래스의 객체인 ob5가 자식클래스인 Sub 클래스를 참조하려 하니 찾을 수 없어서 메모리에 문제가 생길수도 있음.
			//그래서 다운캐스팅을 해줘야함!
//		Sub ob5 = (Sub)new Super(); //잘못된 다운캐스팅
		
		Sub down = (Sub)ob3;
		down.n1=10;
		System.out.println(down.n1);
		ob3.n1=20;
		System.out.println(ob3.n1);		//ob3 와 down 은 같은 메모리 주소값? 이기 때문에 둘다 20이 나오는 모습
		System.out.println(down.n1);
	}
}
