package C27;

import java.io.DataInputStream;
import java.net.Socket;

import zmq.ZError.IOException;

public class ServerRecvThread implements Runnable{

	Sgui sgui;
	Socket client;
	DataInputStream din;
	public ServerRecvThread(Sgui sgui, Socket client) {
		// TODO Auto-generated constructor stub
		this.sgui = sgui;
		this.client = client;
	}

	@Override					//unimplements method 구현안된 메소드 구현하는 단축키
	public void run() {
		try {
		din = new DataInputStream(client.getInputStream());
		String recv = null;
		while(true) {
			recv = din.readUTF();
			if(recv.equals('q') || recv==null)
				break;
			sgui.area.append("[CLIENT] " + recv + "\n");

		}System.out.println("서버 수신 종료");
		sgui.area.append("[CLIENT] 와의 연결을 종료합니다.");

		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}



}
