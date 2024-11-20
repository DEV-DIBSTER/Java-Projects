
public class CarMore {
	
	private static final int DEFAULT_PRICE = 10000; //Initial car price.
	private static final int DEFAULT_SPEED = 0; //Initial car speed.
	private static final int DELTA_SPEED = 10; //Delta Speed.
	private static final int MAX_SPEED = 100; //The max speed car.
	
	private int year; //Car year.
	private String mfr; //Car manufacturer.
	private String model; //Car model.
	private int price; //Car price.
	private int speed; //Car speed.
	
	public CarMore (int year, String mfr, String model){		
		init (year, mfr, model, DEFAULT_PRICE, DEFAULT_SPEED);
	}
	
	public CarMore (int year, String mfr, String model, int price){		

		init (year, mfr, model, price, DEFAULT_SPEED);
	}
	
	private void init (int year, String mfr, String model, int price, int speed){
		this.year = year;
		this.mfr = mfr;
		this.model = model;
		this.price = price;
		this.speed = speed;
	}
	
	public void accelerate () {
		if (speed < MAX_SPEED) {
			speed = speed + DELTA_SPEED;
		}
	}
	
	public void brake (){
		if (speed > DEFAULT_SPEED) {
			speed = speed - DELTA_SPEED;
		}
	}
	
	public int getSpeed (){
		return speed;
	}
	
	public String toString() {
		
		return (" Car Details:\n" +
				" Year = " + year +
				"\n Manufacturer = " + mfr + 
				"\n Model = " + model + 
				"\n Price = " + price +
				"\n Speed = " + speed);
	}
}
