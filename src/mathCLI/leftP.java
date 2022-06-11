package mathCLI;

public class leftP implements tokenInterface{
	private int type;

	
	public leftP() {
		type = 5;
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
