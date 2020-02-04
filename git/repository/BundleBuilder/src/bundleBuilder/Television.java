package bundleBuilder;

public class Television extends Product {
	
	int numberOfChannels;

	public Television(double mp, String n, String t, int c) {
		super(mp, n, t);
		
		numberOfChannels = c;
	}
	
	public int getNumberOfChannels() {
		return this.numberOfChannels;
	}

}
