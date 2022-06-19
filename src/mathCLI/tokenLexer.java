package mathCLI;

public class tokenLexer {
	private int pos;
	private String expression;
	public tokenInterface nextToken;

	private tokenInterface checkToken() {
		
		if(expression.charAt(pos) == '+') {
			pos++;
			return new PLUS();
			
		}else if(expression.charAt(pos) == '-'){
			pos++;
			return new MINUS();
		}else if(expression.charAt(pos) == '*'){
			pos++;
			return new MULTIPLICATION();
		}else if(expression.charAt(pos) == '/'){
			pos++;
			return new DIVISION();
		}else if(expression.charAt(pos) == '('){
			pos++;
			return new leftP();
		}else if(expression.charAt(pos) == ')'){
			pos++;
			return new rightP();
		}else if(expression.charAt(pos) >= '0' && expression.charAt(pos) <= '9') {
			int INTbegining = pos;
			while(expression.charAt(pos) >= '0' && expression.charAt(pos) <= '9') {
				pos++;
				if(pos > expression.length() - 1) {
					break;
				}
			}
			return new INT(expression.substring(INTbegining, pos));		
		} else {
			System.out.println("Invalid Term");
			return null;
		}
		
	}
	
	public boolean valid() {
		if(expression == null) {
			return false;
		}else return true;
	}
	
	private void skipSpaces() {
		while(expression.charAt(pos) == ' ') {
			pos++;
		}
	}
	public void setExpression(String s) {
		expression = s;
		nextToken = null;
		pos = 0;
	}
	
	public void scanToken() {
		
		if(expression.length() - 1 >= pos) {
			skipSpaces();
			nextToken = checkToken();
		}else {
			nextToken = null;
		}
		
	}
	
	
	
}
