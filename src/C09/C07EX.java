package C09;

import java.util.Arrays;

import C00.C01System_out;

class Profile{
	//속성
	private String name;
	private String addr;
	private String job;
	private String major;
	//생성자
	//1)디폴트생성자 삽입
	Profile(){}
	//2)모든 인자 받는 생성자 삽입 -> 각멤버에 대입
	Profile(String name,String addr,String job,String major){
		this.name=name;
		this.addr=addr;
		this.job=job;
		this.major=major;
		}
	//3)모든 인자 받는 생성자 삽입(가변인자사용할것) -> , 를기준으로 잘라내어 각속성에 저장		//일단 split 쓰는건 알겠어 알겠는데,,
	//ex, "홍길동,대구,프로그래머,컴퓨터공학" ->[홍길동,대구,프로그래머,컴퓨터공학]

	Profile(String...strings){
		this.name = strings[0];
		this.addr = strings[1];
		this.job = strings[2];
		this.major = strings[3];
//		   System.out.println(Arrays.toString(strings));		이건근데 정답이아님
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}

	public String toString() {
		return "이름 :"+name+" 주소:"+addr+" 직업:"+job+" 인종:"+major;
	}
	//기능
	//1) 속성은 private으로 설정, getter and setter 삽입
	//2) toString  재정의
	//3) boolean isContain(String findstr) 함수 완성하기
	boolean isContain(String findstr) {
		//findstr의 문자열이 각멤버인 name,addr,job,major 중 하나라도 포함되어 있으면 true 리턴
		//아니면 false 리턴
		if(name.contains(findstr))
			return true;
		else if(addr.contains(findstr))
			return true;
		else if(job.contains(findstr))
			return true;
		else if(major.contains(findstr))
			return true;
		return false;
	}
	//4)
	boolean isEquals(String str) {
		String args[] = str.split(",");
		if(this.name.equals(args[0])&&
				this.addr.equals(args[1])&&
				 )
		//all로 받은 문자열을 , 단위로 잘라내어(split(",")) 각각 나눠진 문자열이
		//name,addr,job,major 와 일치 하면 true
		//아니면 false 를 리턴
		return false;
	}

}


public class C07EX {

	public static void main(String[] args) {
		Profile hong = new Profile("홍길동","대구","프로그래머","컴퓨터공학");		//이거는 잘못됐고 가변인자를 안쓰고 풀거나 가변인자를 쓸거면 변수 하나하나당 ""로 묶어야함
		System.out.println(hong.toString());
		System.out.println("길동 포함여부 : " + hong.isContain("길동"));	//true
		System.out.println("컴퓨터 포함여부 : " + hong.isContain("컴퓨터"));	//true
		System.out.println("프로필 일치여부 : " + hong.equals("홍길동,대구,프로그래머,컴퓨터공학"));//false
		System.out.println("프로필 일치여부 : " + hong.equals("홍길동,울산,프로그래머,컴퓨터공학"));//false

	}

}