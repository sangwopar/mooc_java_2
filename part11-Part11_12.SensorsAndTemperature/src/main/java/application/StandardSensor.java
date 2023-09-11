package application;

public class StandardSensor implements Sensor{
	private int num;

	public StandardSensor(int num) {
		this.num = num;
	}

	@Override
	public boolean isOn() {
		return true;
	}

	@Override
	public int read() {
		return num;
	}

	@Override
	public void setOff() {
		
	}

	@Override
	public void setOn() {
		
	}
	
}
