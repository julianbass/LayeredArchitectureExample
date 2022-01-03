package layers;

public interface LogicLayer {
	void processingData(dataObject obj);
	dataObject getProcessedData();
	dataObject processData(dataObject obj);
}
