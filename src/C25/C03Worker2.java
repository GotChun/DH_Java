package C25;

public class C03Worker2 implements Runnable {

	C03GUI gui;


	C03Worker2(C03GUI gui){
		this.gui = gui;		//객체 연결
	}


	@Override
	public void run() {



	while(true) {
		try {
		gui.area2.append("TASK02...\n");
		
			Thread.sleep(500);

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			break;
		}
	}
	}

}





//옆사람 신경쓰지마 !