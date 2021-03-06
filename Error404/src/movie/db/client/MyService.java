package movie.db.client;

import java.util.ArrayList;
import java.util.Map;

import movie.db.shared.DataResultAggregated;
import movie.db.shared.DataResultShared;
import movie.db.shared.Selection;

import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

@RemoteServiceRelativePath("myService")

/**
 * Service Interface for getting the data from the server
 * to the client side code. 
 *  
 * @Author Christoph Weber
 */
public interface MyService extends RemoteService {
	public Map<Integer, DataResultShared> getFilteredData(Selection selection);
	public ArrayList<DataResultAggregated> getWorldMapData(int selectedYear);
	public Map<String,Integer> getPopulation(int selectedYear);
	public ArrayList<String> getColumnEntries(String column);
	public Map<Integer, Integer> getColumnChartData(String country, String genre, int yearFrom, int yearTo);

}

