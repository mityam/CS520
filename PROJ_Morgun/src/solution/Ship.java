package solution;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import shipping.IContainer;
import shipping.IShip;

public class Ship implements IShip{
	
	private String registrationID;
	private List<IContainer> containerList = new LinkedList<>();
	
	public Ship() {}

	public Ship(String id, List<IContainer> containers) {
		this.setRegistration(id);
		this.containerList = containers;
	}
	
	
	@Override
	public String getRegistration() {
		
		return this.registrationID;
	}
	@Override
	public void setRegistration(String id) {
		this.registrationID  = id;
		
	}

	@Override
	public void addContainer(IContainer container) {
		this.containerList.add(container);
	}
	
	@Override
	public List<IContainer> containers() {
		return this.containerList;
	}

	@Override
	public List<IContainer> offload() {
		System.out.println("Before unloading: ");
		this.printDetails();
		this.containerList.clear();
		System.out.println("After unloading: ");
		this.printDetails();
		return this.containerList;
	}

	@Override
	public void printDetails() {
		System.out.print("Ship " + this.registrationID + " has " + this.containers().size() + ".\n");
		
	}

}
