package com.katalyst.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "logintegration")
public class Skumagicconsole {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@NotNull
	private String product_id;
	@NotNull
	private String date_search;
	@NotNull
	private String status;
	@NotNull
	private String response;

	public Skumagicconsole() {
	}

	public Skumagicconsole(long id) {
		this.id = id;
	}

	public Skumagicconsole(String product_id,String date_search, String status, String response) {
		this.product_id = product_id;
		this.date_search = date_search;
		this.status = status;
		this.response = response;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getProduct_id() {
		return product_id;
	}

	public void setProduct_id(String product_id) {
		this.product_id = product_id;
	}

	public String getDate_search() {
		return date_search;
	}

	public void setDate_search(String date_search) {
		this.date_search = date_search;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getResponse() {
		return response;
	}

	public void setResponse(String response) {
		this.response = response;
	}
	
	

}
