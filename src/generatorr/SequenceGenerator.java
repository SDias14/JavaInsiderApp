package generatorr;

public class SequenceGenerator implements Generator{
	
	private int current = 0;
	
	@Override
	public int next() {
		return ++current;
		
	}

}
