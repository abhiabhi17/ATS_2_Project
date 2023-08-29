package com.ats.service;

import com.ats.bndingdomain.VehicleSummary;
import com.ats.entity.PurchaseTagEntity;



public interface VehicleSearchService {

	
	 public VehicleSummary invokeVehicleDetails(String regNo);

	public void registerAndSaveTag(PurchaseTagEntity purchaseEntity);




}
