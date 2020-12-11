package solution;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

import shipping.*;

public class ShippingProcessor extends ShippingProcessorBase{

	public ShippingProcessor(IDockyard dockyard) {
		super(dockyard);
	}

	@Override
	protected List<IContainer> readManifest(String shipId) {
		// TODO list/queue of Containers to add here
		List<IContainer> containerList = new LinkedList<>();
				
		FileReader fileReader = null;
		String fileName = shipId + "-Manifest";
		try {
			fileReader = new FileReader(fileName);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		BufferedReader reader = new BufferedReader(fileReader);
		String input;
		try {
			input = reader.readLine();
			while (input != null)
			{
				containerList.add(new Container(input));
				input = reader.readLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// Close the input
		try {
			fileReader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return containerList;	
	}

	@Override
	protected void processTruck(String registration, String destination) {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected IShip processShip(String registration) {
		
		Ship myShip = new Ship(registration, this.readManifest(registration));
		
		for(IContainer container: myShip.containers() )
		{
			this.getDockyard().addContainer(container);
		}
		//myShip.containers();
		myShip.offload();
		return myShip;
	}

}
