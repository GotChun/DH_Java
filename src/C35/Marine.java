package C35;

public class Marine extends Unit{

	int damageval;   //데미지
	public Gun myGun;    //유닛의 총

	Marine(){
		myGun = new Rifle();	//라이플 객체 추가
	}

	public void setMyGun(Gun gun){
		this.myGun = gun;	//관계 추가
	}

	@Override
	void move() {

	}

	@Override
	void underAttack(int damage) {

	}


	void attack(Unit unit) {  //유닛마다 다른 공격

	}






}
