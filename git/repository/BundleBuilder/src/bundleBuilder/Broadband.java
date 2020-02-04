package bundleBuilder;

public class Broadband extends Product {
	
		int speed;

	public Broadband(double mp, String n, String t, int s) {
		super(mp, n, t);
		
		speed = s;
	}
	
	public int getSpeed() {
		return this.speed;
	}

}
