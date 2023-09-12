public class List<T> {
	private T[] values;
	private int firstFreeIndex;

	public List() {
		this.values = (T[]) new Object[10];
		this.firstFreeIndex = 0;
	}

	public void add(T value) {
		if (firstFreeIndex == this.values.length) {
			this.grow();
		}
		this.values[firstFreeIndex] = value;
		this.firstFreeIndex++;
	}
	
	public boolean contains(T value) {
		return this.indexOf(value) >= 0;
	}
	
	public void remove(T value) {
		int index = indexOf(value);
		if (indexOf(value) < 0) {
			return;
		}
		moveToTheLeft(index);
		this.firstFreeIndex--;
	}

	public T value(int index) {
		if (index < 0 || index >= this.firstFreeIndex) {
			throw new ArrayIndexOutOfBoundsException("index" + index + " outside of [0, " + this.firstFreeIndex + "]");
		}

		return this.values[index];
	}
	
	public int size() {
		return this.firstFreeIndex;
	}
	
	private void moveToTheLeft(int fromIndex) {
		for (int i= fromIndex; i<this.firstFreeIndex - 1; i++) {
			this.values[i] = this.values[i + 1];
		}
	}

	public int indexOf(T value) {
		for (int i=0; i<values.length; i++) {
			if (values[i].equals(value)) {
				return i;
			}
		}
		return -1;
	}

	private void grow() {
		int newSize = this.values.length + this.values.length / 2;
		T[] newValues = (T[]) new Object[newSize];
		for (int i=0; i<this.values.length; i++) {
			newValues[i] = this.values[i];
		}
		this.values = newValues;
	}

}
