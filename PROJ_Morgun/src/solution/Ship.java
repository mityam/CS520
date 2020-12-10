package solution;

import java.util.List;

import shipping.IContainer;
import shipping.IShip;

public class Ship implements IShip{
	
	private String registrationID;

	public Ship() {}

	public Ship(String id) {
		this.setRegistration(id);
	}
	
	/**
	 * Returns the ship's unique registration id.  
	 * <p>
	 * @return A string value indicating the ship's registration id.
	 */
	public String getRegistration() {
		
		return this.registrationID;
	}

	/**
	 * Sets the ship's unique registration id.  
	 * <p>
	 * @param id A string value indicating the ship's registration id.
	 */
	public void setRegistration(String id) {
		this.registrationID  = id;
		
	}

	
	public void addContainer(IContainer container) {
		
		
	}

	/**
	 * Returns a list of the containers that are on the ship.  
	 * <p>
	 * @return A list of containers currently on the ship.
	 * @see List
	 * @see IContainer
	 */

	public List<IContainer> containers() {
		
		return null;
	}

	
	public List<IContainer> offload() {
		
		return null;
	}

	
	public void printDetails() {
		System.out.println("Ship " + this.registrationID);
		
	}

}
