package C35;

public class SCV extends Unit {

	public Building building;
	public Factory factory;
	public Barrack barrack;

	void buildFactory() {
		factory = new Factory();		//팩토리 생성
	}

	void buildBarrack() {
		barrack = new Barrack();		//배럭 생성
	}

	@Override
	void move() {
	}

	@Override
	void underAttack(int damage) {
	}





}
