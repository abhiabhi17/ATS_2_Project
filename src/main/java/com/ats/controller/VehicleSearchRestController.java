package com.ats.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.ats.bndingdomain.VehicleSummary;
import com.ats.entity.PurchaseTagEntity;
import com.ats.service.VehicleSearchService;

@Controller
public class VehicleSearchRestController {

	@Autowired
	private VehicleSearchService vehicleService;
	
	
	/*
	 * Used to Load
	 * 
	 * 
	 * forms
	 */
	@RequestMapping(value="/searchVehicleDetails")
	public String loadForm()
	{
		return "VehicleSearch";
	}

	
	
	/*
	 * Used to get vehicle details
	 * 
	 * 
	 * from rest RTO APP
	 */
	@RequestMapping(value="/searchVehicleDtls")
	public String SearchVehcleDetails(@RequestParam("regNo") String regNo,Model model)
	{
		
      VehicleSummary vhclSummary=vehicleService.invokeVehicleDetails(regNo);
     
       
      
      if(vhclSummary!=null)
      {
    	  model.addAttribute("vcldtls", vhclSummary);
    	 
      }
      else
      {
    	  model.addAttribute("errorMsg", "Invalid RegistrationNumber");
      }
		return "VehicleSearch";
	}
	
	@RequestMapping(value="/buytag")
	public String purchaseTag(Model model,@ModelAttribute("purchasetag" ) PurchaseTagEntity purchaseEntity,HttpServletRequest request)
	{
		 HttpSession session=request.getSession();   
		String id=(String)session.getAttribute("id"); 
		System.out.println(id);
		vehicleService.registerAndSaveTag( purchaseEntity);
		
		return "VehicleSearch";
	}

}
