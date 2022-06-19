package mathCLI;

public class DIVISION implements tokenInterface{
	private final int type = 4;
	private tokenInterface left;
	private tokenInterface right;
	
	public DIVISION() {
		left = null;
		right = null;
	}
	
	public void addLeaf(tokenInterface l, tokenInterface r) {
		left = l;
		right = r;
	}
	
	@Override
	public int evaluate() {
		return left.evaluate() / right.evaluate();
	}

	@Override
	public int getType() {
		return type;
	}

}
