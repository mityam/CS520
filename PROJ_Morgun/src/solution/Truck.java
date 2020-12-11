package solution;

import shipping.IContainer;
import shipping.ITruck;

public class Truck implements ITruck {
	
	private String registrationID;
	private String destinationCity;
	private IContainer myContainer;
	
	public Truck (String registration, String destination)
	{
		this.registrationID = registration;
		this.destinationCity = destination;
	}

	@Override
	public String registration() {
		return  this.registrationID;
	}

	@Override
	public String destinationCity() {
		return  this.destinationCity;
	}

	@Override
	public boolean addContainer(IContainer container) {
		if (!hasContainer())
		{
			this.myContainer = container;
			return true;
		}
		return false;
	}

	@Override
	public IContainer offloadContainer() {
		System.out.print("\nBefore loading: ");
		this.printDetails();
		if (hasContainer())
			return this.myContainer;
		return null;
	}

	@Override
	public boolean hasContainer() {
		if ( ! (this.myContainer == null) )
				return true;
		return false;
	}

	@Override
	public void printDetails() {
		String containerID;
		
		if (hasContainer())
		{ containerID = "container " + this.myContainer.id();}
		else
		{ containerID = "no container";}	
			
		System.out.print("Truck " + this.registrationID + " is headed to " + this.destinationCity
				+ " with " + containerID + ".\n");
		
	}

}
