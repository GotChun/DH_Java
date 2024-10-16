package C15;
import java.util.Scanner;
//다음은 단위를 변환하는 추상 클래스 Converter이다.
abstract class Converter{
	 abstract protected double convert(double src);
	 abstract protected String getSrcString();
	 abstract protected String getDestString();
	 protected double ratio;
	 public void run() {
		 Scanner scanner = new Scanner(System.in);
		 System.out.println(getSrcString()+"을 "+getDestString()+"로 바꿉니다.");
	      System.out.print(getSrcString()+"을 입력하세요>> ");
	      double val = scanner.nextDouble();
	      double res = convert(val);
	      System.out.println("변환 결과: "+res+getDestString()+"입니다");
	      scanner.close();
	 }
}
class Won2Dollar extends Converter{
	Won2Dollar(){
		
	}
}
//[3번] Converter 클래스를 상속받아 원화를 달러로 변환하는 Won2Dollar 클래스를 작성하라. main() 메소드와 실행 결과는 다음과 같다.
//
//public static void main(String args[]) {
//   Won2Dollar toDollar = new Won2Dollar(1200); // 1달러는 1200원
//   toDollar.run();
//}
//원을 달러로 바꿉니다.
//원을 입력하세요>> 24000
//변환 결과: 20.0달러입니다
public class C04EX {

	public static void main(String[] args) {
		
	}
}
