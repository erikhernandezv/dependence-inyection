/**
 * 
 */
package dependence_injection;

/**
 * @author edhernandez
 * @implNote This class implement the method move of interface ivehicle
 * @version 1.0
 *
 */
public class Car implements Vehicle{
	private String description;
	
	/**
	 * 
	 */
	public Car(String description) {
		this.setDescription(description);
	}

	@Override
	public Double move(Integer km) {
		System.out.println("Moving vehicle " + this.toString());
		return Math.random() * km;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	
	@Override
	public String toString() {
		return "Car [description = " + this.getDescription() + "]";
	}

}
