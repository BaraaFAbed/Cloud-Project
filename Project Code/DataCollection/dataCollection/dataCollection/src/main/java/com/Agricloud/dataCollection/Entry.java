package com.Agricloud.dataCollection;

import java.sql.Timestamp;

public class Entry {

	Timestamp timestamp;
	double soilMoisture;
	double humidity;
	double temperatrue;
	double ph;
	double lightIntensity;
	
	public Timestamp getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Timestamp timestamp) {
		this.timestamp = timestamp;
	}
	public double getSoilMoisture() {
		return soilMoisture;
	}
	public void setSoilMoisture(double soilMoisture) {
		this.soilMoisture = soilMoisture;
	}
	public double getHumidity() {
		return humidity;
	}
	public void setHumidity(double humidity) {
		this.humidity = humidity;
	}
	public double getTemperatrue() {
		return temperatrue;
	}
	public void setTemperatrue(double temperatrue) {
		this.temperatrue = temperatrue;
	}
	public double getPh() {
		return ph;
	}
	public void setPh(double ph) {
		this.ph = ph;
	}
	public double getLightIntensity() {
		return lightIntensity;
	}
	public void setLightIntensity(double lightIntensity) {
		this.lightIntensity = lightIntensity;
	}
	
	
}
