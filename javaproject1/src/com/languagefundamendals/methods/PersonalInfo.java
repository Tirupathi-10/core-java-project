package com.languagefundamendals.methods;

public class PersonalInfo {

	void main(String[] args) {
		System.out.println("main method started");
		getName("Tirupathi");
		getAge(24);
		getGender('M');
		getcity("vizag");
		getstate("AP");
		getpincode(535546);
		college("Aditya College","Samalkot");
		course("MCA");
		percentage(79.6);
		psy(2026);
		bankName("State Bank of India");
		accNum(62788727272l);
		balance(15000.00);
		ifscCode("SBIN820200");
		bankLocation("Vizag");
		System.out.println("main methid ended");
	}
	void getName(String name) {
		System.out.println("Name: "+name);
	}
	void getAge(int age) {
		System.out.println("Age: "+age);
	}
	void getGender(char G) {
		System.out.println("Gender: "+G);
	}
	void getcity(String city) {
		System.out.println("City: "+city);
	}
	void getstate(String state) {
		System.out.println("State: "+state);
	}
	void getpincode(int pincode) {
		System.out.println("Pincode: "+pincode);
		System.out.println();
	}
	void college(String college,String location) {
		System.out.println("-----College Details----");
		System.out.println("Colege Name: "+college+","+location);
	}
	void course(String course) {
		System.out.println("Course: "+course);
	}
	void percentage(double percent) {
		System.out.println("Percentage: "+percent);
	}
	void psy(int year) {
		System.out.println("Passout Year: "+year);
		System.out.println();
	}
	void bankName(String name) {
		System.out.println("--------Bank Details------");
		System.out.println("Bank Name: "+name);
	}
	void accNum(long acNum) {
		System.out.println("Account Number: "+acNum);
	}
	void balance(double blnc) {
		System.out.println("Account Balance: "+blnc);
	}
	void ifscCode(String code) {
		System.out.println("IFSC Code: "+code);
	}
	void bankLocation(String location) {
		System.out.println("Bank Location: "+location);
	}
}
