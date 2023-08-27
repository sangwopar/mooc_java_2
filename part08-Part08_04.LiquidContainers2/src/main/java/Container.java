public class Container {
	private int liquid;
	private int maxLiquid;

	public Container() {
		this.liquid = 0;
		this.maxLiquid = 100;
	}

	public int contains() {
		return this.liquid;
	}

	public void add(int amount) {
		if (amount < 0) {
			return;
		}
		this.liquid += amount;
		if (this.liquid > maxLiquid) {
			this.liquid = maxLiquid;
		}
	}

	public void remove(int amount) {
		if (amount < 0) {
			return;
		}
		this.liquid -= amount;
		if (this.liquid < 0) {
			this.liquid = 0;
		}
	}

	public String toString() {
		return this.liquid + "/100";
	}

}
