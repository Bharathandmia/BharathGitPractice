package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="pancard")

public class PanCard {
      @Id
      @GeneratedValue(strategy=GenerationType.AUTO)
	private int panCardNumber;
	private String nameOfPanCardHolder;
	private String issuedDate;
	private String address;

	public PanCard() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getPanCardNumber() {
		return panCardNumber;
	}

	public void setPanCardNumber(int panCardNumber) {
		this.panCardNumber = panCardNumber;
	}

	public String getNameOfPanCardHolder() {
		return nameOfPanCardHolder;
	}

	public void setNameOfPanCardHolder(String nameOfPanCardHolder) {
		this.nameOfPanCardHolder = nameOfPanCardHolder;
	}

	public String getIssuedDate() {
		return issuedDate;
	}

	public void setIssuedDate(String issuedDate) {
		this.issuedDate = issuedDate;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "PanCard [panCardNumber=" + panCardNumber + ", nameOfPanCardHolder=" + nameOfPanCardHolder
				+ ", issuedDate=" + issuedDate + ", address=" + address + "]";
	}

}
