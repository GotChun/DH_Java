package C26;

import java.io.DataInputStream;
import java.net.Socket;

public class ClientRecvThread implements Runnable{

	Cgui cgui;
	Socket server;
	DataInputStream din;





	public ClientRecvThread(Cgui cgui, Socket server) {
		// TODO Auto-generated constructor stub
		this.cgui = cgui;
		this.server = server;
	}



	@Override
	public void run() {


		try {
			din = new DataInputStream(client.getInputStream());
			String recv = null;
			while(true) {
				recv = din.readUTF();
				if(recv.equals("q")||recv==null)
					break;
					System.out.println("[CLIENT]"+ recv);
			}

			System.out.println("[INFO ]수신 종료합니다");

		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
