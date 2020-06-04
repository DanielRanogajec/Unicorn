package com.example.demo;

import java.util.Hashtable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class PartController {
	
	@Autowired
	PartService partService;
	
	@RequestMapping("/")
	public Hashtable<String, Part> getAll() {
		return partService.getAll();
	}
	
	@RequestMapping("{id}")
	public Part getPart(@PathVariable("id") String id) {
		return partService.getPart(id);
	}
	
	@RequestMapping("/count/{b_and_a}")
	public String getCount(@PathVariable("b_and_a") String b_and_a) {
		Hashtable<String, Part> parts = partService.getBandA(b_and_a);
		return b_and_a +" ... count:" + parts.size();
	}
	
	@RequestMapping("/add/{id}:{date}:{b_and_a}")
	public Hashtable<String, Part> add(@PathVariable("id") int id, @PathVariable("date") String date, @PathVariable("b_and_a") String b_and_a) {
		String[] ba = b_and_a.split(" ");
		partService.add(id, date, ba[0], ba[1]);
		return partService.getAll();
	}
	
	@RequestMapping("/remove/{id}")
	public Hashtable<String, Part> remove(@PathVariable("id") int id) {
		partService.remove(id);
		return partService.getAll();
	}
	
}
