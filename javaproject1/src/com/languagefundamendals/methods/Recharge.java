package com.languagefundamendals.methods;

public class Recharge {
	
	

	void main(String[] args) {
		
		showPlanDetails();
		recharge(299);
	}
		void showPlanDetails() {
			System.out.println("Current Recharge Plan");
			System.out.println("Plan Name: Unlimited 299");
			System.out.println("Validity: 28 Days");
			System.out.println("Data: 1.5 GB/day");
			System.out.println("calls: Unlimited");
			System.out.println();
			
		}
		void recharge(double amount) {
			System.out.println("Recharge Successfully");
			System.out.println("Recharge Amount: "+amount);
		}
	

}
