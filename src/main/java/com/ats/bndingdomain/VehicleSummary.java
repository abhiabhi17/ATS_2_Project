package com.ats.bndingdomain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class VehicleSummary{
	private VehicleOwnerRegistrationEntity ownerDtls;
	private OwnerAddressEntity adrsDtls;
	private VehicleRegistrationNoEntity regDtls;
	private VehicleDetailsEntity vhclDtls;
	public VehicleOwnerRegistrationEntity getOwnerDtls() {
		return ownerDtls;
	}
	public void setOwnerDtls(VehicleOwnerRegistrationEntity ownerDtls) {
		this.ownerDtls = ownerDtls;
	}
	public OwnerAddressEntity getAdrsDtls() {
		return adrsDtls;
	}
	public void setAdrsDtls(OwnerAddressEntity adrsDtls) {
		this.adrsDtls = adrsDtls;
	}
	public VehicleRegistrationNoEntity getRegDtls() {
		return regDtls;
	}
	public void setRegDtls(VehicleRegistrationNoEntity regDtls) {
		this.regDtls = regDtls;
	}
	public VehicleDetailsEntity getVhclDtls() {
		return vhclDtls;
	}
	public void setVhclDtls(VehicleDetailsEntity vhclDtls) {
		this.vhclDtls = vhclDtls;
	}
	@Override
	public String toString() {
		return "VehicleSummary [ownerDtls=" + ownerDtls + ", adrsDtls=" + adrsDtls + ", regDtls=" + regDtls
				+ ", vhclDtls=" + vhclDtls + "]";
	}

	
}
