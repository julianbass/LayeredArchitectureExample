package layers;

public class LogicLayerImpl implements LogicLayer {
	private PersistenceLayerImpl pl = null;
	
	public LogicLayerImpl() {
		super();
		pl = new PersistenceLayerImpl();
	}

	@Override
	public dataObject processData(dataObject obj) {
		obj.setString(obj.getString() + ", processed data added");
		dataObject new_obj = pl.storeData(obj);
		//System.out.println(new_obj.getString());
		return new_obj;
	}
	
	@Override
	public void processingData(dataObject obj) {
		obj.setString(obj.getString() + ", processed data added");
		//pl.writeData(obj);
		
		//pl.storeData(obj);
		dataObject new_obj = pl.storeData(obj);
		System.out.println(new_obj.getString());
		//dataObject new_obj = pl.readData();
		//System.out.println(new_obj.getString());
		//pl.readData();
		
	}

	@Override
	public dataObject getProcessedData() {
		// TODO Auto-generated method stub	
		dataObject obj =	pl.readData();
		//obj.setString(obj.getString() + ", processed data added");
		
		return obj;
	}

}
