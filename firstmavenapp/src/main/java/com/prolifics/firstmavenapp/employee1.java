package com.prolifics.firstmavenapp;
	class employee1 extends person{
		private int empid;
		private double salary;
		private String orgname;
		public employee1() {}
		public employee1(int ssn, String name, int age,int empid, double salary, String orgname) {
//			super(ssn,name,age);
			this.empid = empid;
			this.salary = salary;
			this.orgname = orgname;
		}
		public int getEmpid() {
			return empid;
		}
		public void setEmpid(int empid) {
			this.empid = empid;
		}
		public double getSalary() {
			return salary;
		}
		public void setSalary(double salary) {
			this.salary = salary;
		}
		public String getOrgname() {
			return orgname;
		}
		public void setOrgname(String orgname) {
			this.orgname = orgname;
		}
		
		
	}
