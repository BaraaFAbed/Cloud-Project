package com.Agricloud.dataCollection;

import java.util.ArrayList;

public class Data {

	private ArrayList<Entry> entries;
	private String username;
	
	public Data() {
		entries = new ArrayList<>();
	}

	public ArrayList<Entry> getEntries() {
		return entries;
	}

	public void setEntries(ArrayList<Entry> entries) {
		this.entries = entries;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

}
