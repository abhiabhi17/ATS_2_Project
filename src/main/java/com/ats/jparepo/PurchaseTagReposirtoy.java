package com.ats.jparepo;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;

import com.ats.entity.PurchaseTagEntity;

public interface PurchaseTagReposirtoy extends CrudRepository<PurchaseTagEntity,Serializable> {

}
