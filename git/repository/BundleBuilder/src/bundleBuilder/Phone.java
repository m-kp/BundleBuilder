package bundleBuilder;

public class Phone extends Product {
	
	private String freeCallTimes;
	private double costPerMinute;

	public Phone(double mp, String n, String t, String f, double pm) {
		super(mp, n, t);
		
		freeCallTimes = f;
		costPerMinute = pm;
	}
	
	public double getCostPerMinute() {
		return this.costPerMinute;
	}
	
	public String getFreeCallTimes() {
		return this.freeCallTimes;
		
	}

}
