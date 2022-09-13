package com.mindtree.contact.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.contact.Entity.Contact;
import com.mindtree.contact.Service.ContactService;

@RestController
@RequestMapping("/contact")
public class ContactController {
	@Autowired
	private ContactService contactservice;

	@RequestMapping("/user/{userId}")
	public List<Contact> getcontacts(@PathVariable("userId") long userId) {
		return this.contactservice.getContactsOfUser(userId);

	}

}
