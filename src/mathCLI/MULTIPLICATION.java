package mathCLI;

public class MULTIPLICATION implements tokenInterface{
	private final int type = 3;
	private tokenInterface left;
	private tokenInterface right;
	
	public MULTIPLICATION() {
		left = null;
		right = null;
	}
	
	public void addLeaf(tokenInterface l, tokenInterface r) {
		left = l;
		right = r;
	}
	
	@Override
	public int evaluate() {
		return left.evaluate() * right.evaluate();
	}

	@Override
	public int getType() {
		return type;
	}

}
