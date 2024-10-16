package C24;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class C02Client {

	public static void main(String[] args) throws UnknownHostException, IOException {
		
		
		
		
		Socket server = new Socket("192.168.5.21",9000);
		
		DataInputStream din = new DataInputStream(server.getInputStream());
		DataOutputStream dout = new DataOutputStream(server.getOutputStream());
		
		Scanner sc = new Scanner(System.in);
		String send = null;
		String recv = null;
		
		while(true) {
			
			//수신
			recv = din.readUTF();
			if(recv==null || recv.equals('q'))
				break;
			System.out.println("[CLIENT] : " + recv);
			// 송신
			System.out.print("[ME(q:종료)] : ");
			send = sc.nextLine();
			dout.writeUTF(send);
			dout.flush();
			if(send.equals('q'))
				break;
			
		}
		recv = din.readUTF();
		System.out.println("ㅎㅇ  : " + recv);


	}
}
