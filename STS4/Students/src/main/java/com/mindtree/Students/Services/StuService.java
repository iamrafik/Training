package com.mindtree.Students.Services;

import java.util.ArrayList;
import org.springframework.stereotype.Service;
import com.mindtree.Students.entity.Student;


@Service
public interface StuService {

	
	public ArrayList<Student> getAll();
	Student byId(int id);
}
