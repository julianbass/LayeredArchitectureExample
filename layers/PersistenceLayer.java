package layers;

public interface PersistenceLayer {
	void writeData(dataObject obj);
	dataObject readData();
	dataObject storeData(dataObject obj);
}
