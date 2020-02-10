package com.example.demo.model;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student_demo")
public class StudentDemo {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int stdId;
	
	@Column(name="std_name")
	private String stdName;
	@Column(name="std_class")
	private String stdClass;
	@Column(name="std_address")
	private String stdAddress;
	public StudentDemo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getStdId() {
		return stdId;
	}
	public void setStdId(int stdId) {
		this.stdId = stdId;
	}
	public String getStdName() {
		return stdName;
	}
	public void setStdName(String stdName) {
		this.stdName = stdName;
	}
	public String getStdClass() {
		return stdClass;
	}
	public void setStdClass(String stdClass) {
		this.stdClass = stdClass;
	}
	public String getStdAddress() {
		return stdAddress;
	}
	public void setStdAddress(String stdAddress) {
		this.stdAddress = stdAddress;
	}
	@Override
	public String toString() {
		return "StudentDemo [stdId=" + stdId + ", stdName=" + stdName + ", stdClass=" + stdClass + ", stdAddress="
				+ stdAddress + "]";
	}
	
}
