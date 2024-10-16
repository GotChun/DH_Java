package C35;

public abstract class Gun {

	int bulletCnt;
	int power;
	abstract void fire(Unit unit);
	abstract void reload(int bullet);



}
