package com.jspider.contactmanager;

import java.util.Scanner;
import com.jspider.contactmanager.business.business;
import com.jspider.contactmanager.business.businessimplement;


public class appmain {
	
	private static business Business = new businessimplement();
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
	boolean flag=true;
		while (flag) {
			System.out.println("*********************************");
		System.out.println("Press 1 for Add contact");
		System.out.println("Press 2 for delete contact");
		System.out.println("Press 3 for Update contact");
		System.out.println("Press 4 for find contact by First name");
		System.out.println("Press 5 for find contact by last name");
		System.out.println("Press 6 for exit");
		System.out.println("Enter your choice");
		
		int choice=scanner.nextInt();
		switch(choice) {
			
		case 1:
			Business.addContact();
			break;
		case 2:
			System.out.println("contact deleted");
			break;
		case 3:
			System.out.println("contact Updated");
			break;
		case 4:
			System.out.println("find contact by First name");
			break;
		case 5:
			System.out.println("find contact by last name");
			break;
		case 6:
			flag=false;
			System.out.println("See you soon");
			break;
		
			default:
				System.out.println("Invalid choice");
		}
	}
}
}
