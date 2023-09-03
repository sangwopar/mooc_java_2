public class Student extends Person{
	private int amount;

	public Student(String name, String address) {
		super(name, address);
		this.amount = 0;
	}
	
	public int credits() {
		return this.amount;
	}

	public void study() {
		this.amount += 1;
	}

	@Override
	public String toString() {
		return super.toString() + "\n  " + "Study credits " + Integer.valueOf(this.credits());
	}
	
}
