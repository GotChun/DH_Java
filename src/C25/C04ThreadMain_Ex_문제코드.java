package C25;

class IncrementThread implements Runnable {
	private static int counter = 0;

	// lock object 설정(임계영역 접근 여부를 판단한느 기준)
	private static final Object Lock = new Object();

	public int getCounter() {
		return counter;
	}

	@Override
	public void run() {
		for (int i = 0; i < 50000; i++) {

			// 임계영역 지정 - 하나의 스레드가 들어오면 다른스레드의 접근이 제한되는 영역
			synchronized (Lock) {
				counter++; // 공유변수값증가
				System.out.println(Thread.currentThread().getName() + "s counter : " + counter);

//				Lock.notifyAll(); // 다른곳으로 점유 권한 양보

				if (i < 99999) { // 그 다음동작
					try {
						Lock.notifyAll(); // 다른곳으로 점유 권한 양보
						Lock.wait(3); // 다른스레드가 1증하고 나올때 까지 잠깐 대기
						
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} // i 가 99999이하(반복문을 안 벗어날 때) 잠깐 대기
				}

			}
		}
	}
}

public class C04ThreadMain_Ex_문제코드 { // 아직 임계설정을 잡아주지 않은 상태. 임계설정이란 ? 한 공간을 같이 공유해야 하는 경우에는 작업시간을 분리해서 해야 값에 혼동이 생기지
										// 않음
	// 임계설정 안하면 중간에 동시접근하는 문제가 생길수도 있음
	public static void main(String[] args) throws InterruptedException {

		IncrementThread incrementThread1 = new IncrementThread();
		IncrementThread incrementThread2 = new IncrementThread();
		IncrementThread incrementThread3 = new IncrementThread();

		Thread thread1 = new Thread(incrementThread1);
		Thread thread2 = new Thread(incrementThread2);
		Thread thread3 = new Thread(incrementThread3);

		thread1.setName("TH1");
		thread2.setName("TH2");
		thread3.setName("TH3");

		thread1.start();
		thread2.start();
		thread3.start();

		// 메인 스레드가 thread1,thread2의 작업이 모두 완료될 때까지 대기하도록 설정
		thread1.join(); //
		thread2.join();
		thread3.join();

		System.out.println("Final value: " + incrementThread1.getCounter());

	}
}