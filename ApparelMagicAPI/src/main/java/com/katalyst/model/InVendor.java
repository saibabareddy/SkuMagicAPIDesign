package com.katalyst.model;

import net.sf.json.JSONObject;

public class InVendor {
String vendor_name;

public String getVendor_name() {
	return vendor_name;
}

public void setVendor_name(String vendor_name) {
	this.vendor_name = vendor_name;
}
public JSONObject toJson(){
	JSONObject response = new JSONObject();
	response.put("vendor_name", getVendor_name());
	return response;
}
}