package mathCLI;

public class INT implements tokenInterface {
	private final int type = 0;
	private int value;

	public INT(String v) {
		value = Integer.parseInt(v);
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
