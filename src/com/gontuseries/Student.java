package com.gontuseries;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.ManyToAny;

@Entity
@Table(name="Stud_TBL")
public class Student implements Serializable{
	@Id 
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name="STUD_ID")
	private int studId;
	
	@Column(name="STUD_NAME")
	private String studName;
	
	//Many Student can have same city and state
	@ManyToOne(cascade = CascadeType.ALL)
	private Address address;

	public int getStudId() {
		return studId;
	}

	public void setStudId(int studId) {
		this.studId = studId;
	}

	public String getStudName() {
		return studName;
	}

	public void setStudName(String studName) {
		this.studName = studName;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
}
