package C31;

interface Printer{
//	void print(String message);
	String print(String message);	
//	String print();
}


public class C02Lamda {

	public static void main(String[] args) {

		//01
//		Printer printer = (message)->{System.out.println(message);};	//인터페이스에서 미완성된 함수와 연결
//		printer.print("Helloworld");	//void라 노 리턴
//
		//02
//		Printer printer = (message)->{	//message 를
//			return message;		//리턴형 만들기
//		};	//
//		String msg = printer.print("TEST");
//		System.out.println(msg);

			
		Printer printer = (message)-> message + "!!!";;		//라인이 하나밖에 없다면 리턴을 하는거나 마찬가지이다.
		String msg = printer.print("TEST");
		System.out.println(msg); 	



	}
}
