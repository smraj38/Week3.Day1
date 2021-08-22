package org.student;

public class AxisBank extends BankInfo {
	
	public void deposit() {
		System.out.println("I have deposit accouunt in ICICI bank");
		
	}
	public static void main(String[] args) {
		AxisBank obj = new AxisBank();
		System.out.println("used Method overriding");
		obj.deposit(); //Used Method overriding 
		obj.fixed();
		obj.savings();
	}
	
}
