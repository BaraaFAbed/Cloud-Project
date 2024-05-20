package com.Agricloud.notificationManager;

public class Notification {

	private int notifID;
	private String targetUser;
	private String message;
	
	public int getNotifID() {
		return notifID;
	}
	public void setNotifID(int notifID) {
		this.notifID = notifID;
	}
	public String getTargetUser() {
		return targetUser;
	}
	public void setTargetUser(String targetUser) {
		this.targetUser = targetUser;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
