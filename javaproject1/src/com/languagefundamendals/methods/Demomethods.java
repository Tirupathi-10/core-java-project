package com.languagefundamendals.methods;
import java.util.Scanner;

public class Demomethods {
	void name(String fname,String lname) {
		System.out.println("Employee Full Name: "+fname+" "+lname);
	}
	void age(int age) {
		System.out.println("Age of the Employeee: "+age);
	}
	void salaryInfo(double salary) {
		System.out.println("Emplyoee Salary: "+salary);
	}
	void heightandWeihgt(float height,int weight) {
		System.out.println("Employee Height: "+height);
		System.out.println("Employee weight: "+weight);
	}
	void gender(char gender) {
		System.out.println("Gender of the Employee: "+gender);
	}
	static void experience(int exp) {
		System.out.println("Employee Experience: "+exp+"years");
		System.out.println();
	}
	void bankName(String bname,long acnum,String IFSCcode,double acblnc) {
		System.out.println("Employee Bank Details");
		System.out.println("Name of the Bank: "+bname);
		System.out.println("Employee Account Number: "+acnum);
		System.out.println("IFSC code: "+IFSCcode);
		System.out.println("Account Balance: "+acblnc);
	}
	void marriedStatus(String status) {
		System.out.println("Employee Married Status: "+status);
	}
	void empId(int ID) {
		System.out.println("Employee Id: "+ID);
	}
	void empPFnum(long num) {
		System.out.println("Employee PF Account Number: "+num);
	}
	void empPfAmount(double amount) {
		System.out.println("Employee PF Amount: "+amount);
	}
	void empPFblnc(double Pfblnc) {
		System.out.println("Employeee PF amount Balance: "+Pfblnc);
	}
	void empHIstatus(String histatus) {
		System.out.println("Employee Health Insurance Status: "+histatus);
	}
	void empdept(String dept) {
		System.out.println("Employeee Department Name: "+dept);
	}
	void deptId(int deptId) {
		System.out.println("Department Id: "+deptId);
	}
	void company(String cmpName) {
		System.out.println("Employe Company Name: "+cmpName);
	}
	void companyLocation(String location) {
		System.out.println("Company Location: "+location);
	}
	void pincode(int pincode) {
		System.out.println("Pincode: "+pincode);
	}
	void empvechile(String vechileName) {
		System.out.println("Employe Vecile Name: "+vechileName);
	}
	void vechileType(String type) {
		System.out.println("Employee Vechile type: "+type);
	}
	public static void main(String[] args) {
		System.out.println("main method started");
		Demomethods dm=new Demomethods();
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the First name: ");
		String s=sc.nextLine();
		System.out.println("Enter the Second Name: ");
		String s1=sc.nextLine();
		System.out.println("Enter the Age: ");
		int a=sc.nextInt();
		System.out.println("Enter the Salary: ");
		double d=sc.nextDouble();
		System.out.println("Enter the height: ");
		float f=sc.nextFloat();
		System.out.println("Enter the Weihgt: ");
		double d1=sc.nextDouble();
		int weight=(int)d1;
		System.out.println();
		System.out.println("Enter the Gender: ");
		char c =sc.next().charAt(0);
		System.out.println("Enter the Experience: ");
		int exp=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the bank name: ");
		String bname=sc.nextLine();
		System.out.println("Enter the Account Number: ");
		long acnum=sc.nextLong();
		sc.nextLine();
		System.out.println("Enter the IFSC code : ");
		String ifsc=sc.nextLine();
		System.out.println("Balance: ");
		double blnc=sc.nextDouble();
		sc.nextLine();
		System.out.println("Married Status: ");
		String mstatus= sc.nextLine();
		System.out.println("Enter the Employee Id: ");
		int id=sc.nextInt();
		System.out.println("Enter the PF Account Number: ");
		long pfnum=sc.nextLong();
		System.out.println("Enter the Pf amount: ");
		double pfamount=sc.nextDouble();
		System.out.println("PF Balance: ");
		double pfblnc=sc.nextDouble();
		sc.nextLine();
		System.out.println("Health Insurance Status: ");
		String health=sc.nextLine();
		System.out.println("enter the department name: ");
		String deptName=sc.nextLine();
		System.out.println("Department Id: ");
		int deptId=sc.nextInt();
		System.out.println("enter the company Name: ");
		String cName=sc.nextLine();
		sc.nextLine();
		System.out.println("Company Location: ");
		String loc=sc.nextLine();
		System.out.println("pincode: ");
		int pin=sc.nextInt();
		System.out.println("Enter the Vechile Name: ");
		String vechileName=sc.nextLine();
		System.out.println("Enter the Vechile Type: ");
		String type=sc.nextLine();
		dm.name(s,s1);
		dm.age(a);
		dm.salaryInfo(d);
		dm.heightandWeihgt(f,weight);
		dm.gender(c);
		experience(exp);
		dm.bankName(bname, acnum, ifsc, blnc);
		dm.marriedStatus(mstatus);
		dm.empId(id);
		dm.empPFnum(pfnum);
		dm.empPfAmount(pfamount);
		dm.empPFblnc(pfblnc);
		dm.empHIstatus(health);
		dm.empdept(deptName);
		dm.deptId(deptId);
		dm.company(cName);
		dm.companyLocation(loc);
		dm.pincode(pin);
		dm.empvechile(vechileName);
		dm.vechileType(type);
		System.out.println("main method ended!!!");
		
	}

}
