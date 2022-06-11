package mathCLI;
import java.util.Scanner;

public class mathCLI {
	
	static final Scanner SC = new Scanner(System.in);
	
	public static String getInput() {
		System.out.print(">>>");
		return SC.nextLine();
	}
	
	public static void main(String[] args) {
		boolean CLI = true;
		tokenLexer lexer = new tokenLexer();
		tokenParser parser = new tokenParser();
		tokenInterface tokenTree = null;
		
		while(CLI) {
			String expression = getInput();
			lexer.setExpression(expression);
			if(lexer.valid()) {
				parser.setLexer(lexer);
			}
			tokenTree = parser.parseE();
			if(tokenTree == null) {
				System.out.println("Error");
			}else {
				System.out.println("result:" + tokenTree.evaluate());
			}	
		}
	}

}
