package mathCLI;

public class MULTIPLICATION implements tokenInterface{
	private int type;
	private tokenInterface left;
	private tokenInterface right;
	
	public MULTIPLICATION() {
		type = 3;
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
