package Jdbc.learning.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Jdbc.learning.Employee.Employee;

public class EmployeeDaoImpl implements EmployeeDao 
{
	static Connection con=null;
	
	static {
		
	 try {
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","root");		
//		 Statement st=con.createStatement();
//		st.executeUpdate("create table employee(id int primary key,name varchar(50),address varchar(60),depatment varchar(50))");
//			 
//		System.out.println(" table Seccefully ");
			 
	} catch (SQLException e) {
		e.printStackTrace();
	}
	}

	@Override
	public void saveEmployee(Employee e) {
		
		try {
		Statement st=	con.createStatement();
		st.executeUpdate("insert into employee(id,name,address,depatment) values("+e.getId()+",'"+e.getName()+"','"+e.getAddress()+"','"+e.getDepatment()+"')");
		System.out.println("done.........");
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		
	}

	@Override
	public void updateeEmployee(Employee e) {
		
		try {
			Statement st=con.createStatement();
			st.executeUpdate("update employee set name='"+e.getName()+"'where id='"+e.getId()+"'");
			
			System.out.println("seccefully update");		
			
			
		} catch (SQLException e1) {
		
			e1.printStackTrace();
		}
		
	}

	

	@Override
	public void deleteEmployee(Employee e) {
	try {
		Statement st=con.createStatement();
		
		st.executeUpdate("delete from employee where id='"+e.getId()+"'");
		System.out.println("seccsefully delete");
		st.close();
	} catch (SQLException e1) {
	
		e1.printStackTrace();
	}
		
	}

	@Override
	public void getAllEmployees() {
		
		try {
			Statement st= con.createStatement();
		ResultSet ra=st.executeQuery("Select * from employee");
		
		while(ra.next())
		{
			System.out.println("id: "+ra.getInt(1)+"\t name: "+ra.getString(2)+"\t address: "+ra.getString(3)+"\t depatment: "+ra.getString(4)+"");
			
		}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void getEmployeeByName(String name) {
		// TODO Auto-generated method stub
		
	}

}
