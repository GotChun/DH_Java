package C13;

class park1{
	int i;
}
class park2 extends park1{
	int j;
}
class park3 extends park2{
	int k;
}
class park4 extends park2{
	int u;
}
public class C07EX {
	public static void main(String[] args) {
		park1 son = new park4();
		System.out.println(son instanceof park1); //park 1 이나 park4 둘다 true

	}
}
