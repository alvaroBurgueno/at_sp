package com.atos.springApp.model;

public class CourseModel {

	public String name;
	public String description;
	public int price;
	public int hours;

	public CourseModel(String name, String description, int price, int hours) {
		super();
		this.name = name;
		this.description = description;
		this.price = price;
		this.hours = hours;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	public CourseModel() {
	}

	@Override
	public String toString() {
		return "CourseModel [name=" + name + ", description=" + description + ", price=" + price + ", hours=" + hours
				+ "]";
	}
	
	
}
