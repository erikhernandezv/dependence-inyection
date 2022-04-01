/**
 * 
 */
package dependence_injection;

/**
 * @author edhernandez
 * @implNote This class implement a class traveller than consumes a class for dependence inyection
 * @version 1.0
 *
 */
public class Traveller {
	private String name;
	private Vehicle vehicle;

	/**
	 * Constructor through which the class vehicle is inserted
	 */
	public Traveller(String name, Vehicle vehicle) {
		this.setName(name);
		this.vehicle = vehicle;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	
	public Double move(Integer km) {
		System.out.println("Travelling "+km);
		Double cost = vehicle.move(km);
		return cost;
	}

}
