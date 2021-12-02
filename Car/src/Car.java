
public class Car {

	String color  ; //instance variable
	String type; //instance variable
	int serialNumber;
	static int carCount;

	{
		//this is the initialization block
		//it runs for all constructor 
		color = "Red";
	}
	
	Car(){
		//this is a constructor
		carCount++;
		serialNumber = carCount;
	}
	Car(String c, String t){
		//this is another constructor
		color = c;
		type = t;
		

	}
	 
	void start() {
		System.out.println("Get Started");
	}
	
	void printDescription() {
		System.out.println("This is a " + color +" "+ type);
	}
	
}


