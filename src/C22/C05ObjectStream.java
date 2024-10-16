package C22;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Date;

class Board implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private int bno;
	private String title;
	private String content;
	private String writer;
	private Date date;
	//모든 인자 생성자
	//게터 세터
	// to스t링
	
	
	public int getBno() {
		return bno;
	}
	public Board(int bno, String title, String content, String writer, Date date) {
		super();
		this.bno = bno;
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.date = date;
	}
	public void setBno(int bno) {
		this.bno = bno;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "Board [bno=" + bno + ", title=" + title + ", content=" + content + ", writer=" + writer + ", date="
				+ date + "]";
	}
	
	
	
}

public class C05ObjectStream {
		
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
//		FileOutputStream out = new FileOutputStream("C:\\TMP_IO\\board.db");
//		ObjectOutputStream oout = new ObjectOutputStream(out);
//		oout.writeObject(new Board(1,"제목","하2","홍길동",new Date()));
//		oout.writeObject(new Board(2,"제목2","하3","박길동",new Date()));
//		oout.flush();
//		oout.close();
//		out.close();
		
		
		FileInputStream in = new FileInputStream("C:\\TMP_IO\\board.txt");
		ObjectInputStream oin = new ObjectInputStream(in);
		
		Object obj = oin.readObject();
		Board down = (Board)obj;
		System.out.println(down);
		Object obj2 = oin.readObject();
		Board down2 = (Board)obj2;
		System.out.println(down2);
		//더 이상 읽을게 없으면 java.io.EOFException 발생
		Object obj3 = oin.readObject();
		Board down3 = (Board)obj3;
		System.out.println(down3);
		
		
		
		
		
		
}
	}