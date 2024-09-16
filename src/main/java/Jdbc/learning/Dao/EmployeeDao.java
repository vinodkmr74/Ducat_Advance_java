package Jdbc.learning.Dao;

import Jdbc.learning.Employee.Employee;

public interface EmployeeDao {
	
	public void saveEmployee(Employee e);
	
	public void updateeEmployee(Employee e);
	
	public void deleteEmployee(Employee e);
	
	public void getAllEmployees();
	
	public void getEmployeeByName(String name);

}
