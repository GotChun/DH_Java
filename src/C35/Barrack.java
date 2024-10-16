package C35;

public class Barrack extends Building implements ICanFly{

	private Marine marine;
	private Medic medic;


	public Marine GetMarine() {
		return null;
	};


	public Medic GetMedic() {
		return null;
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

	public void BuildStructure() {};
	public void UnderAttack(Unit unit) {};


}
