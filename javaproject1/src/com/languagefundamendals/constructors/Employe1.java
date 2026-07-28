package com.languagefundamendals.constructors;

public class Employe1 {
	int empId;
	String empName;
	double salary;
	 
	Employe1(int empId,String empName,double salary){
		this.empId=empId;
		this.empName=empName;
		this.salary=salary;
	}
	Employe1(Employe1 m,String empName){
		this.empId=m.empId;
		this.empName=empName;
		this.salary=m.salary+10000;
	}

	public static void main(String[] args) {
		System.out.println("-------Employee 1--------");
		Employe1 e=new Employe1(101,"Krishna",50000);
		e.display();
		System.out.println("-------Employee 2----------");
		Employe1 e1=new Employe1(e,"Tiru");
		e1.display();
	}
	void display() {
		System.out.println("Employee Id:"+empId);
		System.out.println("Employee Name:"+empName);
		System.out.println("Salary:"+salary);
		System.out.println();
	}

}
