package C09;
class person{
	private String myname;
	private String name;
	private String addr;
	person(String...strings){
		this.myname = myname;
		this.name=name;
		this.addr = addr;
	}
}
public class prac {

	public static void main(String[] args) {
		person ps = new person("대해,길동,선규");
		System.err.println();
		System.out.println(ps);
	}

}
