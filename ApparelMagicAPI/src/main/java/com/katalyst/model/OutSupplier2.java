package com.katalyst.model;

import net.sf.json.JSONObject;

public class OutSupplier2 {
String TenantToken;
String UserToken;
public String getTenantToken() {
	return TenantToken;
}
public void setTenantToken(String tenantToken) {
	TenantToken = tenantToken;
}
public String getUserToken() {
	return UserToken;
}
public void setUserToken(String userToken) {
	UserToken = userToken;
}
@Override
public String toString() {
	return "OutSupplier2 [TenantToken=" + TenantToken + ", UserToken=" + UserToken + "]";
}
public JSONObject toJson()
{
	JSONObject respo = new JSONObject();
	respo.put("TenantToken", getTenantToken());
	respo.put("UserToken", getUserToken());
	return respo;
}
}
