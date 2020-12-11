package solution;

import shipping.IContainer;
import shipping.ITruck;

public class Truck implements ITruck {
	
	private String registrationID;
	private String destinationCity;
	
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
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public IContainer offloadContainer() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean hasContainer() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void printDetails() {
		// TODO Auto-generated method stub

	}

}
