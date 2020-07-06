package com.spring.rest.curd.service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.rest.curd.dao.PaymentDao;
import com.spring.rest.curd.dto.PaymentResponse;
import com.spring.rest.curd.model.Payment;

@Service
@Transactional
public class PaymentService {

	@Autowired
	private PaymentDao dao;

	public PaymentResponse pay(Payment payment) {

		payment.setPaymentDate(new Date());
		dao.save(payment);
		PaymentResponse response = new PaymentResponse();
		response.setMessage("Payment success " + payment.getAmount());
		response.setStatus("Success");
		response.setTxDate(new SimpleDateFormat("dd/mm/yyyy HH:mm:ss a").format(new Date()));
		return response;
	}

	public PaymentResponse getTx(String vendor) {
		PaymentResponse response = new PaymentResponse();
		List<Payment> payments = dao.findByVendor(vendor);
		response.setStatus("Success");
		response.setPayments(payments);
		return response;
	}

}
