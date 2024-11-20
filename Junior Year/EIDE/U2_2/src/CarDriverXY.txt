
public class CarDriverXY {

	public static void main(String[] args) {
		
		CarY myCar = new CarY(2000, "Ford", "Mustang");
		
		System.out.println(myCar);
		System.out.println();
		
		CarY myCar2 = new CarY(2015, "Nissan", "Pathfinder", 20000);
		
		System.out.println(myCar2);
		System.out.println();
		
		//=============================================
		
		CarX myCar3 = new CarX (2019, "Acura", "TLX");
		
		System.out.println(myCar3);
		System.out.println();
		
		CarX myCar4 = new CarX (2023, "Acura", "RDX", 40000);
		System.out.println(myCar4);
		System.out.println();

	}

}
