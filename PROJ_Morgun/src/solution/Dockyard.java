package solution;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import shipping.IContainer;
import shipping.IDockyard;
import shipping.ITruck;


public class Dockyard implements IDockyard {
	
	private Queue<IContainer> dockQueue = new LinkedList<>();
	//private HashMap<String, IContainer> studentMap = new HashMap<String, IContainer>();
	
	
	@Override
	public void addContainer(IContainer container) {
		this.dockQueue.add(container);
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
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void printDetails() {
		System.out.println("The dockyard contains " + containerCount() + " containers.");
	}

}
