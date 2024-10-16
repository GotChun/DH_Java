package C25;

public class C01ThreadMain {

	public static void main(String[] args) throws InterruptedException {


		//싱글 스레드 : 하나의 흐름으로 흘러가는것 
		for(int i=0;i<5;i++) {
			System.out.println("TASK01...");
			Thread.sleep(500);			//0.5초 딜레이 뭐를 반복문을ㅇㅇ  반복문의 딜레이가 0.5초
		}

		for(int i=0;i<5;i++) {
			System.out.println("TASK02...");
			Thread.sleep(500);
		}













	}
}



// 남 신경쓸 시간이 없다 