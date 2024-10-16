package C11;

class C01Simple{
	static int num1;		//공유메모리영역(클래스,메서드영역) 에 할
	int num2;

	C01Simple(){
		this.num1=0;
		this.num2=0;
	}

	public String toString{
		return "C01Simple[num=" + num1 +",num2+"]";

	}
}


public class C01StaticMain {

public static void main(String[] args) {
	C01Simple = num1=100;
	System.out.println("num1 : "+ C01Simple.num1);
	 C01Simple ob1 = new C01Simple();
	 C01Simple ob2 = new C01Simple();
	 ob1.num1=123;
	 System.out.println("num1 :" + C01Simple.num1);
	System.out.println("ob1's num :" + ob1.num1);
	System.out.println("ob1's num :"  + ob1.num1);

}

}
