package com.Agricloud.notificationManager;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class NotificationService {

	private Map <Integer, Notification> notifs;
	private Map <String, Preference> prefs;
	
	public NotificationService() {
		notifs = new HashMap<>();
		prefs = new HashMap<>();
	}
	
	public Notification addNotif(Notification notif) {
		// ID from db 
		notifs.put(notif.getNotifID(), notif);
		return notif;
	}
	
	public ArrayList<Notification> getNotif(String username) {
		ArrayList<Notification> list = new ArrayList<Notification>();
		for(Notification notif: notifs.values()) {
			if (notif.getTargetUser().equalsIgnoreCase(username)) list.add(notif);
		}
		return list;
	}
		
	public Preference addPref(Preference pref) {
		prefs.put(pref.getUsername().toLowerCase(),pref);
		return pref;
	}
	
	public Preference updatePref(Preference pref) {
		Preference temp = prefs.get(pref.getUsername().toLowerCase());
		if (temp != null) {
			temp.setNotifPreference(pref.getNotifPreference());
			temp.setEmail(pref.getEmail().toLowerCase());
			prefs.put(pref.getUsername().toLowerCase(), temp);
		}
		return temp;
	}
}
