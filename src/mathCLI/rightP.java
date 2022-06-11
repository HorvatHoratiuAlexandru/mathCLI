package mathCLI;

public class rightP implements tokenInterface{
	private int type;

	
	public rightP() {
		type = 6;
	}
	
	
	@Override
	public int evaluate() {
		return 0;
	}

	@Override
	public int getType() {
		return type;
	}

}
