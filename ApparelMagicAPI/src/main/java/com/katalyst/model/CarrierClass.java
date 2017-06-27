package com.katalyst.model;

import net.sf.json.JSONObject;

public class CarrierClass {
String CarrierName;
String ClassName;
public String getCarrierName() {
	return CarrierName;
}
public void setCarrierName(String carrierName) {
	CarrierName = carrierName;
}
public String getClassName() {
	return ClassName;
}
public void setClassName(String className) {
	ClassName = className;
}
@Override
public String toString() {
	return "CarrierClass [CarrierName=" + CarrierName + ", ClassName=" + ClassName + "]";
}
public JSONObject toJSON(){
	
	JSONObject Carrier = new JSONObject();
	Carrier.put("CarrierName", getCarrierName());
	Carrier.put("ClassName", getClassName());
	return Carrier;
}
}
