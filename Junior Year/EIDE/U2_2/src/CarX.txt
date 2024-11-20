
public class CarX {
	
	private static final int DEFAULT_PRICE = 10000; //Initial car price.
	private int year; //Car year.
	private String mfr; //Car manufacturer.
	private String model; //Car model.
	
	private int price; //Car price.
	
	public CarX (int year, String mfr, String model){		
//		this.year = year;
//		this.mfr = mfr;
//		this.model = model;
//		this.price = DEFAULT_PRICE;
		
		this (year, mfr, model, DEFAULT_PRICE);
	}
	
	public CarX (int year, String mfr, String model, int price){		
		this.year = year;
		this.mfr = mfr;
		this.model = model;
		this.price = price;
	}
	
	public String toString() {
		
		return (" Year = " + year +
				"\n Manufacturer = " + mfr + 
				"\n Model = " + model + 
				"\n Price = " + price);
	}
}
