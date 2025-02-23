package com.jspider.contactmanager.business;

import java.util.Scanner;

import com.jspider.contactmanager.data.data;
import com.jspider.contactmanager.entity.contact;

public class businessimplement implements business {

	
	Scanner scanner =new Scanner (System.in);
	
	private int id=0;
	
	@Override
	public void addContact() {
		System.out.println("Enter first name");
		String firstname=scanner.next();
		System.out.println("Enter Last name");
		String lastname=scanner.next();
		System.out.println("Enter mobile number");
		int mobile=scanner.nextInt();
		System.out.println("Enter work number");
		int work=scanner.nextInt();
		System.out.println("Enter email");
		String email=scanner.next();
		
		contact Contact=new contact(id(),firstname,lastname,mobile,work,email);
		
		
		System.out.println(Contact);
	}

	@Override
	public void deleteContact() {
		System.out.println("enter id ");
		int id=scanner.nextInt();
		
		data.deleteContact(id);
		
		
	}

	@Override
	public void updateContact() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void findContactByFirstName() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void findContactByLastName() {
		// TODO Auto-generated method stub
		
	}
	public int id() {
		return ++id;
	}

}
