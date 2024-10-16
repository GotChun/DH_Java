package C26;

import java.io.DataInputStream;
import java.net.Socket;

public class ClientMain {

	public static void main(String[] args) throws Exception {

		Socket server = new Socket("192.60.5.50",9000);

		//
		ClientRecvThread recv = new ClientRecvThread(server);
		ClientRecvThread send= new ClientRecvThread(server);

		Thread th1 = new Thread(recv);
		Thread th2 = new Thread(send);

		th1.start();
		th2.start();

		th1.join();
		th2.join();






	}
}
