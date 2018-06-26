package com.thinkxfactor.zomatoplus.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.print.attribute.standard.MediaSize.NA;

@Entity
@Table(name="tbl_items")
public class Items 
{
	@Id
	@GeneratedValue
	private long id;
	@Column(name="restaurant_id")
	private String restaurantId;
	@Column(name="name")
	private String name;
	@Column(name="price")
	private String price;
	@Column(name="description")
	private String description;
	
	
	public Items() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Items(long id, String restaurantId, String name, String price, String description) {
		super();
		this.id = id;
		this.restaurantId = restaurantId;
		this.name = name;
		this.price = price;
		this.description = description;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getRestaurantId() {
		return restaurantId;
	}
	public void setRestaurantId(String restaurantId) {
		this.restaurantId = restaurantId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
}
