package solution;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import shipping.IContainer;
import shipping.IDockyard;
import shipping.ITruck;


public class Dockyard implements IDockyard {
	
	private Queue<IContainer> dockQueue = new LinkedList<>();
	private HashSet<String> cities = new HashSet<String>();
 	
	@Override
	public void addContainer(IContainer container) {
		this.dockQueue.add(container);
		this.cities.add(container.destinationCity());
	}

	@Override
	public boolean loadTruck(ITruck truck) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int containerCount() {
		return this.dockQueue.size();
	}

	@Override
	public int containerCount(String destinationCity) {
		int counter = 0;
		for (IContainer container : this.dockQueue )
		{
			if ( destinationCity.equalsIgnoreCase(container.destinationCity()))
				counter++;
		}
		return counter;
	}

	@Override
	public void printDetails() {
		System.out.println("The dockyard contains " + containerCount() + " containers.");
		
		for (String city : cities )
		{
			System.out.println (city + ":" + this.containerCount(city));
		}
		
	}

}
