package application;

import java.util.ArrayList;
import java.util.List;

public class AverageSensor implements Sensor{
	private List<Sensor> sensors = new ArrayList<>();
	private List<Integer> history = new ArrayList<>();

	public void addSensor(Sensor toAdd) {
		this.sensors.add(toAdd);
	}

	@Override
	public boolean isOn() {
		for (Sensor sensor : sensors) {
			if (!sensor.isOn()) {
				return false;
			}
		}
		return true;	
	}

	@Override
	public int read() {
		if (sensors.isEmpty() || !isOn()) {
			throw new IllegalArgumentException();
		}
		Integer avg = (int) sensors.stream().mapToInt(s -> s.read()).average().getAsDouble();
		history.add(avg);
		return avg;
	}

	@Override
	public void setOff() {
		sensors.stream().forEach(s -> s.setOff());
	}

	@Override
	public void setOn() {
		sensors.stream().forEach(s -> s.setOn());
	}

	public List<Integer> readings() {
		return this.history;
	}
	
	
}
