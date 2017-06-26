package com.katalyst.dao;

import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.katalyst.model.Skumagicconsole;

	@Transactional
	public interface SkumagicconsoleDao extends CrudRepository<Skumagicconsole, Long> {

	  /**
	   * This method will find an User instance in the database by its email.
	   * Note that this method is not implemented and its working code will be
	   * automagically generated from its signature by Spring Data JPA.
	   */
/*	@Query("select * from logintegration")
	  public List<Skumagicconsole> selectAll();*/
	
	/*@Query("INSERT INTO logintegration (product_id, date_search, status, response) VALUES (:product_id,:date_search,:status,:response)")
	  public Skumagicconsole InsertValues(@Param("product_id")int product_id, @Param("date_search")Date date_search, @Param("status")int status, @Param("response")String response);*/

	}
