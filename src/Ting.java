
public class Ting extends Animal{


	public Ting(String name) {
		super(name);
	}

	@Override
	public String getSound() {
		return "SKRRAHH!";
	}

	@Override
	public boolean hasWings() {
		return false;
	}

	@Override
	public int getNumLegs() {
		return 0;
	}
}
