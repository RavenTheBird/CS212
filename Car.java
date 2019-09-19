public class Car {
	private String make;
	private String model;
	private int year;
	private int miles;

	@Override
	public String toString() { // toString method to convert hexa code to string
		return make + " " + model + " " + year + " " + miles + " ";
	}

	public Car(String make, String model, int year, int miles) {
		super();
		this.make = make;
		this.model = model;
		this.year = year;
		this.miles = miles;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return this.model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getMiles() {
		return miles;
	}

	public void setMiles(int miles) {
		this.miles = miles;
	}

}
