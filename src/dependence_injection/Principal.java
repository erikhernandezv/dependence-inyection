package dependence_injection;

/**
 * @author edhernandez
 * @version 1.0
 *
 */
public class Principal {

	public static void main(String[] args) {
		Vehicle vehicle = new Car("Opel Corsa");
		Vehicle otherVehicle = new Train("0555EVL", "Talgo 42");
		
		Traveller tourist = new Traveller("Dr Livingstone", vehicle);
		
		System.out.println("Moving! Cost " + tourist.move(15) + " $");
		System.out.println("Moving! Cost " + tourist.move(1) + " $");
		
		tourist.setVehicle(otherVehicle);
		System.out.println("Moving! Cost " + tourist.move(42) + " $");
	}

}
