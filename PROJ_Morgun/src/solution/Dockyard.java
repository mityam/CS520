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
		for(IContainer container: this.dockQueue )
		{
			if (truck.destinationCity().equalsIgnoreCase(container.destinationCity()) )
					{
						//this is an issue here taking next container from the queue instead of taking
						//corresponding dest City container
						//truck.addContainer(this.dockQueue.poll());
						truck.addContainer(container);
						this.dockQueue.remove();
						
						return true;
					}
			//this.dockQueue.peek();
		}
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
