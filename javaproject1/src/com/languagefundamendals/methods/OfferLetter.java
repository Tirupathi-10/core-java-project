package com.languagefundamendals.methods;

public class OfferLetter {
	String name(String Name) {
		return Name;
	}
	String email(String Email) {
		return Email;
	}
	long phnum(long Number) {
		return Number;
	}
	String address(String Address) {
		return Address;
	}
	String qualification(String Qualification) {
		return Qualification;
	}
	String company(String Company) {
		return Company;
	}
	String cmpyaddress(String CompanyAddress) {
		return CompanyAddress;
	}
	String cmpMail(String mail) {
		return mail;
	}
	long cmpNumber(long CNumber) {
		return CNumber;
	}
	String cmpwebsite(String Web) {
		return Web;
	}
	String designation(String Designation) {
		return Designation;
	}
	String department(String Department) {
		return Department;
	}
	String empType(String type) {
		return type;
	}
	String location(String Loc) {
		return Loc;
	}
	String rptManager(String RManager) {
		return RManager;
	}
	String join(String Join) {
		return Join;
	}
	double salary(double BasicSalary) {
		return BasicSalary;
	}
	double hraAllowance(double HRAAllowance) {
		return HRAAllowance;
	}
	double specialAllowance(double SPLAllowance) {
		return SPLAllowance;
	}
	double medical(double Medical) {
		return Medical;
	}
	double travel(double Travel) {
		return Travel;
	}
	double bonus(double Bonus) {
		return Bonus;
	}
	double annualSalary(double BasicSalary,double HRAAllowance,
			double SPLAllowance,double Medical,double Travel, double Bonus) {
		return (BasicSalary+HRAAllowance+SPLAllowance+Medical+Travel+Bonus)*12;
	}
	double grossSalary(double AnnualSalary) {
		return AnnualSalary/12;
	}
	double netSalary(double GrossSalary) {
		return GrossSalary;
	}
	
	public static void main(String[] args) {
		System.out.println("--------OFFER LETTER-----------");
		OfferLetter o=new OfferLetter();
		String Name=o.name("Tirupathi");
		String email=o.email("tirupathi@gmail.com");
		long number= o.phnum(9876543201l);
		String address=o.address("vizag ,Ap");
		String Qual=o.qualification("MCA");
		String cname=o.company("Infosys");
		String cmpadd=o.cmpyaddress("Chennai");
		String mail=o.cmpMail("infosys@gmail.com");
		long cnum=o.cmpNumber(9876543432l);
		String web=o.cmpwebsite("www.infosys.com");
		String deg=o.designation("Java Developer");
		String depart=o.department("Software Development");
		String emptype=o.empType("Full-Time");
		String loc=o.location("Bengaluru");
		String rm=o.rptManager("John");
		String jd=o.join("22-sep-2026");
		double bs=o.salary(55000);
		double ha=o.hraAllowance(20000);
		double spla=o.specialAllowance(15000);
		double medical=o.medical(10000);
		double travel=o.travel(5000);
		double bonus=o.bonus(3000);
		double annual=o.annualSalary(bs, ha, spla, medical, travel, bonus);
		double gross=o.grossSalary(annual);
		double net=o.netSalary(gross);
		
		System.out.println("-------Candidate Details---------");
		System.out.println("Candidate Name           : "+Name);
		System.out.println("Candidate Email          : "+email);
		System.out.println("Candidate Number         : "+number);
		System.out.println("Candidate Address        : "+address);
		System.out.println("Candidate Qualification  : "+Qual);
		System.out.println();
		System.out.println("--------Company Details---------");
		System.out.println("Company Name             : "+cname);
		System.out.println("Company Address          : "+cmpadd);
		System.out.println("Company Mail             : "+mail);
		System.out.println("Company Number           : "+cnum);
		System.out.println("Company Website          : "+web);
		System.out.println();
		System.out.println("---------Join Details-----------");
		System.out.println("Designation              : "+deg);
		System.out.println("Department               : "+depart);
		System.out.println("Employee Type            : "+emptype);
		System.out.println("Work Location            : "+loc);
		System.out.println("Report Manager           : "+rm);
		System.out.println("Joining Date             : "+jd);
		System.out.println();
		System.out.println("----------Salary Details--------");
		System.out.println("Basic Salary             : "+bs);
		System.out.println("HRA Allowance            : "+ha);
		System.out.println("Special Allowance        : "+spla);
		System.out.println("Medical Allowance        : "+medical);
		System.out.println("Travel Allowance         : "+travel);
		System.out.println("Bonus                    : "+bonus);
		System.out.println("Annual CTC               : "+annual);
		System.out.println("Gross salary             : "+gross);
		System.out.println("Net salary               : "+net);

		

	}

}
