package com.apac.frausers.queries;

public class Queries {
	
	public static String INSERT_EMP_DATA = "INSERT INTO employee_data (emp_id, first_name, last_name, age, gender, location, email, contact)"
			+ " VALUES (:EMP_ID, :FIRST_NAME, :LAST_NAME, :AGE, :GENDER, :LOCATION, :EMAIL, :CONTACT)";
	
	public static String UPADTE_EMP_DATA ="UPDATE employee_data SET first_name = :FIRST_NAME, last_name = :LAST_NAME, age = :AGE, gender= :GENDER, location = :LOCATION, email = :EMAIL, contact = :CONTACT "
			+ "WHERE emp_id= :EMP_ID";
	public static String DELETE_ALL_EMP_DATA ="DELETE FROM employee_data";
	
	public static String DELETE_DATA_BY_ID ="DELETE FROM employee_data WHERE emp_id= :EMP_ID";
	public static String GET_ALL_DATA ="SELECT * FROM employee_data";
	public static String GET_DATA_BY_ID ="SELECT * FROM employee_data WHERE emp_id= :EMP_ID";
}
