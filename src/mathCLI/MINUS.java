package mathCLI;

public class MINUS implements tokenInterface{
	private int type;
	private tokenInterface left;
	private tokenInterface right;
	
	public MINUS() {
		type = 2;
		left = null;
		right = null;
	}
	
	public void addLeaf(tokenInterface l, tokenInterface r) {
		left = l;
		right = r;
	}
	
	@Override
	public int evaluate() {
		return left.evaluate() - right.evaluate();
	}

	@Override
	public int getType() {
		return type;
	}

}
