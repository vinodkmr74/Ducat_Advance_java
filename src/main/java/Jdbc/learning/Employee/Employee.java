package Jdbc.learning.Employee;

public class Employee {
	
		private int id;
		private String name;
		private String address;
		private String depatment;
		 
		
		
		
		public Employee() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Employee(int id, String name, String address, String depatment) {
			super();
			this.id = id;
			this.name = name;
			this.address = address;
			this.depatment = depatment;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public String getDepatment() {
			return depatment;
		}
		public void setDepatment(String depatment) {
			this.depatment = depatment;
		}
		@Override
		public String toString() {
			return "Employee [id=" + id + ", name=" + name + ", address=" + address + ", depatment=" + depatment
					+ ", getId()=" + getId() + ", getName()=" + getName() + ", getAddress()=" + getAddress()
					+ ", getDepatment()=" + getDepatment() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
					+ ", toString()=" + super.toString() + "]";
		}
		
		
			
		

}
