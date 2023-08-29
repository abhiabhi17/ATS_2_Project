package com.ats.service;
import java.util.Date;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;
import com.ats.bndingdomain.OwnerAddressEntity;
import com.ats.bndingdomain.VehicleDetailsEntity;
import com.ats.bndingdomain.VehicleOwnerRegistrationEntity;
import com.ats.bndingdomain.VehicleRegistrationNoEntity;
import com.ats.bndingdomain.VehicleSummary;
import com.ats.entity.PurchaseTagEntity;
import com.ats.entity.RegistrationEntity;
import com.ats.jparepo.PurchaseTagReposirtoy;
import com.ats.rtorestRepo.RtoOwnerDtlsRepository;
import com.ats.rtorestRepo.RtoRepoOAddress;
import com.ats.rtorestRepo.RtoRepoVDetails;
import com.ats.rtorestRepo.RtoRepoVRegistration;




@Service
public class VehicleSearchServiceImpl implements VehicleSearchService {


	
	@Autowired
	private RestTemplate rt;
	
	
	@Autowired
	private RtoOwnerDtlsRepository OwnerDtlsRepo;

	@Autowired
	private RtoRepoVDetails vehicleDtlsRepo;

	@Autowired
	private RtoRepoOAddress ownerAddRepo;

	@Autowired
	private RtoRepoVRegistration vregiRepo;
	
	@Autowired
	private PurchaseTagReposirtoy purchaseRepo;
	
	
	
	private RegistrationEntity regEntity = null, savedRegistrationEntity = null;
	private PurchaseTagEntity purchaseEntity=null,savedPurchasEntity=null;
	/*======== thiz is to call 
	 * 
	 * 
	 * RTO REST API ========*/
	private static final String RTO_REST_URL="http://localhost:8080/rto/getVehicleSummary?regNo={regNo}";
	
	private VehicleOwnerRegistrationEntity vownerEntity = null, savedvownerEntity = null;
	private VehicleDetailsEntity vclDtlsENtity=null,savedVcleEntity=null;
	private    OwnerAddressEntity   adressDtlsEntity=null,savedaddrsDtlsEntity=null;
	private  VehicleRegistrationNoEntity regDtlsEntity=null,savedRegEntity=null;
	
	
	@Override
	public VehicleSummary invokeVehicleDetails(String regNo) {
		
		      Integer StatusCode=null;
		      ResponseEntity<VehicleSummary> responseEntity =null;
		      VehicleSummary vchlSummary=null;
		
		      
		      try
		      {
		    	  responseEntity=  rt.exchange(RTO_REST_URL, HttpMethod.GET, null, VehicleSummary.class,regNo);
				     StatusCode=   responseEntity.getStatusCode().value();
				     vchlSummary=	responseEntity.getBody();
				     
				     vownerEntity = responseEntity.getBody().getOwnerDtls();
				     
				     
				     
				     
				     responseEntity=  rt.exchange(RTO_REST_URL, HttpMethod.GET, null, VehicleSummary.class,regNo);
				     StatusCode=   responseEntity.getStatusCode().value();
				     vchlSummary=	responseEntity.getBody();
				     vclDtlsENtity = responseEntity.getBody().getVhclDtls();
				     
				     
				     
				     
				     responseEntity=  rt.exchange(RTO_REST_URL, HttpMethod.GET, null, VehicleSummary.class,regNo);
				     StatusCode=   responseEntity.getStatusCode().value();
				     vchlSummary=	responseEntity.getBody();
				      adressDtlsEntity = responseEntity.getBody().getAdrsDtls();
				      
				      
				      
				      
				      responseEntity=  rt.exchange(RTO_REST_URL, HttpMethod.GET, null, VehicleSummary.class,regNo);
					     StatusCode=   responseEntity.getStatusCode().value();
					     vchlSummary=	responseEntity.getBody();
				     regDtlsEntity = responseEntity.getBody().getRegDtls();
				    
				      
				      savedvownerEntity = OwnerDtlsRepo.save(vownerEntity);
				      savedVcleEntity=  vehicleDtlsRepo.save(vclDtlsENtity);
				      savedaddrsDtlsEntity=  ownerAddRepo.save(adressDtlsEntity);
				      savedRegEntity= vregiRepo.save(regDtlsEntity);
				       
				       
	
		      }
		    catch(HttpClientErrorException ex)
		      {
		    	 StatusCode=ex.getStatusCode().value();
		      }
		      catch(Exception ex)
		      {
		    	  ex.getMessage();
		      }
			 
			    
			    return vchlSummary;
			    
	}


	@Override
	public void registerAndSaveTag(PurchaseTagEntity purchaseEntity) {
		
		
		
		PurchaseTagEntity entity = null, savedRegistrationEntity = null;
		String msg = null;
		String regNo=null;
		
		entity = new PurchaseTagEntity();
		
         
		entity.setRegentity(regEntity);
		
		purchaseEntity.setTagbalance(1000);
		purchaseEntity.setStartdate(new Date());
		purchaseEntity.setExpirydate(new Date() );
	
		purchaseRepo.save(purchaseEntity);
	}




	
	
	
	
}
