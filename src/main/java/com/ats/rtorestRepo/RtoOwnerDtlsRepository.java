package com.ats.rtorestRepo;

import java.io.Serializable;


import org.springframework.data.repository.CrudRepository;

import com.ats.bndingdomain.VehicleOwnerRegistrationEntity;



public interface RtoOwnerDtlsRepository extends CrudRepository<VehicleOwnerRegistrationEntity,Serializable>{

	
	
}
