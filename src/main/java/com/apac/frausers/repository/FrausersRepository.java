package com.apac.frausers.repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.apac.frausers.model.Frausers;
import com.apac.frausers.queries.Queries;

@Repository
public class FrausersRepository {
	@Autowired
	NamedParameterJdbcTemplate jdbctemplate;
	
	public void saveData (Frausers frausers) {
	
		String insertquery = Queries.INSERT_EMP_DATA;
		Map<String,Object> data = new HashMap<>();
		data.put("EMP_ID", frausers.getEmpId());
		data.put("FIRST_NAME", frausers.getFirstName());
		data.put("LAST_NAME", frausers.getLastName());
		data.put("AGE", frausers.getAge());
		data.put("GENDER", frausers.getGender());
		data.put("LOCATION", frausers.getLocation());
		data.put("EMAIL", frausers.getEmail());
		data.put("CONTACT", frausers.getContact());
		
		jdbctemplate.update(insertquery, data);
	}
	
	public void updateData (Frausers frausers) {
		String updatequery = Queries.UPADTE_EMP_DATA;
		Map<String,Object> data = new HashMap<>();
		data.put("EMP_ID", frausers.getEmpId());
		data.put("FIRST_NAME", frausers.getFirstName());
		data.put("LAST_NAME", frausers.getLastName());
		data.put("AGE", frausers.getAge());
		data.put("GENDER", frausers.getGender());
		data.put("LOCATION", frausers.getLocation());
		data.put("EMAIL", frausers.getEmail());
		data.put("CONTACT", frausers.getContact());
		
		jdbctemplate.update(updatequery, data);
	}
	public void deleteAllData() {
		String delectAllQuery = Queries.DELETE_ALL_EMP_DATA;
		Map<String,Object> data = new HashMap<>();
		jdbctemplate.update(delectAllQuery, data);

	}
	public void deleteDataById(Long empId) {
		String deleteById = Queries.DELETE_DATA_BY_ID;		
		Map<String,Object> data = new HashMap<>();
		data.put("EMP_ID", empId);
		jdbctemplate.update(deleteById, data);

	}
	public List<Map<String, Object>> getAllData() {
		String getData = Queries.GET_ALL_DATA;
		Map<String,Object> data = new HashMap<>();
		List<Map<String, Object>> empData = jdbctemplate.queryForList(getData, data);
		return empData;
	}
	public List<Map<String, Object>> getDataById(Long empId) {
		String getById = Queries.GET_DATA_BY_ID;
		Map<String,Object> data = new HashMap<>();
		data.put("EMP_ID", empId);
		List<Map<String, Object>> empIdData = jdbctemplate.queryForList(getById, data);
		return empIdData;
		
}
}
