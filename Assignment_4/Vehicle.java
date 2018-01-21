package Assignment_4;

public abstract class Vehicle {
	private Manufacturer manufacturer;
	private String color;
	private Engine engine;
	
	public float getConsumption() {
		return 0;
	}

	public abstract float getEmission();
}
