package C25;

public class C03Worker1 implements Runnable{

	C03GUI gui;


	C03Worker1(C03GUI gui){
		this.gui = gui;		//객체 연결
	}


	@Override
	public void run() {
	

	
	while(true) {
		try {
		gui.area1.append("TASK01...\n");
		
			Thread.sleep(500);
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			break;	//예외가 일어날 시 종료
		}
	}
	}


}
