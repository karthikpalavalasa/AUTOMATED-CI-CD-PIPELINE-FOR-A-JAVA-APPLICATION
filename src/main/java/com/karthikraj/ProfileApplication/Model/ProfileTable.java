package com.karthikraj.ProfileApplication.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="ProfileTable")
public class ProfileTable {
	@Id
	@Column(name="mobile")
	private long mobile;
	@Column(name="firstName")
	private String firstName;
	@Column(name="lastName")
	private String lastName;
	@Column(name="Address")
	private String Address;
	@Column(name="gender")
	private String gender;
	@Column(name="age")
	private int age;
	@Column(name="marriedStatus")
	private String marriedStatus;
	public ProfileTable() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ProfileTable(String firstName, String lastName, long mobile, String address, String gender, int age,
			String marriedStatus) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.mobile = mobile;
		Address = address;
		this.gender = gender;
		this.age = age;
		this.marriedStatus = marriedStatus;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
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
	public String getMarriedStatus() {
		return marriedStatus;
	}
	public void setMarriedStatus(String marriedStatus) {
		this.marriedStatus = marriedStatus;
	}
	

}
