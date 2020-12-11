package solution;

import shipping.IContainer;
import shipping.ITruck;

public class Truck implements ITruck {
	
	private String registrationID;
	private String destinationCity;
	private boolean hasContainer;
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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean hasContainer() {
		return this.hasContainer;
	}

	@Override
	public void printDetails() {
		System.out.print("Truck " + this.registrationID + " is headed to " + this.destinationCity
				+ " with " + this.myContainer.id() + ".\n");
		
	}

}
