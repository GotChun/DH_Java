package C06;

public class C02Switch {

	public static void main(String[] args) {
		char num = 'G';
		int ranking = 2;
		char medalColor;
		switch(ranking) {
			
		case 1:			//if			//연산처리 조건문 사용할 수 없음
			medalColor = 'G';
			System.out.println("메달색상 : G");
			break;
		case 2:		//else if
			medalColor = 'S';
			System.out.println("메달색상 : S");
			break;
		case 3:		//else if
			medalColor = 'B';
			System.out.println("메달색상 : B");
			break;
		default:		//이게 else 
			medalColor = 'C';
			System.out.println("메달색상 : C");
		}
		System.out.printf("%d 등 메달의 색은 %s 입니다.\n",ranking,medalColor);
		System.out.println(num);
		
		
		
		
		
		
		
		
		
		
	}
}
