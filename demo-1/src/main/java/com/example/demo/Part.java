package com.example.demo;

public class Part {
	
	private int id;
	private String date;
	private String brand_and_automobile;
	
	Part() {};
	
	Part(String brand, String automobile) {
		this.brand_and_automobile = brand + " " + automobile;
	}

	public int getId() {
		return id;
	}

	public String getDate() {
		return date;
	}

	public String getBrand_and_automobile() {
		return brand_and_automobile;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public void setBrand_and_automobile(String brand_and_automobile) {
		this.brand_and_automobile = brand_and_automobile;
	}

}
