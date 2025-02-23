package com.jspider.contactmanager.data;

import com.jspider.contactmanager.entity.contact;

public interface data {
	
	void addContact(contact contact);
	
	static void deleteContact(int id) {
		// TODO Auto-generated method stub
		
	}
	
	contact findContactById(int id);
	
	contact [] findALLContact();
	

}
