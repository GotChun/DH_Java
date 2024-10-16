package C25;

public class C02Worker1 implements Runnable{

	
	
	@Override
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("TASK01...");
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}			//0.5초 딜레이 뭐를 반복문을ㅇㅇ  반복문의 딜레이가 0.5초
		}
	}
}


















//근데 ㅅ신경이 쓰임;;