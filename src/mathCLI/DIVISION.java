package mathCLI;

public class DIVISION implements tokenInterface{
	private int type;
	private tokenInterface left;
	private tokenInterface right;
	
	public DIVISION() {
		type = 4;
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
