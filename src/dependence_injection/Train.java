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
public class Train implements Vehicle{
	private String licence;
	private String description;
	
	/**
	 * 
	 */
	public Train(String licence, String description) {
		this.setLicence(licence);
		this.setDescription(description);
	}

	/**
	 * @return the licence
	 */
	public String getLicence() {
		return licence;
	}

	/**
	 * @param licence the licence to set
	 */
	public void setLicence(String licence) {
		this.licence = licence;
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
	public Double move(Integer km) {
		System.out.println("Moving vehicle " + this.toString());
		return Math.random() * km;
	}
	
	@Override
	public String toString() {
		return "Train [licence = " + this.getLicence() + 
				", description = " + this.getDescription() + "]";
	}

}
