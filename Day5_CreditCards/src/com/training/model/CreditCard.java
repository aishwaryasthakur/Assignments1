package com.training.model;

import java.io.Serializable;

public class CreditCard implements Serializable{
	
	private Long cardNumber;
	private String cardHolderName;
	private String expiryDate;
	private transient double creditLimit;
	public CreditCard() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CreditCard(Long cardNumber, String cardHolderName, String expiryDate, double creditLimit) {
		super();
		this.cardNumber = cardNumber;
		this.cardHolderName = cardHolderName;
		this.expiryDate = expiryDate;
		this.creditLimit = creditLimit;
	}
	public Long getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(Long cardNumber) {
		this.cardNumber = cardNumber;
	}
	public String getCardHolderName() {
		return cardHolderName;
	}
	public void setCardHolderName(String cardHolderName) {
		this.cardHolderName = cardHolderName;
	}
	public String getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}
	public double getCreditLimit() {
		return creditLimit;
	}
	public void setCreditLimit(double creditLimit) {
		this.creditLimit = creditLimit;
	}
	@Override
	public String toString() {
		return cardNumber + ", " + cardHolderName + ", " + expiryDate ;
	}
	
}
