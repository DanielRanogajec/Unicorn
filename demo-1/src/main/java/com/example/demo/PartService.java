package com.example.demo;

import java.util.Hashtable;

import org.springframework.stereotype.Service;

@Service
public class PartService {
	
	Hashtable<String, Part> parts = new Hashtable<String, Part>();
	
	public PartService() {
		Part p = new Part("Ford", "Coupe");
		p.setId(1);
		p.setDate("04-08-2019");
		parts.put("1", p);
		
		p = new Part("DeLorean", "DMC-1");
		p.setId(2);
		p.setDate("03-04-2020");
		parts.put("2", p);
		
		p = new Part("Ford", "Coupe");
		p.setId(3);
		p.setDate("05-08-2015");
		parts.put("3", p);
		
		p = new Part("Ford", "Coupe");
		p.setId(4);
		p.setDate("04-02-2017");
		parts.put("4", p);
		
		p = new Part("Ford", "Mustang");
		p.setId(5);
		p.setDate("09-08-2019");
		parts.put("5", p);
	}
	
	public Part getPart(String id) {
		if (parts.containsKey(id)) {
			return parts.get(id);
		}
		else
			return null;
	}
	
	public Hashtable<String, Part> getBandA(String x) {
		Hashtable<String, Part> parts2 = new Hashtable<String, Part>();
		int i = 1;
		for (Part p : parts.values()) {
			if (p.getBrand_and_automobile().equals(x)) {
				parts2.put(Integer.toString(i),p);
				i++;
			}
		}
		return parts2;
	}
	
	public Hashtable<String, Part> getAll() {
		return parts;
	}
	
	public void add(int id, String date, String brand, String automobile) {
		Part p = new Part(brand, automobile);
		p.setId(id);
		p.setDate(date);
		parts.put(Integer.toString(id), p);
	}
	
	public void remove(int id) {
		parts.remove(Integer.toString(id));
	}
	
}
