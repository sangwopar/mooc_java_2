public class Hideout<T> {
	private T hide;
	
	public void putIntoHideout(T toHide) {
		this.hide = toHide;
	}

	public T takeFromHideout() {
		T h = this.hide;
		this.hide = null;
		return h;
	}

	public boolean isInHideout() {
		if (this.hide == null) {
			return false;
		}
		return true;
	}
	
}
