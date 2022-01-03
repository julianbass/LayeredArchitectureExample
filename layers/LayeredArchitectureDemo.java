package layers;

public class LayeredArchitectureDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Layered Architecture Demo");

		dataObject dataobject = new dataObject(1, "initial data");
		System.out.println("value of data object string = " + dataobject.getString() );
		LogicLayerImpl ll = new LogicLayerImpl();
		dataObject newDataObject =ll.processData(dataobject);
		
		System.out.println("new value of data object string = " + newDataObject.getString() );
	}

}
