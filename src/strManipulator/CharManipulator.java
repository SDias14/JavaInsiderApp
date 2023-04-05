package strManipulator;

public interface CharManipulator {
	
	default String upper(String s) {
		return getChar() + s.substring(1); 
	}
	
	// used locally
	private char getChar() {
		return '*';
	}

}
