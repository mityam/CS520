package solution;

import java.util.StringTokenizer;

//import java.util.HashMap;

import shipping.IContainer;

public class Container implements IContainer {
	
	//private HashMap<String, String> containerList = new HashMap<String, String>();
	private String containerID, containerCity, containerDescription;

	public Container (String description) 
	{
		this.containerDescription = description;
		StringTokenizer st = new StringTokenizer(description, ",");
		this.containerID = st.nextToken();
		this.containerCity = st.nextToken().trim();
	}
	
	@Override
	public String id() {
		return this.containerID;
	}

	@Override
	public String description() {
		return this.containerDescription;
	}

	@Override
	public String destinationCity() {
		return this.containerCity;
	}

}
