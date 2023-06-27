package com.akasia.investment.task.bank;

import org.springframework.stereotype.Repository;

// Bank Object
@Repository
public class Bank {
	private String bankId; 
	private	String bankName; 
	private	String bankNameAr; 
	private	String bankAbbr;
	public String getBankId() {
		return bankId;
	}
	public void setBankId(String bankId) {
		this.bankId = bankId;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getBankNameAr() {
		return bankNameAr;
	}
	public void setBankNameAr(String bankNameAr) {
		this.bankNameAr = bankNameAr;
	}
	public String getBankAbbr() {
		return bankAbbr;
	}
	public void setBankAbbr(String bankAbbr) {
		this.bankAbbr = bankAbbr;
	}
	public Bank() {
	}
}
