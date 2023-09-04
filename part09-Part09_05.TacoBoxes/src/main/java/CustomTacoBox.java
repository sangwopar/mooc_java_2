public class CustomTacoBox implements TacoBox{
	private int tacos;

	public CustomTacoBox(int tacos) {
		this.tacos = tacos;
	}

	@Override
	public void eat() {
		if (tacos > 0) {
			tacos -= 1;
		}
	}

	@Override
	public int tacosRemaining() {
		return this.tacos;
	}
	
	
}
