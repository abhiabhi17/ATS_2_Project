package com.ats.rtorestRepo;

import java.io.Serializable;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.ats.bndingdomain.VehicleRegistrationNoEntity;


public interface RtoRepoVRegistration extends CrudRepository<VehicleRegistrationNoEntity,Serializable>{
	
	@Query(value ="select regDate,regNo,regCenter from VehicleRegistrationNoEntity where v_own_id=:ownerId")
	public List<Object> getVehicleRegDeatailsByOid(Integer ownerId);


	//get owner id for rest
	@Query(value ="select e from VehicleRegistrationNoEntity e where regNo=:regNo")
	public VehicleRegistrationNoEntity getOidForRest(String regNo);

	
	
	@Query(value ="select e from VehicleRegistrationNoEntity  e where e.vihcleOwnEntity.oid=:ownerId")
	public VehicleRegistrationNoEntity getVehicleRegDeatailsByOidForRest(Integer ownerId);

}
