package Jdbc.larning;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import Jdbc.learning.Dao.EmployeeDao;
import Jdbc.learning.Dao.EmployeeDaoImpl;
import Jdbc.learning.Employee.Employee;



public class Main1 {
	
	public static void main(String args[]) throws SQLException
	{
		
		Employee e1=new Employee(1,"sashi", "noida", "mca");
		Employee e2=new Employee(2,"rahul", "noida", "mca");
		Employee e3=new Employee(3,"vishal", "noida", "mca");
		Employee e4=new Employee(4,"pappu", "noida", "mca");
		
		//Employee e5=new Employee();
		//update
		//e5.setName("Avinash");
		//e5.setId(1);
	
		//delete
		//Employee e6=new Employee();
		//e5.setId(3);


		
		EmployeeDao edao=new EmployeeDaoImpl();
		edao.saveEmployee(e1);
		edao.saveEmployee(e2);
		edao.saveEmployee(e3);
		edao.saveEmployee(e4);
		
		//edao.getAllEmployees();
		//edao.updateeEmployee(e5);
		
		//edao.deleteEmployee(e5);
		
		System.out.println("main seccefull......");
		
		
		
		
//		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","root");
//		//System.out.println("connection seccefully");
//		
//		Statement stt= con.createStatement();
//		System.out.println("statement seccefully");
//
//		stt.executeUpdate("insert into employee(id,name,address,depatment) values(1,'avinash','noid','admission')");
//		System.out.println(" insert seccefully");
//		stt.close();
//		con.close();

		//DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","root").createStatement().executeUpdate("insert into employee(id,name,address,depatment)values(3,'vinod','delhi','manager')");
		//System.out.println("done........");
		
		
		
	}
	

}
