package com.spring.rest.curd.dao;

import org.springframework.data.repository.CrudRepository;

import com.spring.rest.curd.model.Payment;
import java.lang.String;
import java.util.List;

public interface PaymentDao extends CrudRepository<Payment, Integer> {
	
	List<Payment> findByVendor(String vendor);
	
	

}
