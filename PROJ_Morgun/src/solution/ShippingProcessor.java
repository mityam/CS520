package solution;

import java.util.List;

import shipping.*;

public class ShippingProcessor extends ShippingProcessorBase{

	public ShippingProcessor(IDockyard dockyard) {
		// TODO Auto-generated constructor stub
		super(dockyard);
	}

	@Override
	protected List<IContainer> readManifest(String shipId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected void processTruck(String registration, String destination) {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected IShip processShip(String registration) {
		
		return null;
	}

}
