package org.system;

public class Desktop extends Computer {
	
	public void Desktopsize() {
		System.out.println("Desktop Siz : 14' inch");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Desktop obj = new Desktop();
        System.out.println("Single Inheritance call");
        obj.ComputerModel();
        obj.Desktopsize();
        
        		
		
	}

}
