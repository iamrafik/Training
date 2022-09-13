package com.mindtree.contact.ServiceImpl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;

import com.mindtree.contact.Entity.Contact;
import com.mindtree.contact.Service.ContactService;

@Service
public class ContactserviceImpl implements ContactService {

	ArrayList<Contact> contact = new ArrayList<Contact>();

	public ContactserviceImpl() {
		contact.add(new Contact(1L, "Amisha@gmail.com", "Amisha", 1212L));
		contact.add(new Contact(2L, "Asha@gmail.com", "Asha", 1213L));
		contact.add(new Contact(3L, "Akira@gmail.com", "Akira", 1214L));
		contact.add(new Contact(4L, "Amit@gmail.com", "Amit", 1215L));
	}

	@Override
	public List<Contact> getContactsOfUser(long userId) {
		List<Contact> contactList = new ArrayList<Contact>();
		Iterator<Contact> itr = contact.iterator();
		while (itr.hasNext()) {
			Contact con = itr.next();
			if (con.getUserId() == userId) {
				contactList.add(con);
			}
		}
		return contactList;
	}

}
