package layers;

public class PersistenceLayerImpl implements  PersistenceLayer {
	private dataObject obj;
	
	public PersistenceLayerImpl() {
		super();
		obj = null;
	}

	@Override
	public void writeData(dataObject obj) {
		obj.setString(obj.getString() + ", stored data added");
		System.out.println(obj.getString());
	}

	@Override
	public dataObject readData() {
		// TODO Auto-generated method stub
		System.out.println("got here");
		System.out.println(obj);
		return obj;
	}
	
	@Override
	public dataObject storeData(dataObject obj) {
		obj.setString(obj.getString() + ", stored data added");
		//System.out.println(obj.getString()); 
		return obj;
	}


}
