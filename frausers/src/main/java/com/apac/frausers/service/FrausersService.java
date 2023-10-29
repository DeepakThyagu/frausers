package com.apac.frausers.service;



import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.apac.frausers.model.Frausers;
import com.apac.frausers.repository.FrausersRepository;
@Service
public class FrausersService {
	
	@Autowired
	FrausersRepository frausersrepository;
	
	public void saveData (Frausers frausers) {
		frausersrepository.saveData(frausers);
		
	}
	public void updateData (Frausers frausers) {
		frausersrepository.updateData(frausers);
		
	}
	public void deleteAllData() {
		frausersrepository.deleteAllData();
	}
	public void deleteDataById(Long empId) {
		frausersrepository.deleteDataById(empId);
	}
	public List<Map<String, Object>> getAllData() {
		List<Map<String, Object>> empData =frausersrepository.getAllData();
		return empData;
	}
	public List<Map<String, Object>> getDataById(Long empId) {
		List<Map<String, Object>> empIdData =frausersrepository.getDataById(empId);
		return empIdData;
}
}
