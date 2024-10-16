package C25;

public class C02ThreadMain {

	public static void main(String[] args) throws InterruptedException   {




		// 다중 스레드라는건 여러개의 작동을 한번에 처리하는 거 같은데
		//Runnable Interface 이용한 스레드 분할

		//01 작업스레드 객체 생성
		C02Worker1 w1 = new C02Worker1();
		C02Worker2 w2 = new C02Worker2();

		//02 스레드별 분리
		Thread th1 = new Thread(w1);		//스레드 클래스가 따로 있네
		Thread th2 = new Thread(w2);


		//03 스레드 실행
		th1.start();
		th2.start();

	


		//------------------------
		//Thread 를 이용한 스레드 분

		new Thread() {

			@Override
			public void run() {
				for(int i=0;i<5;i++) {
					System.out.println("TASK03..");
					try {
						Thread.sleep(300);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}

			}


		}.start();

		
		//04 MAIN 스레드 작업
		for(int i=0;i<12;i++) {
			System.out.println("MAIN THREAD..!");
			Thread.sleep(500);
		}

		//신경쓰지마 다른사람 신경쓸 여유없다
	}
}


















//근데 ㅅ신경이 쓰임;;