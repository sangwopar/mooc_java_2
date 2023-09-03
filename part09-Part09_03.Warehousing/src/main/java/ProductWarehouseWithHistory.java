public class ProductWarehouseWithHistory extends ProductWarehouse{
	private ChangeHistory changeHistory;

	public ProductWarehouseWithHistory(String productName, double capacity,
		double initalBalance) 
	{
		super(productName, capacity);
		this.changeHistory = new ChangeHistory();
		addToWarehouse(initalBalance);
	}

	public String history() {
		return changeHistory.toString();
	}
	
	public void addToWarehouse(double amount) {
		super.addToWarehouse(amount);
		changeHistory.add(super.getBalance());
	}

	public double takeFromWarehouse(double amount) {
		double result = super.takeFromWarehouse(amount);
		changeHistory.add(super.getBalance());
		return result;
	}

	public void printAnalysis() {
		System.out.println("Product: " + super.getName());
		System.out.println("History: " + this.history());
		System.out.println("Largest amount of product: " + changeHistory.maxValue());
		System.out.println("Smallest amount of product: " + changeHistory.minValue());
		System.out.println("Average: " + changeHistory.average());
	}
}
