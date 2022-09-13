package com.mindtree.user.ServiceImpl;

import java.util.ArrayList;
import java.util.Iterator;

import org.springframework.stereotype.Service;

import com.mindtree.user.Entity.User;
import com.mindtree.user.Service.UserService;

@Service
public class ServiceImpl implements UserService {

	public ArrayList<User> user = new ArrayList<User>();

	public ServiceImpl() {
		user.add(new User(1212L, "Virat Kohli", "9876543210"));
		user.add(new User(1213L, "Rohit Sharma", "9876543211"));
		user.add(new User(1214L, "Yuvraj Singh", "9876543212"));
		user.add(new User(1215L, "Irfan Pathan", "9876543213"));
	}

	@Override
	public User getUser(long id) {
		Iterator<User> itr = user.iterator();
		while (itr.hasNext()) {
			User usr = itr.next();
			if (usr.getUserId() == id) {
				return usr;
			}
		}
		return null;
	}

}
