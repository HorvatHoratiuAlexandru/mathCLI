package mathCLI;

public class INT implements tokenInterface {
	private int type;
	private int value;

	public INT(String v) {
		value = Integer.parseInt(v);
		type = 0;
	}
	@Override
	public int evaluate() {
		return value;
	}

	@Override
	public int getType() {
		return type;
	}

}
