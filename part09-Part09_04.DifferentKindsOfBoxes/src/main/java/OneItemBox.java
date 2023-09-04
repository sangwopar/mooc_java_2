public class OneItemBox extends Box{

	private Item item;
	

	public OneItemBox() {
	}
	
	@Override
	public void add(Item item) {
		if (this.item == null) {
			this.item = new Item(item.getName(), item.getWeight());
		}
		
	}

	@Override
	public boolean isInBox(Item item) {
		if (this.item == null) {
			return false;
		}
		if (this.item.equals(item)) {
			return true;
		}
		// TODO Auto-generated method stub
		return false;
	}
	
	
	
}
