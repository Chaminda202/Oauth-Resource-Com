package com.rest.security.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Account {
	@JsonProperty("account_number")
	private Long accNum;
	@JsonProperty("account_holder_name")
	private String accHolName;
	@JsonProperty("account_type")
	private String accType;
	@JsonProperty("bank_name")
	private String bnkNam;
	
	public Account() {
		super();
	}
	public Account(Long accNum, String accHolName, String accType, String bnkNam) {
		super();
		this.accNum = accNum;
		this.accHolName = accHolName;
		this.accType = accType;
		this.bnkNam = bnkNam;
	}
	public Long getAccNum() {
		return accNum;
	}
	public void setAccNum(Long accNum) {
		this.accNum = accNum;
	}
	public String getAccHolName() {
		return accHolName;
	}
	public void setAccHolName(String accHolName) {
		this.accHolName = accHolName;
	}
	public String getAccType() {
		return accType;
	}
	public void setAccType(String accType) {
		this.accType = accType;
	}
	public String getBnkNam() {
		return bnkNam;
	}
	public void setBnkNam(String bnkNam) {
		this.bnkNam = bnkNam;
	}
}
