
public class BathingApe extends Animal {


	public BathingApe(String name) {
		super(name);
	}

	@Override
	public String getSound() {
		return "gibber";
	}

	@Override
	public boolean hasWings() {
		return false;
	}

	@Override
	public int getNumLegs() {
		return 2;
	}
}


