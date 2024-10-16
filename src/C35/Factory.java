package C35;

public class Factory extends Building implements ICanFly {

	AddOn addOn;

	Factory(){

	}
	void setAddOn(AddOn addOn) {
		this.addOn = addOn;
	}

	@Override
	public void BuildStructure() {
	}


	public void UnderAttack(Unit unit) {
	}

	@Override
	public void move() {
	}

	@Override
	public void Land() {
	}

	@Override
	public void Fly() {
	}



}
