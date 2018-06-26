package com.thinkxfactor.zomatoplus.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="tbl_restaurant")
public class Restaurant implements Serializable
{
	@Id
	@GeneratedValue
	@Column(name="reataurant_id")
	private long id;
	@Column(name="name")
	private String name;
	@Column(name="address")
	private String address;
	@Column(name="website")
	private String website;
	@Column(name="phone")
	private String phone;
	@Column(name="like_count")
	private Integer likeCount;
	@Column(name="city")
	private String city;
	@Column(name="description")
	private String description;
	@Column(name="contact")
	private String contact;
	
	
	public Restaurant(long id, String name, String address, String website, String phone, Integer likeCount, String city,
			String description, String contact) 
	{
		
		this.id = id;
		this.name = name;
		this.address = address;
		this.website = website;
		this.phone = phone;
		this.likeCount = likeCount;
		this.city = city;
		this.description = description;
		this.contact = contact;
	}
	
	public Restaurant() 
	{
		
		
	}

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Integer getLikeCount() {
		return likeCount;
	}
	public void setLikeCount(Integer likeCount) {
		this.likeCount = likeCount;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	
	
}
