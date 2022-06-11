package mathCLI;

public class tokenParser {
	private tokenLexer lex;

	public void setLexer(tokenLexer l) {
		lex = l;
		lex.scanToken();
	}
	
	public tokenInterface parseE() {
		tokenInterface a = parseF();
		
		while(true) {
			if(lex.nextToken != null && lex.nextToken.getType() == 1) {
				PLUS b = new PLUS();
				lex.scanToken();
				tokenInterface c = parseF();
				if(a == null || c == null) {
					return null;
				}
				b.addLeaf(a, c);
				a = b;
				
			}else if(lex.nextToken != null && lex.nextToken.getType() == 2) {
				MINUS b = new MINUS();
				lex.scanToken();
				tokenInterface c = parseF();
				if(a == null || c == null) {
					return null;
				}
				b.addLeaf(a, c);
				a = b;
			}else break;
		}
		return a;
		
	}
	
	public tokenInterface parseF() {
		tokenInterface a = parseT();
		
		while(true) {
			if(lex.nextToken != null && lex.nextToken.getType() == 3) {
				MULTIPLICATION b = new MULTIPLICATION();
				lex.scanToken();
				tokenInterface c = parseT();
				if(a == null || c == null) {
					return null;
				}
				b.addLeaf(a, c);
				a = b;
				
			}else if(lex.nextToken != null && lex.nextToken.getType() == 4) {
				DIVISION b = new DIVISION();
				lex.scanToken();
				tokenInterface c = parseT();
				if(a == null || c == null) {
					return null;
				}
				b.addLeaf(a, c);
				a = b;
			}else break;
		}
		return a;
	}
	
	public tokenInterface parseT() {
		tokenInterface a = null;
		
		if(lex.nextToken == null) {
			return null;
		}else if(lex.nextToken.getType() == 0) {
			a = lex.nextToken;
			lex.scanToken();
		}else if(lex.nextToken.getType() == 5) {
			lex.scanToken();
			a = parseE();
			if(lex.nextToken.getType() != 6) {
				System.out.println("missing parantesis");
				return null;
			}
			lex.scanToken();
			
		}else {
			return null;
		}
		return a;	
	}

}
