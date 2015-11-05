package movie.db.client;

import java.util.ArrayList;
import java.util.Map;

import movie.db.shared.DataResultShared;
import movie.db.shared.Selection;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

@RemoteServiceRelativePath("myService")

public interface MyService extends RemoteService {
	//public String myMethod(String s);
	public Map<Integer, DataResultShared> getFilteredData(Selection selection);
}