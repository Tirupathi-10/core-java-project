package com.languagefundamendals.constructors;

public class Company {
	String name;
	int id;
	String loc;
	
	Company(String name,int id,String loc){
		this .name=name;
		this.id=id;
		this.loc=loc;
	}
	public static void main(String[] args) {
		Employee e1=new Employee("Infosys",123,"Vizag","Tiru",12);
		e1.display();
		Employee e2= new Employee("tcs",345,"hyd","Sai",23);
		e2.display();
		
	}
	void display() {
		System.out.println("Name of the Company:"+name);
		System.out.println("ID of the Company:"+id);
		System.out.println("Location of the Company:"+loc);
	}
}

class Employee extends Company {
	String ename;
	int eid;
	Employee(String name,int id,String loc,String ename,int eid){
		super(name,id,loc);
		this.ename=ename;
		this.eid=eid;
	}
	void display() {
		super.display();
		System.out.println("name of the Employee:"+ename);
		System.out.println("ID of the employee:"+eid);
		System.out.println();
	}
}
	
