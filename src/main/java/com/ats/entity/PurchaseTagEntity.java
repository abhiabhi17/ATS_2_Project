package com.ats.entity;

import java.io.Serializable;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.UpdateTimestamp;


@Entity
@Table(name="TAG_MASTER")
@IdClass(PurchaseDetailsId.class) 
public class PurchaseTagEntity implements Serializable {


	@Id
	@Column(name="TAG_SEQ")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "tag_reg_id_generator")
	@SequenceGenerator(name="tag_reg_id_generator",
	                   initialValue = 1,allocationSize = 1,
	  
	 
	                   sequenceName = "tag_reg_id_seq")
	private Integer id;
	
	
	   @Id
	   @Column(name="TAG_ID")
		@GenericGenerator(name = "pwd", strategy = "com.ats.hibernate.annotations.CustomGenerator")
		@GeneratedValue(generator = "pwd")
		private  String tagid;
	   
	   @Column(name="VEHICLE_REG_NUM")
		private String regNo;
		
		@Column(name="VEHICLE_TYPE")
		private String type;
	   
	   private Integer tagbalance;
	   
	   private Date startdate;
	   private Date expirydate;
	   
		@Column(name="createDate",updatable = false)
		@CreationTimestamp
		private Date CreateDate;
		
		@Column(name="updateDate")
		@UpdateTimestamp
		private Date updateDate;
	
		
		
		
	/*
	 * @OneToOne(targetEntity = RegistrationEntity.class, cascade=CascadeType.MERGE,
	 * fetch=FetchType.LAZY )
	 * 
	 * @JoinColumn(name="USER_ID",referencedColumnName ="id",nullable = false)
	 */
	private RegistrationEntity regentity;


		public Integer getId() {
			return id;
		}


		public void setId(Integer id) {
			this.id = id;
		}


		public String getTagid() {
			return tagid;
		}


		public void setTagid(String tagid) {
			this.tagid = tagid;
		}


		public String getRegNo() {
			return regNo;
		}


		public void setRegNo(String regNo) {
			this.regNo = regNo;
		}


		public String getType() {
			return type;
		}


		public void setType(String type) {
			this.type = type;
		}


		public Integer getTagbalance() {
			return tagbalance;
		}


		public void setTagbalance(Integer tagbalance) {
			this.tagbalance = tagbalance;
		}


		public Date getStartdate() {
			return startdate;
		}


		public void setStartdate(Date startdate) {
			this.startdate = startdate;
		}


		public Date getExpirydate() {
			return expirydate;
		}


		public void setExpirydate(Date expirydate) {
			this.expirydate = expirydate;
		}


		public Date getCreateDate() {
			return CreateDate;
		}


		public void setCreateDate(Date createDate) {
			CreateDate = createDate;
		}


		public Date getUpdateDate() {
			return updateDate;
		}


		public void setUpdateDate(Date updateDate) {
			this.updateDate = updateDate;
		}


		public RegistrationEntity getRegentity() {
			return regentity;
		}


		public void setRegentity(RegistrationEntity regentity) {
			this.regentity = regentity;
		}


		@Override
		public String toString() {
			return "PurchaseTagEntity [id=" + id + ", tagid=" + tagid + ", regNo=" + regNo + ", type=" + type
					+ ", tagbalance=" + tagbalance + ", startdate=" + startdate + ", expirydate=" + expirydate
					+ ", CreateDate=" + CreateDate + ", updateDate=" + updateDate + ", regentity=" + regentity + "]";
		}

		
		
		
}
