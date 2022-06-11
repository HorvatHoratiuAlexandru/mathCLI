package mathCLI;

public class PLUS implements tokenInterface{
	private int type;
	private tokenInterface left;
	private tokenInterface right;
	
	public PLUS() {
		type = 1;
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
