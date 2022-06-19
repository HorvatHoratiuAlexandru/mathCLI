package mathCLI;

public class PLUS implements tokenInterface{
	private final int type = 1;
	private tokenInterface left;
	private tokenInterface right;
	
	public PLUS() {
		left = null;
		right = null;
	}
	
	public void addLeaf(tokenInterface l, tokenInterface r) {
		left = l;
		right = r;
	}
	
	@Override
	public int evaluate() {
		return left.evaluate() + right.evaluate();
	}

	@Override
	public int getType() {
		return type;
	}

}
