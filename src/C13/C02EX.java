package C13;

class TV{
	int size;

	TV(int size){
		this.size = size;
	}
}

class ColorTV extends TV{
	int color;

	ColorTV(int size,int color){	//여기서 사이즈는 상속받은 size
		super(size);		//super로 부모 클래스 size 상속받음
		this.color = color;
	}

	public void printProperty() {
		System.out.printf("TV 사이즈 : %d TV 해상도 : %d",size,color);
	}

}
public class C02EX {

	public static void main(String[] args) {
		ColorTV myTV = new ColorTV(32,1024);
		myTV.printProperty();
	}
}
