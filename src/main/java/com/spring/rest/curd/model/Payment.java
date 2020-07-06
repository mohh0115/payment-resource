package com.spring.rest.curd.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "payment_table")
public class Payment implements Serializable{

	@Id
	@GeneratedValue
	private int id;
	private String transactionId;
	private String vendor;
	private Date paymentDate;
	private double amount;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getVendor() {
		return vendor;
	}

	public void setVendor(String vendor) {
		this.vendor = vendor;
	}

	public Date getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	public Payment(int id, String transactionId, String vendor, Date paymentDate, double amount) {
		super();
		this.id = id;
		this.transactionId = transactionId;
		this.vendor = vendor;
		this.paymentDate = paymentDate;
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Payment [id=" + id + ", transactionId=" + transactionId + ", vendor=" + vendor + ", paymentDate="
				+ paymentDate + ", amount=" + amount + "]";
	}

	public Payment() {
		super();
	}

}
