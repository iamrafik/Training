package com.mindtree.contact.Service;

import java.util.List;

import com.mindtree.contact.Entity.Contact;

public interface ContactService {
	public List<Contact> getContactsOfUser(long userId);

}
