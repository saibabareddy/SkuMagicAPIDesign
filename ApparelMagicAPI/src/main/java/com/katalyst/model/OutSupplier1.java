package com.katalyst.model;

import net.sf.json.JSONObject;

public class OutSupplier1 {
	String Name;

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}
	
	@Override
	public String toString() {
		return "OutSupplier1 [Name=" + Name + "]";
	}

	public JSONObject toJson()
	{
		JSONObject respo = new JSONObject();
		respo.put("Name", getName());
		return respo;
	}
}
