
public class Car {
	String make ="Chevrolet";
	String model = "Corvette";
	int year = 2020;
	String color = "Blue";
	double price = 50000.00;
	
	void drive() {
		System.out.println("You drive a car");
	}
	void breaks() {
		System.out.println("You stem on the breaks");
	}
	public String toString() {
		String myString = make+"\n"+model+"\n"+color+"\n"+year;
		return myString;		
	}
}
