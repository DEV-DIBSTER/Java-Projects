
public class CarY {
	
	private static final int DEFAULT_PRICE = 10000; //Initial car price.
	private int year; //Car year.
	private String mfr; //Car manufacturer.
	private String model; //Car model.
	
	private int price; //Car price.
	
	public CarY (int year, String mfr, String model){		
//		this.year = year;
//		this.mfr = mfr;
//		this.model = model;
//		this.price = DEFAULT_PRICE;
		init (year, mfr, model, DEFAULT_PRICE);
	}
	
	public CarY (int year, String mfr, String model, int price){		
//		this.year = year;
//		this.mfr = mfr;
//		this.model = model;
//		this.price = price;
		init (year, mfr, model, price);
	}
	
	private void init (int year, String mfr, String model, int price){
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
