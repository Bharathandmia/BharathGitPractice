package com.example.demo.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "adhar_info")
public class AdharInfo {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int adharNumber;
	//@Column(name = "nameOf_Person")
	private String nameOfPerson;
	//@Column(name = "gender")
	private String gender;
	//@Column(name = "age")
	private int age;
	//@Column(name = "address")
	private String address;

	public AdharInfo() {
	}

	public int getAdharNumber() {
		return adharNumber;
	}

	public void setAdharNumber(int adharNumber) {
		this.adharNumber = adharNumber;
	}

	public String getNameOfPerson() {
		return nameOfPerson;
	}

	public void setNameOfPerson(String nameOfPerson) {
		this.nameOfPerson = nameOfPerson;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "AdharInfo [adharNumber=" + adharNumber + ", nameOfPerson=" + nameOfPerson + ", gender=" + gender
				+ ", age=" + age + ", address=" + address + "]";
	}

}
