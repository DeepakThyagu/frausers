package com.apac.frausers.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.apac.frausers.model.Frausers;
import com.apac.frausers.service.FrausersService;

@RestController
@RequestMapping("/frausers/api/v1")
public class FrausersController {
	
	@Autowired
	FrausersService frausersservice;
	
	@PostMapping("/")
	public void saveData (@RequestBody Frausers frausers) {
		frausersservice.saveData(frausers);
		
	}
	@PutMapping("/")
	public void updateData (@RequestBody Frausers frausers) {
		frausersservice.updateData(frausers);
		
	}
	@DeleteMapping("/")
	public void deleteAllData() {
		frausersservice.deleteAllData();
	}
	@DeleteMapping("/{id}")
	public void deleteDataById(@PathVariable("id") Long empId) {
		frausersservice.deleteDataById(empId);
	}
	@GetMapping("/")
	public List<Map<String, Object>> getAllData() {
		List<Map<String, Object>> empData = frausersservice.getAllData();
		return empData;
	}
	@GetMapping("/{id}")
	public List<Map<String, Object>> getDataById(@PathVariable("id") Long empId) {
		List<Map<String, Object>> empIdData = frausersservice.getDataById(empId);
		return empIdData;
}
}
