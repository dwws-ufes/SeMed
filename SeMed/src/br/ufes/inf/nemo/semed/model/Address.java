package br.ufes.inf.nemo.semed.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import br.ufes.inf.nemo.util.ejb3.persistence.PersistentObjectSupport;

@Entity
public class Address extends PersistentObjectSupport implements Comparable<Address>{

//	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
//	private long id;
	
	private String street;
	private int number;
	private String district;
	private String city;
	private String state;
	private String zipCode;
	
//	public long getId() {
//		return id;
//	}
	
//	public void setId(long id) {
//		this.id = id;
//	}
	
	public String getStreet() {
		return street;
	}
	
	public void setStreet(String street) {
		this.street = street;
	}
	
	public int getNumber() {
		return number;
	}
	
	public void setNumber(int number) {
		this.number = number;
	}
	
	public String getDistrict() {
		return district;
	}
	
	public void setDistrict(String district) {
		this.district = district;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public String getState() {
		return state;
	}
	
	public void setState(String state) {
		this.state = state;
	}
	
	public String getZipCode() {
		return zipCode;
	}
	
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	
	@Override
	public int compareTo(Address a) {
		return getUuid().compareTo(a.getUuid());
	}
	
}
