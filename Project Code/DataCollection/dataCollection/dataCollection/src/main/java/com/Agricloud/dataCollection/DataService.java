package com.Agricloud.dataCollection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataService {
	
	private Map <String, Data> dataRecords;
	
	public DataService() {
		dataRecords = new HashMap<>();
	}
	
	public ArrayList<Entry> getData(String username) {
		if (dataRecords.get(username) == null) return null;
		return dataRecords.get(username).getEntries();
	}
	
	public List<Entry> getEntries(String username, int numOfEntries){
		if (dataRecords.get(username) == null) return null;
		return dataRecords.get(username).getEntries().subList(dataRecords.get(username).getEntries().size() - numOfEntries, dataRecords.get(username).getEntries().size());
	}

}
