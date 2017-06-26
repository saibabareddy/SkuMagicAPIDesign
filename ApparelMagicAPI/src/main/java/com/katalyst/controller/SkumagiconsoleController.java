package com.katalyst.controller;

import java.util.ArrayList;
import java.util.Date;

import javax.ws.rs.Consumes;
import javax.ws.rs.core.MediaType;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.katalyst.dao.PoDao;
import com.katalyst.dao.SkumagicconsoleDao;
import com.katalyst.model.Skumagicconsole;
import com.katalyst.service.ApparelMagicWSService;

import net.sf.json.JSONObject;

@Controller
public class SkumagiconsoleController {
	private static final Logger logger = LoggerFactory.getLogger(ApparelMagicWSService.class);
	
	   //private static SkumagiconsoleController instance = null;
	   public SkumagiconsoleController() {
	      // Exists only to defeat instantiation.
	   }
/*	   public static SkumagiconsoleController getInstance() {
	      if(instance == null) {
	         instance = new SkumagiconsoleController();
	      }
	      return instance;
	   }*/

	  // ------------------------
	  // PUBLIC METHODS
	  // ------------------------
/*	  @RequestMapping("/insert")
	  @ResponseBody
	  public String insert(String product_id, String date_search, String status, String response) {
	    Skumagicconsole skumagicconsole = null;
	    try {
	
	    
	    	skumagicconsole = new Skumagicconsole(product_id, date_search, status, response);
	    	skumagicconsoleDao.save(skumagicconsole);
	    }
	    catch (Exception ex) {
	    ex.printStackTrace();
	      return "Error Inserting";
	    }
	    logger.debug("Inserted succesfully");
		return "Inserted Sucessfully";
	  }*/
		  @RequestMapping("/getSkuLog")
		  @ResponseBody
		  public ArrayList<JSONObject> getSkuLog() {
			  padao.createConnection();
		    return padao.doSelectSkuLog();
		  }

	  // ------------------------
	  // PRIVATE FIELDS
	  // ------------------------

		  @Autowired public PoDao padao;

}
