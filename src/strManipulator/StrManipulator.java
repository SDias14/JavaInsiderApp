package strManipulator;

public interface StrManipulator {
	
	String join(String s1, String s2);
	
	String takeFirst(String s, int length);
	
	//belongs to instances
	default String upper(String s) {
		return s.toUpperCase();
	}
	
	// belongs to the interface
	static String lower(String s) {
		
		return s.toLowerCase();
		
	}

}
