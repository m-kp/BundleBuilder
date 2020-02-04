package bundleBuilder;

public abstract class Product {
	
	private double monthlyPrice;
	private String name;
	private String type;
	
	public Product(double mp, String n, String t) {
		
		monthlyPrice = mp;
		name = n;
		type = t;
		
	}
	
	public String getName() {
		return this.name;
	}
	
	public double getPrice() {
		return this.monthlyPrice;
	}
	
	public String getType() {
		return this.type;
	}

}
