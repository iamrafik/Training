package com.mindtree.College.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mindtree.College.Entity.College;
import com.mindtree.College.StudentAndTemplate.RequestTemplate;

@Service
public interface CollegeService {

	College add(College coll);

	List<College> list();

	College searchById(int colId);

	List<RequestTemplate> colListWithStudent();

	RequestTemplate specificColByStudent(int colId);

}
